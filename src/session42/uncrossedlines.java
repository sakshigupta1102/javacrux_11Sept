package session42;

public class uncrossedlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int uncrossedlines(int[] nums1, int[] nums2) {
		int[][] strg = new int[nums1.length + 1][nums2.length + 1];
		for (int i = 1; i < strg.length; i++) {
			for (int j = 1; j < strg[0].length; j++) {
				int ans = 0;
				if (nums1[i - 1] == nums2[j - 1]) {
					ans = 1 + strg[i - 1][j - 1];
				} else {
					int a1 = strg[i - 1][j];
					int a2 = strg[i][j - 1];
					ans = Math.max(a1, a2);
				}
				strg[i][j] = ans;
			}
		}
		return strg[strg.length - 1][strg[0].length - 1];
	}

}
