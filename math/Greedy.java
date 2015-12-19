package math;

public class Greedy {
	public static int aveCard(int a[]) {
		int sum = 0;
		int count = 0;
		for (int i : a)
			sum += i;
		int ave = sum / a.length;
		for (int i = 0; i < a.length - 1; i++) {
			int c = a[i] - ave;
			if (c > 0) {
				a[i] -= c;
				a[i + 1] += c;
				count++;
			}
			if (c < 0) {
				a[i] -= c;
				a[i + 1] += c;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int a[] = { 13, 8, 7, 12 };
		System.out.println(aveCard(a));
	}

}
