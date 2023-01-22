package session31;

public class sametree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q != null)
			return false;
		if (p != null && q == null)
			return false;
		if (p == null && q == null)
			return true;
		if (p.val != q.val)
			return false;
		boolean leftsame = isSameTree(p.left, q.left);
		boolean rightsame = isSameTree(p.right, q.right);
		return leftsame && rightsame;

	}
}
