package session24;

public class Stackclient {

	public static void main(String[] args) throws Exception {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.size());
		s.display();
		System.out.println(s.isFull());
		

	}

}
