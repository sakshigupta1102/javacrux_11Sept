package session36;

public class anagrammet1 {

	public static void main(String[] args) {
		String str1 = "aabd";
		String str2 = "bdaa";
		String code1 = generatecode(str1);
		String code2 = generatecode(str2);
		System.out.println(code1);
		System.out.println(code2);
		boolean isanagram = code1.equals(code2);
		System.out.println(isanagram);
	}
	public static String generatecode(String str1){
		int[] freqarr = new int[26];
		for(int i=0;i<str1.length();i++){
			char ch = str1.charAt(i);
			freqarr[ch-'a'] ++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<freqarr.length;i++){
			sb.append(freqarr[i]);
		}
		return sb.toString();
	}
	
	
	

	public static boolean checkanagram(String str1, String str2) {
		int[] freqarr = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			freqarr[ch - 'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			freqarr[ch - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (freqarr[i] != 0)
				return false;
		}
		return true;

	}

}
