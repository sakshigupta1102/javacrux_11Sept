package session6;

import java.util.Scanner;

public class decimalbinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		int mult = 1;
		while (n > 0) {
			int rem = n % 2;
			ans = ans + (rem * mult);
			mult = mult * 10;
			n = n / 2;
		}
		System.out.println(ans);

	}

}
