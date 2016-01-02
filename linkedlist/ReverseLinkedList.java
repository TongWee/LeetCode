package linkedlist;

public class ReverseLinkedList {
	public static ListNode reverseList(ListNode head) {
		ListNode tempNode = null;
		while (head != null) {
			ListNode nextNode = head.next;
			head.next = tempNode;
			tempNode = head;
			head = nextNode;
		}
		return tempNode;
	}

	public static ListNode reverseList_recursive(ListNode head) {
		if (head == null)
			return head;
		ListNode nextNode = head.next;
		head.next = null;
		if (nextNode != null) {
			ListNode root = reverseList_recursive(nextNode);
			nextNode.next = head;
			return root;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		reverseList_recursive(l1);
		System.out.println(l3.val);
		System.out.println(l3.next.val);
		System.out.println(l3.next.next.val);
	}
}
