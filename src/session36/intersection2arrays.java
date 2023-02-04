package session36;

import java.util.ArrayList;
import java.util.Arrays;

public class intersection2arrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 22, 32, 2, 5, 7, 9, 9, 9 };
		int[] arr2 = { 1, 8, 9, 9, 32, 30, 22, 27 };
		ArrayList<Integer> list = new ArrayList();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j])
				i++;
			else {
				list.add(arr1[i]);
				i++;
				j++;
			}

		}
		System.out.println(list);

	}

}
