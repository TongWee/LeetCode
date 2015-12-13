package hashtable;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.indexOf(i))) {
				map.put(s.charAt(i), t.charAt(i));
			} else {
				if (map.get(s.charAt(i)) != t.charAt(i))
					return false;
			}
		}
		return s.length() == t.length();
	}

	public static void main(String[] args) {
		String s1 = "112";
		String s2 = "111";
		System.out.println(isIsomorphic(s1, s2));
	}
}
