package array;

public class Move_Zeroes {
	public void moveZeroes(int[] nums) {
		int right = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 0) {
				for (int j = i; j < right; j++) {
					nums[j] = nums[j + 1];
					nums[j + 1] = 0;
				}
				right--;
			}
		}
	}
}
