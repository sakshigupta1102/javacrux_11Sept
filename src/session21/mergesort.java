package session21;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 6, 60, 12, 20, 4, 3, 8 };
		int[] ans = mergesort(arr, 0, arr.length - 1);
		for (int a : ans) {
              System.out.print(a+"  ");
		}
	 }

	public static int[] mergesort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = ((lo + hi) / 2);
		int[] lh = mergesort(arr, lo, mid);
		int[] rh = mergesort(arr, mid + 1, hi);
		int[] ans = mergetwoarrays(lh, rh);
		return ans;
	}

	public static int[] mergetwoarrays(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;

		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;

		}

		return ans;
	}

}
