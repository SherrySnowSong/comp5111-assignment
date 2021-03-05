package comp5111.assignment;

import java.util.ArrayList;

public class CoverageChecker {
	public static ArrayList<Boolean> coverage = new ArrayList<Boolean>();
	
	public static synchronized void cover(int n) {
		for (int i = coverage.size(); i <= n; i++)
			coverage.add(false);
		coverage.set(n, true);
	}
	
	public static synchronized int sum() {
		int sum = 0;
		for (Boolean x : coverage) {
			if (x)
				sum++;
		}
		return sum;
	}
}
