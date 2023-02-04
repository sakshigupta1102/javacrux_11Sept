package session33;

public class BST {

	class Node {
		Node left;
		Node right;
		int data;

		Node() {
		}

		Node(int data) {
			this.data = data;
		}
	}

	private Node root;

	BST(int[] arr) {
		this.root = construct(arr, 0, arr.length - 1);
	}

	public void display() {
		display(this.root);
	}

	public void display(Node node) {
		if (node == null)
			return;
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str = str + "<-" + node.data + " ->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public Node construct(int[] arr, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node nn = new Node(arr[mid]);
		nn.left = construct(arr, lo, mid - 1);
		nn.right = construct(arr, mid + 1, hi);
		return nn;

	}

	public boolean find(int item) {
		return find(item, root);
	}

	public boolean find(int item, Node node) {

		if (node == null)
			return false;
		// redundant
		if (node.data == item)
			return true;

		if (node.data > item) {
			return find(item, node.left);
		} else if (node.data < item) {
			return find(item, node.right);
		} else {
			return true;
		}

	}

	public int max() {
		return max(root);
	}

	public int min() {
		return min(root);
	}

	public int max(Node node) {

		if (node.right == null)
			return node.data;
		return max(node.right);

	}

	public int min(Node node) {

		if (node.left == null)
			return node.data;
		return min(node.left);

	}

	public void printInRange(int ll, int ul) {
		printInRange(ll, ul, root);
	}

	private void printInRange(int ll, int ul, Node node) {

		if (node == null)
			return;
		if (node.data > ul) {
			printInRange(ll, ul, node.left);
		} else if (node.data < ll) {
			printInRange(ll, ul, node.right);
		} else {
			printInRange(ll, ul, node.left);
			System.out.println(node.data);
			printInRange(ll, ul, node.right);

		}
	}

	public void add(int val) {
		add(root, val);
	}

	public Node add(Node node, int val) {

		if (node == null) {
			Node nn = new Node(val);
			return nn;
		}

		if (node.data > val) {
			node.left = add(node.left, val);
		} else if (node.data < val) {
			node.right = add(node.right, val);
		}
		return node;
	}

}
