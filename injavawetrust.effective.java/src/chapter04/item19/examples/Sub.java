package chapter04.item19.examples;

import java.time.Instant;

public final class Sub extends Super {

	private final Instant instant;

	Sub() {
		instant = Instant.now();
	}

	// overriding method invoked by superclass constructor
	@Override
	public void overrideMe() {
		System.out.println(instant);
	}
	
}
