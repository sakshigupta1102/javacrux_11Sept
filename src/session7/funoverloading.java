package session7;

public class funoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10,90));
		System.out.println(sum(10,89,7));
		System.out.println(sum());
		System.out.println(sum(2.0, 9));
		

	}
	public static int sum(){
		int a=10;
		int b=20;
		return a+b;
	}
	public static int sum(int a, int b){
		return a+b;
	}
	public static int sum(int a, int b, int c){
		return a+b+c;
	}
	public static double sum(double a, double b){
		return a+b;
	}

}
