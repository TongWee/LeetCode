package coding_interviews;

import java.util.Stack;

public class LinkedList {

	/**
	 * ��β��ͷ�������� ջ����
	 * 
	 * @param ����ͷ���
	 */
	public static void tailToHead(ListNode a) {
		Stack stack = new Stack();
		while (a != null) {
			stack.push(a);
			a = a.next;
		}
		while (!stack.isEmpty()) {
			ListNode temp = (ListNode) stack.pop();
			System.out.print(temp.getKey() + " ");
		}
	}

	/**
	 * ��β��ͷ�������� �ݹ鷽��
	 * 
	 * @param ����ͷ���
	 */
	public static void tailToHead_2(ListNode a) {
		if (a == null)
			return;
		tailToHead_2(a.next);
		System.out.print(a.key + " ");
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		tailToHead_2(a);
	}
}
