package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public static List<Integer> majorityElement_2(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int step = (nums.length - 1) / 3;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - step;) {
			if (nums[i] == nums[i + step]) {
				list.add(nums[i]);
				i = i + step;
			} else
				i++;
		}
		return list;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 4, 5, 5, 4, 5 };
		List<Integer> list = majorityElement_2(a);
		for (int i : list)
			System.out.println(i + " ");
	}
}
