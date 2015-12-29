package coding_interviews;

import java.util.Date;

public class MyTimer {
	private static long start;
	private static long stop;

	public static void start() {
		start = System.currentTimeMillis();
	}

	public static void stop() {
		stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}
}
