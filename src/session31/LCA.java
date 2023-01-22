package session31;

public class LCA {
	 public class TreeNode {
		    int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
		if (node == null)
			return null;
		if (node.val == p.val)
			return node;
		if (node.val == q.val)
			return node;
		TreeNode lans = lowestCommonAncestor(node.left, p, q);
		TreeNode rans = lowestCommonAncestor(node.right, p, q);
		if (lans != null && rans != null)
			return node;
		return lans == null ? rans : lans;

	}

}
