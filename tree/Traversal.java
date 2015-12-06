package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
	// 二叉树非递归层次遍历
	public static void levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			System.out.print(cur.val + " ");
			if (cur.left != null)
				queue.add(cur.left);
			if (cur.right != null)
				queue.add(cur.right);
		}
	}

	// 二叉树先序遍历
	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	// 二叉树先序遍历
	public void midOrder(TreeNode root) {
		if (root == null)
			return;
		midOrder(root.left);
		System.out.print(root.val + " ");
		midOrder(root.right);
	}

	// 二叉树先序遍历
	public void postOrder(TreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");
	}
}
