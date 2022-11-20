package session17;

import java.util.ArrayList;

public class generatepara {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		generatepara(3, 0, 0, "",list);
		System.out.println(list);

	}
	public static void generatepara(int n , int open ,
			int close, String ans,ArrayList<String> list ){
		if(open > n) return;
		if(close> open) return;
		if(open==n && close ==n) {
			list.add(ans);
			return;
		}
		generatepara(n, open+1, close, ans+"(",list);
		generatepara(n, open, close+1, ans+")",list);
	}
 
}
