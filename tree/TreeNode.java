package tree;

public class TreeNode<E extends Comparable<E>> {
	E val;
	public TreeNode left;
	public TreeNode right;

	TreeNode(E x) {
		val = x;
	}
}
