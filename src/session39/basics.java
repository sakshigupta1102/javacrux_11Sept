package session39;
public class basics {
	public static void main(String[] args) {
		int a= 5 ;
		int b = 7;
		a = a^ b; // 5^ 7
		b= b^a ; // 5
		a = a^b; // 7
		System.out.println(a+" "+b);
		//odd even
		int n= 53;
		if((n&1)==1) System.out.println("odd");
		else System.out.println("even");
	}
}
