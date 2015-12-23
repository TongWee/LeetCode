package array;

public class Rotate_Array {
	public static void rotate(int[] nums, int k) {
		int[] res = new int[nums.length];
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
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(nums, 3);
	}
}
