package session7;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 13;
		range_of_prime(range);
//		boolean isp = isprime(num);
//		if (isp)
//			System.out.println("it is prime");
//		else
//			System.out.println("it is not prime");
	}

	public static boolean isprime(int num) {
		boolean flag = true;
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void range_of_prime(int range){
		for(int i=2;i<=range;i++){
			boolean isprime = isprime(i);
			if(isprime) System.out.print(i+" ");
			
		}
	}

}
