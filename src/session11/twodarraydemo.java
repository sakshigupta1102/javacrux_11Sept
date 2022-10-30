package session11;

import java.util.Scanner;

public class twodarraydemo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] arr = takeinput();

		int[][] arr ={{10,20,30},{40,50,60},{70, 80, 90}};
		// vertdisplay(arr);
		// wavedisplay(arr);
		//spiral(arr);
	transinplace(arr);
	display(arr);
		

	}

	public static int[][] takeinput() {
		System.out.println("enter rows of 2d arary");
		int n = scan.nextInt();
		System.out.println("enter colums of 2d array");
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
		}
		System.out.println();
	}

	public static void vertdisplay(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][col] + " ");

			}
		}
	}

	public static void wavedisplay(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int col = arr[0].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}

	public static void spiral(int[][] arr) {
		int minrow = 0;
		int mincol = 0;
		int maxrow = arr.length - 1;
		int maxcol = arr[0].length - 1;
		int cnt = 1;
		int total = arr.length * arr[0].length;
		while (cnt <= total) {
			for (int col = mincol; col <= maxcol && cnt<= total; col++) {
				System.out.print(arr[minrow][col]+" ");
				cnt++;
			}
			minrow++;
			for (int row = minrow; row <= maxrow && cnt<= total; row++) {
				System.out.print(arr[row][maxcol] + "  ");
				cnt++;
			}
			maxcol--;
			for (int col = maxcol; col >= mincol&& cnt<=total; col--) {
				System.out.print(arr[maxrow][col] + "  ");
				cnt++;
			}
			maxrow--;
			for (int row = maxrow; row >= minrow&& cnt<=total; row--) {
				System.out.print(arr[row][mincol]+" ");
				cnt++;
			}
			mincol++;
		}
	}
	public static int[][] transposeextraspace(int[][] A){
		int[][] B = new int[A.length][A[0].length];
		for(int i=0;i<B.length;i++){
			for(int j=0;j<B[0].length;j++){
				B[i][j] = A[j][i];
			}
		}
		return B;
	}
	public static void transinplace(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	
	
	
	

}
