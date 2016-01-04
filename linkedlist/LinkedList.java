package linkedlist;

public class LinkedList {
	public static ListNode getListdata(int a[]) {
		ListNode root = new ListNode(a[0]);
		ListNode node = root, next;
		for (int i = 1; i < a.length; i++) {
			next = new ListNode(a[i]);
			node.next = next;
			next.next = null;
			node = next;
		}
		return root;
	}
}
