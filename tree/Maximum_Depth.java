package tree;

public class Maximum_Depth {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int d1, d2;
		d1 = 0;
		if (root.left != null)
			d1 = maxDepth(root.left);
		d2 = 0;
		if (root.right != null)
			d2 = maxDepth(root.right);
		return d1 > d2 ? d1 + 1 : d2 + 1;
	}
}
