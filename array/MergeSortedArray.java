package array;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int len = m + n - 1;
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
		}
		m--;
		n--;
		while (m >= 0 && n >= 0) {
			if (nums1[m] > nums2[n]) {
				nums1[len--] = nums1[m--];
			} else {
				nums1[len--] = nums2[n--];
			}
		}
		System.out.println("n:" + n);
		System.out.println("m:" + m);
		while (m >= 0) {
			nums1[len--] = nums1[m--];
		}
		while (n >= 0) {
			nums1[len--] = nums2[n--];
		}
		for (int i : nums1) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 0 };
		int b[] = { 1 };
		merge(a, 1, b, 1);
	}

}
