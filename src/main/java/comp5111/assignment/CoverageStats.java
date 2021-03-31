package comp5111.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class CoverageStats {
    private HashMap<String, HashMap<Integer, Integer[]>> stats = new HashMap<>();

    private class LineInfo {
        int lineNum;
        String signature;
        double suspeciousScore;
        int rank;

        public LineInfo(int lineNum, String signature, double score) {
            this.lineNum = lineNum;
            this.signature = signature;
            this.suspeciousScore = score;
            this.rank = 0;
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
        int successInt = success? 1 : 0;
        for (String method : methods) {
            checkMethod(method, successInt, indexMap);
        }
    }

    private double ochiai(int n_ef, int n_es, int n_f, int n_s) {
        return ((double)n_ef) / Math.sqrt(n_f * (n_ef + n_es));
    }

    public void report(int successes, int failures) {
        ArrayList<LineInfo> result = new ArrayList<>();
        for (String method : stats.keySet()) {
            HashMap<Integer, Integer[]> methodStat = stats.get(method);
            for (int n : methodStat.keySet()) {
                Integer[] counts = methodStat.get(n);
                double s = ochiai(counts[0], counts[1], failures, successes);
                result.add(new LineInfo(n, method, s));
            }
        }
        result.sort(Comparator.comparingDouble(l -> l.suspeciousScore));
        double currentScore = 0;
        int length = result.size();
        for (int i = 0; i < length;) {
            currentScore = result.get(i).suspeciousScore;
            int j = i + 1;
            for (; j < length && result.get(j).suspeciousScore == currentScore; j++);
            int n = length - j;
            int m = length - i;
            int rank = (n + m + 1) / 2;
            for (int k = i; k < j; k++)
                result.get(k).rank = rank;
            i = j;
        }
        for (int i = 0; i < length; i++) {
            LineInfo info = result.get(i);
            String output = String.format("%.4f, %3d, %4d, %s", info.suspeciousScore, info.rank, info.lineNum, info.signature);
            System.out.println(output);
        }
    }
}
