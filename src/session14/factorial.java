package session14;

public class factorial {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	public static int fact(int n){
		if(n==1) return 1;
		int sp = fact(n-1);
		return sp*n;
	}

}
