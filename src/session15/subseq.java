package session15;
public class subseq {
	public static void main(String[] args) {
      subseq("abc", "");
	}
	public static void subseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		subseq(ros, ans + ch);
		subseq(ros, ans);

	}

}
