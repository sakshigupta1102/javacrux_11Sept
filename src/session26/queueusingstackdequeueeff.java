package session26;

import java.util.Stack;

public class queueusingstackdequeueeff {
	Stack<Integer> stack;
	@Override
	public String toString(){
		return stack.toString();
	}
	public queueusingstackdequeueeff() {
		stack = new Stack<Integer>();
	}
	public void enqueue(int item)
	{
		Stack<Integer> temp  = new Stack<Integer>();
		while(!stack.isEmpty()){
			int ele = stack.pop();
			temp.push(ele);
		}
		stack.push(item);
		while(!temp.isEmpty()){
			int ele = temp.pop();
			stack.push(ele);
		}
		
		
	}
	public int dequeue(){
		return stack.pop();
	}
	
	
	
	
	
	
	

}
