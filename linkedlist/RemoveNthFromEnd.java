package linkedlist;

public class RemoveNthFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		//list is empty
		if (head == null)
			return null;
		//index is zero
		if (n == 0)
			return head;
		ListNode p1 = head, p2 = head;
		int step = n;
		while (p2 != null) {
			if (step <= 0) {
				p1 = p1.next;
			}
			p2 = p2.next;
			step--;
		}
		//Only one node
		if (step == n || p1 == head)
			return null;
		//n is larger than list's length
		if (step > 0){
			return head;
		}
		if(p1.next != null){
			p1.val = p1.next.val;
			if(p1.next.next != null){
				p1.next = p1.next.next;
			}
			else
				p1.next = null;
		}
		else{
			ListNode temp = head;
			while(temp.next.next != null){
				temp = temp.next;				
			}
			temp.next = null;
		}
		return head;
	}

	public static void main(String[] args) {
		int a[] = {1};
		ListNode data = LinkedList.getListdata(a);
		ListNode list = removeNthFromEnd(data, 1);
		while (list != null) {
			System.out.print(list.val + " ");
			list = list.next;
		}
	}

}
