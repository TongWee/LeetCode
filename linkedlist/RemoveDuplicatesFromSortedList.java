package linkedlist;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		ListNode res = head, left = head, right = head.next;
		while (head.next != null && right != null) {
			if (left.val != right.val) {
				left.next = right;
				left = right;
			}
			right = right.next;
		}
		left.next = right;
		return res;
	}
}
