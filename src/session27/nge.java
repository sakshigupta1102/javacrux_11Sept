package session27;

import java.util.Stack;

public class nge {

	public static void main(String[] args) {
		int[] arr = { 90, 8, 7, 12, 6, 1, 18, 2 };
		int[] ans = nge(arr);
		for (int a : ans) {
			System.out.print(a + "  ");
		}
	}

	public static int[] nge(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> stack = new Stack();
		for (int i = arr.length - 1; i >= 0; i--) {

			while (!stack.isEmpty()) {
				int ele = stack.peek();
				if (ele > arr[i]) {
					ans[i] = ele;
					stack.push(arr[i]);
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				ans[i] = -1;
				stack.push(arr[i]);
			}

		}
		return ans;

	}

}
