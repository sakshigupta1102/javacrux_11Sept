package session8;

public class arraydemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		display(arr);
		System.out.println("reverse of array");
		reverse(arr,1,3);
		display(arr);

	}
	public static void display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
	public static void reverse(int[] arr,int lo, int hi){
		int i=lo;
		int j=hi;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		
	}

}
