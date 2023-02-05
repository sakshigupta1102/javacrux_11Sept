package session35;

import java.util.ArrayList;
import java.util.List;

public class rightview {
	int maxdepth = -1;

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList();
		view(root, 0, list);
		return list;

	}

	public void view(TreeNode node, int currlevel, List<Integer> ans) {
		if (node == null)
			return;
		if (currlevel > maxdepth) {
			ans.add(node.val);
			maxdepth = currlevel;
		}
		view(node.right, currlevel + 1, ans);
		view(node.left, currlevel + 1, ans);

	}

}
