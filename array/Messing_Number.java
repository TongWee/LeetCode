package array;

public class Messing_Number {
	public int missingNumber(int[] nums) {
		int sum_cor = (nums.length) * (nums.length + 1) / 2;
		int sum_err = 0;
		for (int i : nums) {
			sum_err += i;
		}
		return sum_cor - sum_err;
	}
}