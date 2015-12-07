package linkedlist;

public class Delete_Node {
	public void deleteNode(ListNode node) {
		if (node.next == null) {
			node = null;
		} else {
			node.val = node.next.val;
			node.next = node.next.next;
		}
	}
}
