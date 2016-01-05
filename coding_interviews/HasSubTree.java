package coding_interviews;

import tree.TreeNode;

public class HasSubTree {
	public boolean hasSubtree(TreeNode r1, TreeNode r2) {
		boolean isSubtree = false;
		while (r1 != null && r2 != null) {
			if (r1.val == r2.val)
				isSubtree = isSametree(r1, r2);
			if (!isSubtree)
				isSubtree = hasSubtree(r1.left, r2);
			if (!isSubtree)
				isSubtree = hasSubtree(r1.right, r2);
		}
		return isSubtree;
	}

	private boolean isSametree(TreeNode r1, TreeNode r2) {
		if (r2 == null)
			return true;
		if (r1 == null)
			return false;
		if (r1.val != r2.val)
			return false;
		return isSametree(r1.left, r2.left) && isSametree(r1.right, r2.right);
	}

	public static void main(String[] args) {

	}
}
