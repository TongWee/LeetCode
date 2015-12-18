package hashtable;

import java.util.Hashtable;

public class Word_Pattern {
	public static boolean wordPattern(String pattern, String str) {
		String strs[] = str.split(" ");
		char pats[] = pattern.toCharArray();
		Hashtable<Character, String> ht = new Hashtable<>();
		if (strs.length != pats.length)
			return false;
		for (int i = 0; i < strs.length; i++) {
			if (!ht.containsKey(pats[i])) {
				if (ht.containsValue(strs[i]))
					return false;
				ht.put(pats[i], strs[i]);
			} else {
				if (!ht.get(pats[i]).equals(strs[i]))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(wordPattern(pattern, str));
	}

}
