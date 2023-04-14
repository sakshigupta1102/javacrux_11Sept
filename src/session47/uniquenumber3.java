package session47;

import java.util.Scanner;

public class uniquenumber3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int[] help = new int[32];
		for(int i=0;i<n;i++){
			int ele = arr[i];
			int cnt=0;
			while(ele!=0){
				int bit = ele & 1;
				help[cnt] += bit;
				ele = ele >>1;
		        cnt++;
			}			
		}
		for(int i=0;i<help.length;i++){
			help[i] = help[i]%3;
		}
		int ans=0;
		for(int i=0;i<help.length;i++){
			ans = ans + (int) (Math.pow(2, i)*help[i]);
		}
		System.out.println(ans);
		
	}
	

}
