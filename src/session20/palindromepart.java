package session20;

import java.util.ArrayList;

public class palindromepart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> small = new ArrayList();
		ArrayList<ArrayList<String>> big = new ArrayList();
		listpalpart("nitin", small, big);
		System.out.println(big);
 
	}

	// public static void printpart(String ques , String ans){
	// if(ques.length()==0){
	// System.out.println(ans);
	// return;
	// }
	// for(int i=1;i<=ques.length();i++){
	// String s = ques.substring(0, i);
	// printpart(ques.substring(i), ans+s+"|");
	// }
	// }
	public static void printpalpart(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {

			String s = ques.substring(0, i);
			if (ispal(s)) {
				printpalpart(ques.substring(i), ans + s + "|");
			}
		}
	}

	public static void listpalpart(String ques, ArrayList<String> small, ArrayList<ArrayList<String>> big) {
		if (ques.length() == 0) {
			big.add(new ArrayList<String>(small));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {

			String s = ques.substring(0, i);
			if (ispal(s)) {
				small.add(s);
				listpalpart(ques.substring(i), small,big);
				small.remove(small.size() - 1);
			}
		}
	}

	public static boolean ispal(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (ch1 != ch2)
				return false;
			i++;
			j--;
		}
		return true;
	}

}
