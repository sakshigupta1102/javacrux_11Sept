package session15;

public class climbstairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		climbstairs(0, 4, "");
	}

	public static void climbstairs(int curr, int end, String ans) {
		if(curr>end){
			return;
		}
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		climbstairs(curr + 1, end, ans + "1");
		climbstairs(curr + 2, end, ans + "2");
		climbstairs(curr + 3, end, ans + "3");
	}

}
