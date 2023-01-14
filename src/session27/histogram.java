package session27;
import java.util.Stack;
public class histogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int largestRectangleArea(int[] heights) {

		int[] right = nextrightsmaller(heights);
		int[] left = nextleftsmaller(heights);
		int ans = 0;
		for (int i = 0; i < heights.length; i++) {
			int currrect = (right[i] - left[i] - 1) * heights[i];
			ans = Math.max(currrect, ans);
		}
		return ans;
	}

	public int[] nextrightsmaller(int[] arr) {

		int n = arr.length;
		int[] ans = new int[n];

		Stack<Integer> stack = new Stack();
		for (int i = n - 1; i >= 0; i--) {

			while (!stack.isEmpty()) {
				int idxinstack = stack.peek();
				if (arr[idxinstack] < arr[i]) {
					ans[i] = idxinstack;
					stack.push(i);
					break;

				} else {
					stack.pop();

				}
			}
			if (stack.isEmpty()) {
				ans[i] = n;
				stack.push(i);
			}

		}

		return ans;

	}

	public int[] nextleftsmaller(int[] arr) {

		int n = arr.length;
		int[] ans = new int[n];

		Stack<Integer> stack = new Stack();
		for (int i = 0; i < n; i++) {

			while (!stack.isEmpty()) {
				int idxinstack = stack.peek();
				if (arr[idxinstack] < arr[i]) {
					ans[i] = idxinstack;
					stack.push(i);
					break;

				} else {
					stack.pop();

				}
			}
			if (stack.isEmpty()) {
				ans[i] = -1;
				stack.push(i);
			}

		}

		return ans;

	}

}
