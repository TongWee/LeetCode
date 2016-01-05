package array;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		String[] strs = s.split(" ");
		if (strs.length == 0)
			return 0;
		return strs[strs.length - 1].length();
	}

	public static void main(String args[]) {
		String s = "  ss ssds  ";
		System.out.println(lengthOfLastWord(s));
	}
}
