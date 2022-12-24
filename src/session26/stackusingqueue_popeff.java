package session26;
import session25.Queue;
public class stackusingqueue_popeff {
	Queue q;

	@Override
	public String toString(){
		return q.toString();
	}
	public stackusingqueue_popeff() {
		q = new Queue();
	}
	public void push(int item) throws Exception{
	 Queue temp = new Queue();
	 temp.enqueue(item);
	 while(!q.isEmpty()){
		 temp.enqueue(q.dequeue());
	 }
	 q= temp;
	 
	}
	public int pop() throws Exception{
		return q.dequeue();
	}
	public int peek() throws Exception{
		return q.getFront();
	}

}
