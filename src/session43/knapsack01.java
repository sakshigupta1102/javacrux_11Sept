package session43;

public class knapsack01 {
	public static void main(String[] args) {

	}
	public static int Knapsack(int wt[], int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if (dp[cap][i] != -1) {
			return dp[cap][i];
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + Knapsack(wt, val, cap - wt[i], i + 1, dp);
		}
		exc = Knapsack(wt, val, cap, i + 1, dp);
		return dp[cap][i] = Math.max(inc, exc);

	}
	public static int KnapsackBU(int wt[], int[] val, int cap) {
		int[][] dp = new int[cap + 1][wt.length + 1];
		for (int c = 1; c < dp.length; c++) {

			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0;
				int exc = 0;
				if (c >= wt[i - 1]) {
					inc = val[i - 1] + dp[c - wt[i - 1]][i - 1];
				}
				exc = dp[c][i - 1];
				dp[c][i] = Math.max(inc, exc);
			}

		}
		return dp[cap][wt.length];

	}
	
	
	
	
	
	
}
