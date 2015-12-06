package math;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
	public boolean isHappy(int n) {
		if (n <= 0) {
			return false;
		}
		Set<Long> result = new HashSet<Long>();
		long temp_n = n;
		long sum = 0;
		while (sum <= Integer.MAX_VALUE) {
			if (result.contains(sum))
				return false;
			result.add(sum);
			sum = 0;
			while (temp_n != 0) {
				long yu = temp_n % 10;
				sum += yu * yu;
				temp_n = temp_n / 10;
			}
			temp_n = sum;
			if (sum == 1)
				return true;
		}
		return false;
	}
}
