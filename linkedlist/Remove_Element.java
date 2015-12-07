package linkedlist;

public class Remove_Element {
	public ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) {
			head = head.next;
		}
		ListNode srcHead = head;
		if (head == null)
			return null;
		while (head.next != null) {
			if (head.next.val == val) {
				head.next = head.next.next;
			} else
				head = head.next;
		}
		return srcHead;
	}
}
