package tree;

public class Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		else if (p == null || q == null)
			return false;
		boolean curState = false;
		if (p.val != q.val)
			curState = false;
		else
			curState = true;
		boolean isLeftSame = isSameTree(p.left, q.left);
		boolean isRightSame = isSameTree(p.right, q.right);
		return curState && isLeftSame && isRightSame;
	}
}
