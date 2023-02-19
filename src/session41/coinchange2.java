package session41;

public class coinchange2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5 };
		System.out.println(CoinChangesBU(arr, 5));
	}

	public static int coinchange2(int[] coin, int amt, int i) {
		if (amt == 0)
			return 1;
		if (i >= coin.length)
			return 0;
		int inc = 0;
		int exc = 0;
		if (amt >= coin[i]) {
			inc = coinchange2(coin, amt - coin[i], i);
		}
		exc = coinchange2(coin, amt, i + 1);
		return inc + exc;

	}

	public static int coinchangeBU(int[] coin, int amt) {
		int[][] strg = new int[amt + 1][coin.length + 1];
		for (int i = 0; i < strg[0].length; i++)
			strg[0][i] = 1;
		for (int am = 1; am < strg.length; am++) {
			for (int i = 1; i < strg[0].length; i++) {
				int inc = 0;
				int exc = 0;
				if (am >= coin[i - 1]) {
					inc = strg[am - coin[i - 1]][i];
				}
				exc = strg[am][i - 1];
				strg[am][i] = inc + exc;
			}
		}
		return strg[amt][coin.length];

	}

	public static int CoinChangesBU(int[] coin, int amount) {
		int[][] dp = new int[amount + 1][coin.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}

		for (int am = 1; am < dp.length; am++) {
			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0;
				int exc = 0;
				if (am >= coin[i - 1]) {
					inc = dp[am - coin[i - 1]][i];
				}
				exc = dp[am][i - 1];
				dp[am][i] = inc + exc;

			}
		}
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}

		return dp[amount][coin.length];

	}

}
