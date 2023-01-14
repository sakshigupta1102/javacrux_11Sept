package session28;

public class Linkedlist {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	private Node head;
	private int size;
	private Node tail;

	public int getfirst() throws Exception {
		if (isempty()) {
			throw new Exception("LL is empty");
		}
		return head.data;
	}

	public Node getNodefirst() throws Exception {
		if (isempty()) {
			throw new Exception("LL is empty");
		}
		return head;
	}

	public int getlast() throws Exception {
		if (isempty()) {
			throw new Exception("LL is empty");
		}
		return tail.data;
	}

	public Node getNodelast() throws Exception {
		if (isempty()) {
			throw new Exception("LL is empty");
		}
		return tail;
	}

	public int getAt(int idx) throws Exception {
		if (idx < 0 || idx > this.size)
			throw new Exception("invalid index");
		if (idx == 0)
			return getfirst();
		else if (idx == this.size)
			return getlast();
		else {
			Node temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}

	public Node getNodeAt(int idx) throws Exception {
		if (idx < 0 || idx > this.size)
			throw new Exception("invalid index");
		if (idx == 0)
			return getNodefirst();
		else if (idx == this.size)
			return getNodelast();
		else {
			Node temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp;
		}
	}

	public boolean isempty() {
		return this.head == null;
		// return this.size ==0;
	}

	public void addfirst(int item) {
		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = head;
			this.head = nn;
			this.size++;
		}

	}

	public void addlast(int item) {

		if (this.size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	public void addAt(int idx, int item) throws Exception {
		if (idx < 0 || idx > this.size)
			throw new Exception("invalid index");
		if (idx == 0)
			addfirst(item);
		else if (idx == this.size)
			addlast(item);
		else {
			Node nn = new Node(item);
			Node pnode = getNodeAt(idx - 1);
			Node save = pnode.next;
			pnode.next = nn;
			nn.next = save;
			size++;
		}

	}

	public void removefirst() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;

		} else {
			this.head = this.head.next;
			this.size--;
		}
	}

	public void removelast() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;

		} else {
			Node pnode = getNodeAt(this.size - 2);
			pnode.next = null;
			this.tail = pnode;
			this.size--;
		}
	}

	public void removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		} else if (idx == 0)
			removefirst();
		else if (idx == this.size - 1)
			removelast();
		else {
			Node pnode = getNodeAt(idx - 1);
			Node cnode = pnode.next;
			Node save = cnode.next;
			pnode.next = save;
			this.size--;

		}

	}

	public void display() {
		Node temp = head;
		System.out.println("*******");
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
		System.out.println("*********");

	}

	public int mid() {
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;

	}

}




