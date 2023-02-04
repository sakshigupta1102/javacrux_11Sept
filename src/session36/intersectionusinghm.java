package session36;

import java.util.ArrayList;
import java.util.HashMap;

public class intersectionusinghm {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 7, 9, 9, 9, 22, 32 };
		int[] arr2 = { 1, 1, 8, 9, 9, 22, 27, 30, 32 };
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < arr2.length; i++) {
			// if (map.containsKey(arr2[i])) {
			// int val = map.get(arr2[i]);
			// map.put(arr2[i], val++);
			// } else {
			// map.put(arr2[i], 1);
			//
			// }
			map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);

		}
		System.out.println(map);
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i]) && map.get(arr1[i]) > 0) {
				list.add(arr1[i]);
				int val = map.get(arr1[i]) - 1;
				map.put(arr1[i], val);
			}

		}

		System.out.println(list);
		System.out.println(map);

		// System.out.println(map);

	}

}
