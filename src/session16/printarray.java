package session16;

public class printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,1,3,4,1,2,2};
printarray(arr, 0);
	}

	public static void printarray(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		printarray(arr, idx + 1);
	}

}
