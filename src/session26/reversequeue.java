package session26;
import session25.Queue;
public class reversequeue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q);
		reverse(q);
		System.out.println(q);

	}

	public static void reverse(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}
		int ele = q.dequeue();
		reverse(q);
		q.enqueue(ele);

	}

}
