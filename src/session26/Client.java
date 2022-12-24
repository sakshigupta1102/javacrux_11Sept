package session26;

public class Client {

	public static void main(String[] args) throws Exception {
//	  stackususingqueuepusheff stack = new stackususingqueuepusheff();
//	  stack.push(10);
//	  stack.push(20);
//	  stack.push(30);
//	  stack.push(40);
//	  System.out.println(stack);
//	  System.out.println(stack.pop());
//	  System.out.println(stack);
//	  
		
		queueusingstackdequeueeff q = new queueusingstackdequeueeff();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
	  
	  
	  
	  
	  
	  
	}

}
