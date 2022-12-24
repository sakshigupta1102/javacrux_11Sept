package session26;

import java.util.Stack;

public class queueusingstack_enqueueeff {
	Stack<Integer> stack;

	public queueusingstack_enqueueeff() {
		stack = new Stack<Integer>();
	}

	public void enqueue(int item) {
		stack.push(item);

	}

	public int dequeue() {
		Stack<Integer> temp = new Stack<Integer>();
		while (stack.size() != 1) {
			int ele = stack.pop();
			temp.push(ele);
		}
		int ans = stack.pop();
		while (temp.size() != 0) {
			stack.push(temp.pop());
		}
		return ans;

	}

	public int getFront() {
		Stack<Integer> temp = new Stack<Integer>();
		while (stack.size() != 1) {
			int ele = stack.pop();
			temp.push(ele);
		}
		int ans = stack.pop();
		stack.push(ans);
		while (temp.size() != 0) {
			stack.push(temp.pop());
		}
		
		return ans;

	}
	@Override
	public String toString(){
		return stack.toString();
	}

}
