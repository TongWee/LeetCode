package sort;

public class Valid_Anagram {
	public boolean isAnagram(String s, String t) {
		int[] charsMap = new int['z' - 'a' + 1];
		for (char chr : s.toCharArray()) {
			int pos = chr - 'a';
			charsMap[pos]++;
		}
		for (char chr : t.toCharArray()) {
			int pos = chr - 't';
			charsMap[pos]--;
		}
		for (int i : charsMap)
			if (i != 0)
				return false;
		return true;
	}
}
