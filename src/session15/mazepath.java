package session15;

public class mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		mazepath(0, 0, m - 1, n - 1, "");	}

	public static void mazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr > er || cc > ec) {
			return;
		}
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		mazepath(cr + 1, cc, er, ec, ans + "V");
		mazepath(cr, cc + 1, er, ec, ans + "H");

	}

}
