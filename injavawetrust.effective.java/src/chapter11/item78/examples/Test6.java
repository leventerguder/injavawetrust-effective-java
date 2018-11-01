package chapter11.item78.examples;

import java.util.concurrent.atomic.AtomicLong;

public class Test6 {

	// use the class AtomicLong, which is part of java.util.concurrent.atomic.

	private static final AtomicLong nextSerialNum = new AtomicLong();

	public static long generateSerialNumber() {
		return nextSerialNum.getAndIncrement();
	}

}
