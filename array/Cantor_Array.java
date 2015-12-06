package array;

public class Cantor_Array {
	public int[] generateCantor(int[] a) {
		int[] b = new int[a.length];
		if (a.length == 1) {
			b[0] = 0;
			return b;
		}
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (j == a.length)
					break;
				if (a[i] > a[j])
					count++;
			}
			b[i] = count;
		}
		return b;
	}
}
