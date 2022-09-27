package session5;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HCF a.k.a GCD
		Scanner scan = new Scanner(System.in);
		int dividend = scan.nextInt();
		int divisor = scan.nextInt();
		while(dividend%divisor !=0){
			int rem = dividend%divisor;
			dividend = divisor;
			divisor = rem;
			
		}
		System.out.println(divisor);

	}

}
