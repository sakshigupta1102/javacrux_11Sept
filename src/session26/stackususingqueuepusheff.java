package session26;
import session25.Queue;
public class stackususingqueuepusheff {
	Queue q;
	 @Override
	 public String toString(){
		 return q.toString();
	 }
	public stackususingqueuepusheff() {
		q = new Queue();
	}
	public void push(int item) throws Exception {
		q.enqueue(item);
	}
	public int pop() throws Exception {
		Queue temp = new Queue();
		while (q.size != 1) {
			temp.enqueue(q.dequeue());
		}
		int ele = q.dequeue();
		q = temp;
		return ele;
	}
}

