package session10;

import java.util.Scanner;

public class arary2ddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][2];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		

	}
	

}
