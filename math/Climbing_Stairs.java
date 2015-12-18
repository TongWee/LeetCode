package math;

public class Climbing_Stairs {
	public static int climbStairs(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int f[] = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		f[2] = 2;
		for (int i = 3; i < f.length; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 37; i++)
			System.out.print(climbStairs(i) + " ");
	}
}
