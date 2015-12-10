package hashtable;

import java.util.Hashtable;

public class Contains_Duplicate {
	public boolean containsDuplicate(int[] nums) {
		if (nums == null)
			return false;
		Hashtable hashTable = new Hashtable();
		for (int i : nums) {
			if (hashTable.containsKey(i))
				return true;
			hashTable.put(i, "");
		}
		return false;
	}
}
