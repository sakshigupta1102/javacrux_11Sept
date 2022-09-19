package session3;

public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= n) {
				if (cst == row || cst == (n - row + 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;

			}
			row++;
			System.out.println();
		}

	}

}
