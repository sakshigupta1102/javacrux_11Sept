package session28;

import java.util.LinkedList;

public class llclient {
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		list.addlast(50);
		System.out.println(list.mid());
		

	}
}