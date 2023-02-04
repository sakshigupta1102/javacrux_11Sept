package session33;

public class BSTclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 35, 40, 45, 50, 55, 60, 65 };
		BST tree = new BST(arr);
		tree.display();
		System.out.println("*****");
		tree.add(45);
		tree.display();

	}

}
