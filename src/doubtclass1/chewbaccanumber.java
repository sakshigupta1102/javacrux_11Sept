package doubtclass1;

import java.util.Scanner;

public class chewbaccanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long n= scan.nextLong();
		long ans=0;
		long mult=1;
		while(n>10){
			long rem = n%10;
			long min = Math.min(rem, 9-rem);
			ans = min*mult + ans;
			mult = mult*10;
			n=n/10;
		}
		if(n==9) ans= 9*mult+ans;
		else ans= Math.min(n, 9-n)*mult+ans;
		System.out.print(ans);
		

	}

}
