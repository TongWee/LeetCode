package array;

public class Remove_Element {
	public int removeElement(int[] nums, int val) {
		int len = nums.length - 1;
		for (int i = 0; i < len + 1;) {
			if (val == nums[i]) {
				nums[i] = nums[len];
				len--;
			} else
				i++;
		}
		return len + 1;
	}
}
