package comp5111.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.io.FileWriter;
import java.io.IOException;

public class CoverageReporter {
	private HashMap<String, ArrayList<Integer>> indexMap;
	private String[] classes;
	
	private class CoverageInfo {
		public int total;
		public int covered;
		public ArrayList<Integer> coveragePair;
		
		public CoverageInfo(int total, int covered, ArrayList<Integer> coveragePair) {
			this.total = total;
			this.covered = covered;
			this.coveragePair = coveragePair;
		}
	}
	
	public CoverageReporter(HashMap<String, ArrayList<Integer>> indexMap, String[] classes) {
		this.indexMap = indexMap;
		this.classes = classes;
	}
	
	private CoverageInfo reportMethod(String method) {
		ArrayList<Integer> realIndexMap = indexMap.get(method);
		ArrayList<Integer> coveragePair = new ArrayList<>();
		int total = 0;
		int covered = 0;
		for (int i = 0; i < realIndexMap.size(); i++) {
			int index = realIndexMap.get(i);
			if (index == -1)
				continue;
			total++;
			coveragePair.add(i);
			if (CoverageChecker.coverage.get(index)) {
				// covered
				coveragePair.add(1);
				covered++;
			} else {
				coveragePair.add(0);
			}
		}
		return new CoverageInfo(total, covered, coveragePair);
	}
	
	public void report(FileWriter writer) throws IOException {
		String[] methods = indexMap.keySet().toArray(new String[indexMap.size()]);
		int[] classTotal = new int[classes.length];
		int[] classCovered = new int[classes.length];
		
		writer.write("{\n  \"detailed\":{\n");
		Arrays.sort(methods);
		boolean firstMethod = true;
		for (String method : methods) {
			if (!firstMethod) {
				writer.write(",\n");
			}
			firstMethod = false;
			CoverageInfo info = reportMethod(method);
			for (int i = 0; i < classes.length; i++) {
				String c = classes[i];
				// this would also consider inner classes
				if (method.substring(1).startsWith(c)) {
					classTotal[i] += info.total;
					classCovered[i] += info.covered;
				}
			}
			// write as JSON
			// I should probably use a library, but I'm just too lazy
			writer.write("    \"" + method + "\": {");
			boolean first = true;
			boolean key = true;
			for (int i : info.coveragePair) {
				if (!first && key) {
					writer.write(", ");
				}
				writer.write(String.valueOf(i));
				if (key) {
					writer.write(": ");
				} else {
					first = false;
				}
				key = !key;
			}
			writer.write("}");
		}
		writer.write("\n  },\n  \"coverage\": {\n");
		for (int i = 0; i < classes.length; i++) {
			double percentage = 100;
			if (classTotal[i] != 0) {
				percentage = (double)classCovered[i] / (double)classTotal[i] * 100.0;
			}
			writer.write("    \"" + classes[i] + "\": {\n");
			writer.write("      \"covered\": " + classCovered[i] + ",\n");
			writer.write("      \"total\": " + classTotal[i] + ",\n");
			writer.write("      \"percentage\": " + percentage + "\n    }");
			if (i + 1 != classes.length) {
				writer.write(",\n");
			} else {
				writer.write("\n  }\n}\n");
			}
		}
	}
}
