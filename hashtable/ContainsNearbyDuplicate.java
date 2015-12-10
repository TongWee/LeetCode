package hashtable;

import java.util.Hashtable;

public class ContainsNearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums == null || k == 0) {
			return false;
		}
		Hashtable hashtable = new Hashtable();
		for (int i = 0; i < nums.length; i++) {
			if (hashtable.containsKey(nums[i])) {
				int j = (Integer) hashtable.get(nums[i]);
				if (Math.abs(i - j) != 0 && Math.abs(i - j) <= k)
					return true;
			}
			hashtable.put(nums[i], i);
		}
		return false;
	}
}
