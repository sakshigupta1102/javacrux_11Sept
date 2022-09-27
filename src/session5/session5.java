package session5;
import java.util.Scanner;


public class session5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int i=2;
		int flag=0;
		while(i<n){
			if(n%i==0){
				flag++;
				break;
				
			}
			i++;
		}
		System.out.println(flag);
		if(flag==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
		

	}

}
