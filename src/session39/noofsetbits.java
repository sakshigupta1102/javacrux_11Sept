package session39;

public class noofsetbits {
	public static void main(String[] args) {
		int a = 6;
		int b = 15;
		System.out.println(bitschagefromatob(a, b));
		System.out.println(a);
		System.out.println(b);
		System.out.println(1 << 2);
	

	}

	public static int bitschagefromatob(int a, int b) {
		int xor = a ^ b;
		return cntsetbits(xor);
	}

	private static int cntsetbits(int n) {
		int ans = 0;
		while (n != 0) {
			int bit = n & 1;
			if (bit == 1)
				ans++;
			n = n >> 1;
		}
		return (ans);

	}

	// 0010
	public static int getithbit(int n, int idx) {
		int mask = 1 << idx;
		return (n & mask) == 0 ? 0 : 1;

	}

	public static int seithbit(int n, int idx) {
		int mask = 1 << idx;
		return n | mask;
	}
}
