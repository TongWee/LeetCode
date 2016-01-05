package math;

public class Excel_Sheet_C_Number {
	public static int titleToNumber(String s) {
		int number = 0;
		char[] chs = s.toCharArray();
		for (int i = chs.length - 1; i >= 0; i--) {
			number += Math.pow(26, i) * (chs[i] - 'A' + 1);
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("ZA"));
	}
}
