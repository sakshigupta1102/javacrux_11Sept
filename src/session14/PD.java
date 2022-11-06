package session14;

public class PD {

	public static void main(String[] args) {
		PD(5);
		System.out.println("bye");
	}
	public static void PD(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		PD(n-1);
	}

}
