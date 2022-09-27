package session4;

public class ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= (2 * n - 1)) {
			int cst = 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();

			if (row < n) {
				nst++;
				nsp--;
			} else {
				nst--;
				nsp++;
			}
			row++;
		}
		

	}
}
