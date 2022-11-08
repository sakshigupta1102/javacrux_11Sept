package doubtclass3;

import java.util.*;

public class helpramu {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t > 0) {
			int c1 = scan.nextInt();
			int c2 = scan.nextInt();
			int c3 = scan.nextInt();
			int c4 = scan.nextInt();
			int rick = scan.nextInt();
			int cab = scan.nextInt();
			int[] rickarr = new int[rick];
			int[] cabarr = new int[cab];
			for (int i = 0; i < rick; i++)
				rickarr[i] = scan.nextInt();
			for (int i = 0; i < cab; i++)
				cabarr[i] = scan.nextInt();
			int rickcost = rickfun(rickarr, c1, c2, c3);
			int cabcost = cabfun(cabarr, c1, c2, c3);
			System.out.println(Math.min(rickcost + cabcost, c4));
			t--;
		}
	}

	public static int rickfun(int[] rickarr, int c1, int c2, int c3) {
		int ans = 0;
		for (int i = 0; i < rickarr.length; i++) {
			int a = rickarr[i] * c1;
			int b = c2;
			ans += Math.min(a, b);

		}
		return Math.min(ans, c3);

	}

	public static int cabfun(int[] cabarr, int c1, int c2, int c3) {
		int ans = 0;
		for (int i = 0; i < cabarr.length; i++) {
			int a = cabarr[i] * c1;
			int b = c2;
			ans += Math.min(a, b);

		}
		return Math.min(ans, c3);

	}

}