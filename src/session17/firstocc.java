package session17;

public class firstocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int firstocc(int[] arr, int search , int n, int idx){
		if(arr[idx] == search){
			return idx;
		}
		if(idx==n){
			return -1;
		}
		return firstocc(arr, search, n, idx+1);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		
	}

}
