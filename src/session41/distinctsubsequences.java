package session41;

public class distinctsubsequences {
	public static void main(String[] args) {

	}

	public int numDistinct(String s, String t) {
		int[][] strg = new int[t.length() + 1][s.length() + 1];
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				strg[i][j] = -1;
			}
		}
		return rec(s, t, 0, 0, strg);
	}

	public int rec(String s, String t, int i, int j, int[][] strg) {

		if (i == t.length())
			return 1;
		if (j == s.length())
			return 0;

		if (strg[i][j] != -1)
			return strg[i][j];
		int inc = 0;
		if (s.charAt(j) == t.charAt(i)) {
			inc = rec(s, t, i + 1, j + 1, strg);
		}
		int dontinc = rec(s, t, i, j + 1, strg);

		return strg[i][j] = inc + dontinc;

	}
}
