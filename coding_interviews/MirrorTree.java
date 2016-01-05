package coding_interviews;

import tree.TreeNode;

public class MirrorTree {
	public void mirrorTree(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null)
			return;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if (root.left != null)
			mirrorTree(root.left);
		if (root.right != null)
			mirrorTree(root.right);
	}

	public static void main(String[] args) {

	}

}
