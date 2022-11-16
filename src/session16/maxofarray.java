package session16;

public class maxofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxarray(int[] arr, int idx){
		if(idx==arr.length){
			return Integer.MIN_VALUE;
		}
		int rr= maxarray(arr, idx+1);
		return Math.max(rr, arr[idx]);
	}

}
