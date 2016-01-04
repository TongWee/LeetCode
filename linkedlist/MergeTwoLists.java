package linkedlist;

public class MergeTwoLists {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode head, res;
		if (p1.val <= p2.val) {
			head = p1;
			p1 = p1.next;
		} else {
			head = p2;
			p2 = p2.next;
		}
		res = head;
		while (p1 != null && p2 != null) {
			if (p1.val <= p2.val) {
				head.next = p1;
				p1 = p1.next;
				head = head.next;
			} else {
				head.next = p2;
				p2 = p2.next;
				head = head.next;
			}
		}
		if (p1 == null)
			head.next = p2;
		else
			head.next = p1;
		return res;
	}

	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 9 };
		int[] b = { 1, 2, 5, 6, 7, 8, 8, 10 };
		ListNode aa = LinkedList.getListdata(a);
		ListNode bb = LinkedList.getListdata(b);
		ListNode res = mergeTwoLists(aa, bb);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}

	}
}
