package session8;

public class rotatenumber {

	public static void main(String[] args) {
		System.out.println(9%4);
System.out.println(rotate(1234, -2));
	}

	public static int rotate(int num, int rot) {

		int cod = countdigits(num);
		rot = rot % cod;
		if(rot<0) rot+=cod;
		int ans = num;
		for (int i = 0; i < rot; i++) {
			int rem = num % 10;
			ans = (rem * (int) Math.pow(10, cod - 1)) + (num / 10);
           num= ans;
		}

		return ans;
	}

	public static int countdigits(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}
