package math;

public class UglyNumber {
	 public boolean isUgly(int num) {
	        if(num == 1 || num == 0)
	            return true;
	        if(num % 2 == 0)
	            return isUgly(num / 2);
	        else if(num % 3 == 0)
	            return isUgly(num / 3);
	        else if(num % 5 == 0)
	            return isUgly(num / 5);
	        else
	            return false; 
	    }
}
