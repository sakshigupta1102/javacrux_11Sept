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

	private Node root;
	Scanner scan = new Scanner(System.in);

	public Binarytree(String str) {

		scan = new Scanner(str);
		root = construct();
	}

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

	public void display() {
		display(root);
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

	public int size() {
		return size(root);
	}

	public int size(Node node) {

		if (node == null)
			return 0;

		int lt = size(node.left);
		int rt = size(node.right);
		return lt + rt + 1;

	}

	public int max() {
		return max(root);
	}

	public int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(node.left);
		int rmax = max(node.right);
		return Math.max(lmax, Math.max(rmax, node.data));

	}

	public boolean find(int item) {
		return find(root, item);

	}

	public boolean find(Node node, int item) {
		if (node == null)
			return false;
		if (item == node.data)
			return true;
		boolean lans = find(node.left, item);
		boolean rans = find(node.right, item);
		return lans || rans;

	}

	public int height() {
		return height(root);
	}

	public int height(Node node) {
		if (node == null)
			return -1;
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void preorder() {
		preorder(root);
	}

	public void inorder() {
		inorder(root);
	}

	public void postorder() {
		postorder(root);
	}

	public void preorder(Node node) {
		// print left right
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}

	public void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

	public void postorder(Node node) {
		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

}
