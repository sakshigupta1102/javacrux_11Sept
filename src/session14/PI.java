package session14;

public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PID(5);
	}

	public static void PID(int n) {
        if(n==0) return;
        System.out.println("hello" +n);
		PID(n - 1);
		System.out.println("bye"+n);
	}

}
