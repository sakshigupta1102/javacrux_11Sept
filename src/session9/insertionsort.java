package session9;

public class insertionsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 8, 1, 1 };
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
