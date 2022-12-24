package session26;

import java.util.Stack;

public class reversestack {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);
		reverse(stack);
		System.out.println(stack);

	}

	public static void reverse(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			return;
		}
		int ele = stack.pop();
		reverse(stack);
		pushdown(stack,ele);
	}

	private static void pushdown(Stack<Integer> stack, int ele) {
		// TODO Auto-generated method stub
		if(stack.isEmpty()){
			stack.push(ele);
			return;
		}
		int item= stack.pop();
		pushdown(stack, ele);
		stack.push(item);
		
		
	}
	
	 
	
	
	
	
	
	

}
