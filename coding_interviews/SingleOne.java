package coding_interviews;

//P82
public class SingleOne {
	public boolean singleNumberOne(int n) {
		return ((n - 1) & n) == 0;
	}
}
