package session12;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		String str= "Coding";
////		System.out.println(str.length());
////		System.out.println(str.charAt(0));
////		System.out.println(str.charAt(str.length()-1));
////		System.out.println("abc".concat("xyz"));
//	//	String str= new String("Coding");
//		String str1= "Coding";
//		String str2 = "Coding";
//		String str3 = "CODING";
//		//System.out.println(str==str1);
//		System.out.println(str1==  str2);
//	//	System.out.println(str.equals(str1));
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
//		System.out.println(str1.equalsIgnoreCase(str3));
//		//str1= str.replace('C', 'X');
//		System.out.println(str1);
//		String s = "hello";
//		System.out.println(s.indexOf('l', 3));
//		String str= "codingblocks";
//		System.out.println(str.substring(5,str.length()));
//		System.out.println(str.substring(8,9));
//		long start = System.currentTimeMillis();
//		appendString();
//		long end = System.currentTimeMillis();
//
//		System.out.println(end - start);
//		String a= new String("abc");
//		String b = new String("xyz");
//		a.concat(b);
//		System.out.println(a);
//		System.out.println(b);
		StringBuilder sb = new StringBuilder("abc");
		sb.append("xyz");
		System.out.println(sb);
		String a = "xyz";
		StringBuilder ab = new StringBuilder(a);
		ab.append("abs");
		System.out.println(ab.toString());
		
		
		
		
		
		

	}
	public static void appendString() {

		int n = 100000;
		 String str = "";

		for (int i = 1; i <= n; i++) {
			str += i ;
		}

	}


}
