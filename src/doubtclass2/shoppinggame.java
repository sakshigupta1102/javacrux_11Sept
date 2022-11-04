package doubtclass2;

import java.util.Scanner;

public class shoppinggame {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int aayushphones=0;
		int harshitphones=0;
		int count=1;
		while (n > 0) {
			int aayushlimit = scan.nextInt();
			int harshitlimit = scan.nextInt();
			while(true){
				aayushphones+=count;
				count++;
				harshitphones+=count;
				count++;
				if( aayushphones>aayushlimit){
					System.out.println("Harshit");
					break;
				}
				else if(harshitphones>harshitlimit){
					System.out.println("Aayush");
					break;
				}
				
				
				
			}
			n--;
		}
	}
}
