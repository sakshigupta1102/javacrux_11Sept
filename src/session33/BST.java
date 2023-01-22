package session33;

public class BST {

	class Node {
		Node left;
		Node right;
		int data;

		Node() {
		};

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

}
