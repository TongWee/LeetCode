package tree;

public class Test {

	public static void main(String[] args) {
		Common common = new Common();
		TreeNode tree = common.getRoot();
		Traversal t = new Traversal();
		System.out.print("Pre Order : ");
		t.preOrder(tree);
		System.out.println();
		System.out.print("Mid Order : ");
		t.midOrder(tree);
		System.out.println();
		System.out.print("Post Order : ");
		t.postOrder(tree);
		System.out.println();
	}

}
