package session31;

public class btclient {

	public static void main(String[] args) {
		String str = "10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false";
		Binarytree tree = new Binarytree(str);
		tree.display();
		tree.postorder();

	}

}
