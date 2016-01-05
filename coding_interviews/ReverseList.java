package coding_interviews;

public class ReverseList {

	public ListNode reverseList(ListNode head) {
		ListNode reverse = null;
		ListNode node = head;
		ListNode pre = null;
		while (node != null) {
			ListNode next = node.next;
			if (next == null)
				reverse = node;
			node.next = pre;
			pre = node;
			node = next;
		}
		return reverse;
	}

	public static void main(String[] args) {

	}
}
