package comp5111.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;

public class CoverageStats {
    private int coefficient = 0;

    public CoverageStats(String coefficient) {
        switch (coefficient) {
        case "Jaccard":
            this.coefficient = 0;
            break;
        case "Tarantula":
            this.coefficient = 1;
            break;
        case "AMPLE":
            this.coefficient = 2;
            break;
        case "Ochiai":
            this.coefficient = 3;
            break;
        default:
            System.out.println("Incorrect coefficient calculation method " + coefficient);
            System.exit(-1);
        }
    }

    private double getScore(int n_ef, int n_es, int n_f, int n_s) {
        switch (coefficient) {
        case 0:
            return jaccard(n_ef, n_es, n_f, n_s);
        case 1:
            return tarantula(n_ef, n_es, n_f, n_s);
        case 2:
            return ample(n_ef, n_es, n_f, n_s);
        case 3:
            return ochiai(n_ef, n_es, n_f, n_s);
        default:
            // not reachable
            return 0;
        }
    }

    private HashMap<String, HashMap<Integer, Integer[]>> stats = new HashMap<>();

    private class LineInfo {
        String statement;
        String signature;
        double suspiciousScore;
        int rank;

        public LineInfo(String statement, String signature, double score) {
            this.statement = statement;
            this.signature = signature;
            this.suspiciousScore = score;
            this.rank = 0;
        }

        public double getSuspiciousScore() {
            return suspiciousScore;
        }

        public String getStrRepr() {
            return signature + statement;
        }

        public String getCsvLine() {
            return String.format("\"%s\",\"%s\",%.4f,%d", signature.replace("\"", "\"\""),
                    statement.replace("\"", "\"\""), suspiciousScore, rank);
        }
    }

    private void checkMethod(String method, int success, HashMap<String, ArrayList<Integer>> indexMap) {
        ArrayList<Integer> methodIndexMap = indexMap.get(method);
        if (!stats.containsKey(method)) {
            stats.put(method, new HashMap<Integer, Integer[]>());
        }
        HashMap<Integer, Integer[]> methodStat = stats.get(method);
        for (int i = 0; i < methodIndexMap.size(); i++) {
            int index = methodIndexMap.get(i);
            if (index == -1)
                continue;
            if (CoverageChecker.coverage.size() > index && CoverageChecker.coverage.get(index)) {
                // covered
                if (methodStat.containsKey(i)) {
                    methodStat.get(i)[success] += 1;
                } else {
                    Integer[] count = { 0, 0 };
                    count[success] += 1;
                    methodStat.put(i, count);
                }
            }
        }
    }

    public void calCoverage(boolean success, HashMap<String, ArrayList<Integer>> indexMap) {
        String[] methods = indexMap.keySet().toArray(new String[indexMap.size()]);
        int successInt = success ? 1 : 0;
        for (String method : methods) {
            checkMethod(method, successInt, indexMap);
        }
    }

    // a11 = n_ef
    // a10 = n_es
    // a01 = n_f - n_ef
    // a00 = n_s - n_es
    private double ochiai(int n_ef, int n_es, int n_f, int n_s) {
        return ((double) n_ef) / Math.sqrt(n_f * (n_ef + n_es));
    }

    private double jaccard(int n_ef, int n_es, int n_f, int n_s) {
        double a11 = n_ef;
        double a10 = n_es;
        double a01 = n_f - n_ef;
        double a00 = n_s - n_es;

        return a11 / (a11 + a01 + a10);
    }

    private double tarantula(int n_ef, int n_es, int n_f, int n_s) {
        double a11 = n_ef;
        double a10 = n_es;
        double a01 = n_f - n_ef;
        double a00 = n_s - n_es;

        double x = a11 / (a11 + a01);
        double y = a10 / (a10 + a00);
        return x / (x + y);
    }

    private double ample(int n_ef, int n_es, int n_f, int n_s) {
        double a11 = n_ef;
        double a10 = n_es;
        double a01 = n_f - n_ef;
        double a00 = n_s - n_es;

        return Math.abs(a11 / (a01 + a11) - a10 / (a00 + a10));
    }

    public void report(int successes, int failures, List<String> source, FileWriter writer) throws IOException {
        ArrayList<LineInfo> result = new ArrayList<>();
        for (String method : stats.keySet()) {
            HashMap<Integer, Integer[]> methodStat = stats.get(method);
            for (int n : methodStat.keySet()) {
                Integer[] counts = methodStat.get(n);
                double s = getScore(counts[0], counts[1], failures, successes);
                String statement = source.get(n - 1).trim();
                result.add(new LineInfo(statement, method, s));
            }
        }
        result.sort(Comparator.comparingDouble(LineInfo::getSuspiciousScore).thenComparing(LineInfo::getStrRepr));
        double currentScore = 0;
        int length = result.size();
        for (int i = 0; i < length;) {
            currentScore = result.get(i).suspiciousScore;
            int j = i + 1;
            for (; j < length && result.get(j).suspiciousScore == currentScore; j++)
                ;
            int n = length - j;
            int m = length - i;
            int rank = (n + m + 1) / 2;
            for (int k = i; k < j; k++)
                result.get(k).rank = rank;
            i = j;
        }
        for (int i = length - 1; i >= 0; i--) {
            LineInfo info = result.get(i);
            writer.write(info.getCsvLine());
            writer.write("\n");
        }
    }
}
