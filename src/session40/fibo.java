package session40;

public class fibo {
	public static void main(String[] args) {
		System.out.println(fibo(6));
		int[] strg = new int[7];
		// System.out.println(fiboTD(6, strg));
		System.out.println(fiboBU(6, strg));
		System.out.println(fiboBUSE(6, new int[2]));
	}

	public static int fibo(int n) {
		if (n == 0 || n == 1)
			return n;
		int a = fibo(n - 1);
		int b = fibo(n - 2);
		return a + b;
	}

	public static int fiboTD(int n, int[] strg) {
		if (n == 0 || n == 1)
			return n;
		if (strg[n] != 0)
			return strg[n];
		int a = fiboTD(n - 1, strg);
		int b = fiboTD(n - 2, strg);
		strg[n] = a + b;
		return a + b;
	}

	public static int fiboBU(int n, int[] strg) {
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];

		}
		return strg[strg.length - 1];
	}

	public static int fiboBUSE(int n, int[] dp) {

		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			int c = dp[0] + dp[1];
			dp[0] = dp[1];
			dp[1] = c;

		}
		return dp[1];

	}
}
