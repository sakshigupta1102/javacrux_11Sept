package session31;

import java.util.*;

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

	public void levelorder(Node node) {
		Queue<Node> queue = new LinkedList<Binarytree.Node>();
		queue.add(node);
		while (!queue.isEmpty()) {
			Node cn = queue.remove();
			System.out.println(cn.data);
			if (cn.left != null)
				queue.add(cn.left);
			if (cn.right != null)
				queue.add(cn.right);
		}
	}

	public void levelorder() {
		// TODO Auto-generated method stub
		levelorder(root);
	}

	public int diameter(Node node) {

		if (node == null)
			return 0;
		int lans = diameter(node.left);
		int rans = diameter(node.right);
		int self = height(node.left) + height(node.right) + 2;
		return Math.max(self, Math.max(rans, lans));

	}

	public int diameter() {
		// TODO Auto-generated method stub
		return diameter(root);
	}

	class diapair {
		int ht = -1;
		int dia = 0;
	}

	public boolean isbalanced() {
		return isbalanced(root);
	}
  class balpair{
	  int ht = -1;
	  boolean isbal = true;
  }
  public boolean isbalanced2(){
	  balpair ans = isbalanced2(root);
	  return ans.isbal;
	
  }
  public balpair isbalanced2(Node node){
	  if(node == null) return new balpair();
	  balpair lbp = isbalanced2(node.left);
	  balpair rbp = isbalanced2(node.right);
	  balpair sp = new balpair();
	  sp.ht  = Math.max(lbp.ht, rbp.ht) +1;
	  int bf = lbp.ht - rbp.ht;
	  boolean selfbal = bf==0|| bf==1 || bf==-1;
	  sp.isbal = lbp.isbal && rbp.isbal && selfbal;
	  return sp;
	  
			  
  }
  
  
  
  
	public boolean isbalanced(Node node) {
		if (node == null)
			return true;
		boolean isleftbal = isbalanced(node.left);
		boolean isrightbal = isbalanced(node.right);
		int bf = height(node.left) - height(node.right);
		boolean selffac = bf == 1 || bf == 0 || bf == -1;
		return isleftbal && isrightbal && selffac;

	}

	public int diameter2() {
		diapair ans = diameter2(root);
		return ans.dia;
	}

	public diapair diameter2(Node node) {
		if (node == null) {
			return new diapair();
		}
		diapair ldp = diameter2(node.left);
		diapair rdp = diameter2(node.right);
		diapair sdp = new diapair();
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
		int dia = ldp.ht + rdp.ht + 2;
		sdp.dia = Math.max(dia, Math.max(ldp.dia, rdp.dia));
		return sdp;
	}

}
