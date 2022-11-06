package session14;

public class power {

	public static void main(String[] args) {
		System.out.println(pow(2, 3));
	}
	public static int pow(int a,int b){
		if(b==0) return 1;
		int sp = pow(a,b-1);
		return sp*a;
	}
	

}
