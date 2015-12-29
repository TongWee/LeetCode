package coding_interviews;

public class MyPow {

	public static double myPow(double a, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return a;
		double res = myPow(a, n >> 1);
		res *= res;
		if ((n & 0x01) != 0)
			res *= a;
		return res;
	}
}
