package coding_interviews;

//P46
public class Replace_Space {
	public static void replaceSpace(String s) {
		int len = s.length(), space_count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				space_count++;
		}
		int p1 = len - 1, p2 = 2 * space_count + len - 1;
		char res[] = new char[p2 + 1];
		char src[] = s.toCharArray();
		while (p1 > 0 && p2 > p1) {
			if (src[p1] == ' ') {
				res[p2--] = '0';
				res[p2--] = '2';
				res[p2--] = '%';
			} else {
				res[p2--] = src[p1];
			}
			p1--;
		}
		while (p1 >= 0 && p2 >= 0) {
			res[p2--] = src[p1--];
		}
	}
}
