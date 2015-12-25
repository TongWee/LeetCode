package coding_interviews;

public class ListNode {
	public ListNode(int _key) {
		this.key = _key;
	}

	int key;
	ListNode next;

	public String getKey() {
		return Integer.toString(key);
	}
}
