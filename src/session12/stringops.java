package session12;

public class stringops {

	public static void main(String[] args) {
		//System.out.println(ispal("NITINO"));
		substrings("abc");
	}
	public static String reverse(String str){
		String ans="";
		for(int i=str.length()-1;i>=0;i--){
			ans+=str.charAt(i);
		}
		return ans;
	}
   public static boolean ispal(String str){
	   int i=0;
	   int j= str.length()-1;
	   while(i<j){
		   char ch1 = str.charAt(i);
		   char ch2 = str.charAt(j);
		   if(ch1!=ch2) return false;
		   i++;
		   j--;
	   }
	   return true;
	   
	   
	   
   }
   public static void substrings(String str){
	   for(int i=0;i<str.length();i++){
		   for(int j=i+1;j<= str.length();j++){
			   System.out.println(str.substring(i, j));
		   }
	   }
   }

}
