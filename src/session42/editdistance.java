package session42;

public class editdistance {

	public static void main(String[] args) {
		System.out.println(editdistance("horse", "ros", 0, 0));
	}

	public static int editdistanceBU(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < dp[0].length; i++) {
			dp[0][i] = i;

		}
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = i;

		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					ans = dp[i - 1][j - 1];
				} else {
					int Delete = dp[i - 1][j];
					int Insert = dp[i][j - 1];
					int Replace = dp[i - 1][j - 1];
					ans = Math.min(Replace, Math.min(Insert, Delete)) + 1;
				}
				dp[i][j] = ans;

			}

		}

		return dp[s1.length()][s2.length()];

	}

	public static int editdistance(String word1, String word2, int i, int j) {
		if (i == word1.length()) {
			return word2.length() - j;
		}
		if (j == word2.length()) {
			return word1.length() - i;
		}

		int ans = 0;
		if (word1.charAt(i) == word2.charAt(j)) {
			ans = editdistance(word1, word2, i + 1, j + 1);
		} else {
			int insert = editdistance(word1, word2, i, j + 1);
			int delete = editdistance(word1, word2, i + 1, j);
			int replace = editdistance(word1, word2, i + 1, j + 1);
			ans = Math.min(insert, Math.min(delete, replace)) + 1;
		}
		return ans;
	}

	public static int editdistance(String word1, String word2, int i, int j,
			int[][] strg) {
		if (i == word1.length()) {
			return word2.length() - j;
		}
		if (j == word2.length()) {
			return word1.length() - i;
		}
		if (strg[i][j] != 0)
			return strg[i][j];

		int ans = 0;
		if (word1.charAt(i) == word2.charAt(j)) {
			ans = editdistance(word1, word2, i + 1, j + 1, strg);
		} else {
			int insert = editdistance(word1, word2, i, j + 1, strg);
			int delete = editdistance(word1, word2, i + 1, j, strg);
			int replace = editdistance(word1, word2, i + 1, j + 1, strg);
			ans = Math.min(insert, Math.min(delete, replace)) + 1;
		}
		return strg[i][j] = ans;
	}

}
