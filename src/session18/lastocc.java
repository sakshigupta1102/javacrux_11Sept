package session18;

public class lastocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int lastocc(int[] arr, int idx, int item){

		if(idx==arr.length){
			return -1;
		}
		int rr = lastocc(arr, idx+1, item);
		if(rr==-1 && arr[idx]==item) return idx;
		return rr;
	}

}



