package session5;

import java.util.Scanner;

public class countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem == d)
				ans++;
			n = n / 10;
		}
		System.out.println(ans);
	}

}
