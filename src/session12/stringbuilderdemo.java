package session12;

public class stringbuilderdemo {

	public static void main(String[] args) {
	  StringBuilder sb = new StringBuilder("hello");
	  System.out.println(sb.charAt(2));
	  sb.insert(2, 'x');
	  System.out.println(sb);
	  sb.deleteCharAt(2);
	  System.out.println(sb);
	  sb.setCharAt(2, 'x');
	  System.out.println(sb);
	  System.out.println(togglecase("CoDinG"));
	  
	  

	}
	public static String togglecase(String str){
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length();i++){
			char ch = sb.charAt(i);
			if(Character.isUpperCase(ch)){
				ch = Character.toLowerCase(ch);
				sb.setCharAt(i, ch);
				
			}
			else{
				ch= Character.toUpperCase(ch);
				sb.setCharAt(i, ch);
			}
		}
		return sb.toString();
		
	}

}
