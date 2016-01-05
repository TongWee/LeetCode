package coding_interviews;

public class RotateArrayMin {
	public static int getMin(int a[]) {
		int i = 0, j = a.length - 1;
		if (i == j)
			return a[0];
		boolean isFrontBreak = false;
		while (i < j && i < a.length - 1 && j > 0) {
			if (a[i] < a[i + 1]) {
				i++;
			} else {
				isFrontBreak = true;
				break;
			}
			if (a[j] > a[j - 1]) {
				j--;
			} else {
				isFrontBreak = false;
				break;
			}
		}
		if (isFrontBreak)
			return a[i + 1];
		else
			return a[j - 1];
	}

	public static int getMin_2(int[] a) {
		if (a.length == 1)
			return a[0];
		int p1 = 0, p2 = a.length - 1;
		int mid = p1;
		// p1 前置有序子数组的最小元素
		// p2 后置有序子数组的最大元素
		// 需满足 p1 > p2
		while (a[p1] >= a[p2]) {
			if (p2 - p1 == 1) {
				mid = p2;
				break;
			}
			mid = (p1 + p2) / 2;
			if (a[p1] < a[mid]) {
				p1 = mid;
			} else if (a[p2] > a[mid]) {
				p2 = mid;
			}
		}
		return a[mid];
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println(getMin_2(a));
	}

}
