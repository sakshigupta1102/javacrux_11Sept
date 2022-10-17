package session10;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80};
		System.out.println(binarysearch(arr, 80));
		}
	public static int binarysearch(int[] arr, int find){
		int lo=0;
		int hi= arr.length-1;
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(arr[mid] < find){
				lo=mid+1;
			}
			else if(arr[mid] > find){
				hi = mid-1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}

}
