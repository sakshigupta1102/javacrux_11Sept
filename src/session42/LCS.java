package session42;

public class LCS {
	public static void main(String[] args) {
		System.out.println(lcs("abcde", "ace", 0, 0));
	}

	public static int lcsBU(String str1, String str2 ){
		int[][] strg = new int[str1.length()+1][str2.length()+1];
		for(int i=1;i<strg.length;i++){
			for(int j = 1 ; j< strg[0].length;j++  ){
				int ans=0;
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					ans = 1+ strg[i-1][j-1];
				}
				else{
					int a1= strg[i-1][j];
					int a2= strg[i][j-1];
					ans = Math.max(a1, a2);
				}
				strg[i][j] = ans;
			}
		}
		return strg[strg.length-1][strg[0].length-1];
	}
	
	
	
	public static int lcs(String word1, String word2, int i, int j) {
		if (i == word1.length())
			return 0;
		if (j == word2.length())
			return 0;

		int ans = 0;
		if (word1.charAt(i) == word2.charAt(j)) {
			ans = 1 + lcs(word1, word2, i + 1, j + 1);
		} else {
			int a1 = lcs(word1, word2, i + 1, j);
			int a2 = lcs(word1, word2, i, j + 1);
			ans = Math.max(a1, a2);
		}
		return ans;

	}
}
