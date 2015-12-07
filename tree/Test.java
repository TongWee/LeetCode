package tree;

public class Test {

	public static void main(String[] args) {
		Common common = new Common();
		TreeNode tree = common.getRoot();
		System.out.println(new Minimum_Depth().minDepth(tree));
	}
}
