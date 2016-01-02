package array;

public class Rotate_Array {
	public static void rotate(int[] nums, int k) {
		int[] res = new int[nums.length];
		k = k % nums.length;
		for (int i = 0; i < nums.length;) {
			for (int m = k; m < res.length; m++) {
				res[m] = nums[i];
				i++;
			}
			for (int n = 0; n < k; n++) {
				res[n] = nums[i];
				i++;
			}
		}
		nums = res;
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		rotate(nums, 1);
	}
}
