package bit;

public class Number_Of_1_Bits {
	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >>> 1;
		}
		return count;
	}

	public int hammingWeight_2(int n) {
		int count = 0;
		int a = 1;
		while (a != 0) {
			if ((n & a) == a)
				count++;
			a = a << 1;
		}
		return count;
	}
}
