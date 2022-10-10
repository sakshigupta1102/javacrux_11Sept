package session6;

public class bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1111011;
		int ans = 0;
		int mult = 1;
		while (n > 0) {
			int rem = n % 10;
			ans += (rem * mult);
			mult *= 2;
			n = n / 10;
		}
		System.out.println(ans);
	}

}
