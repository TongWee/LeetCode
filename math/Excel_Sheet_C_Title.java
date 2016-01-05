package math;

public class Excel_Sheet_C_Title {
	public static String convertToTitle(int n) {
		String res = "";
		int temp = n, count = 0;
		while (n != 0) {
			n = n - 1;
			temp = n % 26;
			n = n / 26;
			char c = (char) ('A' + temp);
			res = c + res;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(convertToTitle(27));

	}

}
