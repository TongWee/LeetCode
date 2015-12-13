package string;

public class Compare_Version_Num {
	public int compareVersion(String version1, String version2) {
		String[] s1 = version1.split("\\."), s2 = version2.split("\\.");
		int i;
		for (i = 0; i < s1.length && i < s2.length; i++)
			if (stoi(s1[i]) != stoi(s2[i]))
				return stoi(s1[i]) > stoi(s2[i]) ? 1 : -1;
		for (; i < s1.length; i++)
			if (stoi(s1[i]) != 0)
				return 1;
		for (; i < s2.length; i++)
			if (stoi(s2[i]) != 0)
				return -1;
		return 0;
	}

	public int stoi(String str) {
		return Integer.parseInt(str);
	}
}
