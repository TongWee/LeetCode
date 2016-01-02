package linkedlist;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return null;
		ListNode temp = head;
		int len = 1;
		while (temp.next != null) {
			temp = temp.next;
			len++;
		}
		temp.next = head;
		k = len - k % len;
		ListNode newHead = null;
		while (true) {
			if (k == 0) {
				newHead = temp.next;
				temp.next = null;
				break;
			}
			temp = temp.next;
			k--;
		}
		return newHead;
	}
}
