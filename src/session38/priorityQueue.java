package session38;
import java.util.Collections;
import java.util.PriorityQueue;
public class priorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());
		heap.add(10);
		heap.add(70);
		heap.add(30);
		heap.add(0);
		heap.add(20);
		heap.add(-1);
		System.out.println(heap.peek());
		System.out.println(heap);
		heap.poll();
		System.out.println(heap);

	}

}
