package coding_interviews;

//P103
public class Reorder {

	public static void reorder(int[] a) {
		int l = 0, r = a.length - 1;
		while (l < r) {
			// left is even
			while (l < r && !isEven(a[l])) {
				l++;
			}
			// right is not even
			while (l < r && isEven(a[r])) {
				r--;
			}
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
		for (int i : a)
			System.out.print(i + " ");
	}

	// ÊÇÅ¼Êý·µ»Øtrue
	private static boolean isEven(int n) {
		return (n & 1) == 0;
	}

	public static void main(String[] args) {
		int a[] = { 1, 3 };
		reorder(a);
	}

}
