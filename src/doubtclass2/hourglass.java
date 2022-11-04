package doubtclass2;
import java.util.Scanner;

public class hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5 4 3 2 1 0 1 2 3 4 5
		// 4 3 2 1 0 1 2 3 4
		// 3 2 1 0 1 2 3
		// 2 1 0 1 2
		// 1 0 1
		// 0
		// 1 0 1
		// 2 1 0 1 2
		// 3 2 1 0 1 2 3
		// 4 3 2 1 0 1 2 3 4
		// 5 4 3 2 1 0 1 2 3 4 5
		int val = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int rows = 1;
		int nst = 2 * n + 1;
		int nsp = 0;

		while (rows <= 2 * n + 1) {
			int cst = 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			if (rows < (2 * n) / 2)
				val = n - rows + 1;
			else
				val = rows - n - 1;
			if (rows == n) {
				val = 1;
			}
			while (cst <= nst) {
				System.out.print(val + " ");
				if (cst < ((nst + 1) / 2)) {

					val--;
				} else {
					val++;
				}
				cst++;
			}

			System.out.println();
			if (rows < n + 1) {
				nst -= 2;
				nsp++;
			} else {
				nst += 2;
				nsp--;
			}
			rows++;

		}

	}

}
