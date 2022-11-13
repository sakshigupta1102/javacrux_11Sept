package session15;

public class notedenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		note(0, 50, "");
	}

	public static void note(int curr, int total, String ans) {
		if (curr > total) {
			return;
		}
		if (curr == total) {
			System.out.println(ans);
			return;
		}
		note(curr + 10, total, ans + "10 ");
		note(curr + 20, total, ans + "20 ");
		note(curr + 50, total, ans + "50 ");
	}

}
