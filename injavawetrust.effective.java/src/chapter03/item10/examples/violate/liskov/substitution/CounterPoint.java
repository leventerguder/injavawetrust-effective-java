package chapter03.item10.examples.violate.liskov.substitution;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point {

	private static final AtomicInteger counter = new AtomicInteger();

	public CounterPoint(int x, int y) {
		super(x, y);
		counter.incrementAndGet();
	}

	public static int numberCreated() {
		return counter.get();
	}

}
