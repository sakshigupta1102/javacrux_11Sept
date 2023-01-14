package session31;

import java.util.Scanner;

public class Binarytree {
	class Node {
		int data;
		Node left;
		Node right;

		Node() {

		}

		Node(int val) {
			this.data = val;
		}
	}

	Node root;
	Scanner scan = new Scanner(System.in);

	public Binarytree() {
		this.root = construct();

	}

	public Node construct() {
		int item = scan.nextInt();
		Node nn = new Node(item);
		boolean ilc = scan.nextBoolean();
		if (ilc)
			nn.left = construct();
		boolean irc = scan.nextBoolean();
		if (irc)
			nn.right = construct();
		return nn;
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

}
