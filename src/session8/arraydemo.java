package session8;

import java.util.Scanner;

public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10 ,20 ,30 ,40 ,50};
		//int[] arr = new int[5];
		// System.out.println(arr);
		// arr[0] = 1;
		// arr[1] = 3;
		// arr[2] = 8;
		// arr[3] = 9;
		// arr[4]=9;
		// System.out.println(arr[0]+" "+arr[1]+"  "+arr[2]+" "+arr[3]+" "+arr[4]);
		// arr[5] =9;
		// System.out.println(arr[5]);
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		display(arr);
//		System.out.println("maximum number is" + max(arr));
//     System.out.println("linear search " + search(arr, 40));
		System.out.println("original array is");
		display(arr);
		System.out.println("reverse array is");
		display(reverse(arr));
		System.out.println("*********");
		display(arr);
		
	}
	public static void display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static int min(int[] arr){
		int minno = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			minno = Math.min(minno, arr[i]);
		}
		return minno;
	}
	public static int max(int[] arr){
		int maxno= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
//			if(arr[i] > maxno){
//				maxno= arr[i];
//			}
			maxno = Math.max(maxno, arr[i]);
		}
		return maxno;
	}
	
	public static int search(int[] arr, int item){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==item) return i;
		}
		return -1;
	}
	
	public static int[] reverse(int[] arr){
		int anslength= arr.length;
		int[] ans = new int[anslength];
		int j=0;
		for(int i= arr.length-1;i>=0;i--){
			ans[j] = arr[i];
			j++;
		}
		return ans;
	}
	
	
	

}
