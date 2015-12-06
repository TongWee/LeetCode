package tree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 		A
 *	  /   \
 *   B	   C
 * 	/ \    /
 * D   E  F
 *         \		
 *          G 
 */

public class Common {
	private TreeNode tree;

	public Common() {
		// Init treeNode
		TreeNode a = new TreeNode('A');
		TreeNode b = new TreeNode('B');
		TreeNode c = new TreeNode('C');
		TreeNode d = new TreeNode('D');
		TreeNode e = new TreeNode('E');
		TreeNode f = new TreeNode('F');
		TreeNode g = new TreeNode('G');

		// Init tree
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		f.right = g;

		this.tree = a;
	}

	// Return root node
	public TreeNode getRoot() {
		return this.tree;
	}

	// Return tree depth
	public int getDepth(TreeNode root) {
		return calDepth(root);
	}

	// Calculate tree depth
	private int calDepth(TreeNode root) {
		if (root == null)
			return 0;
		int leftDeep = calDepth(root.left);
		int rightDeep = calDepth(root.right);
		int max = leftDeep > rightDeep ? leftDeep : rightDeep;
		return max + 1;
	}
}
