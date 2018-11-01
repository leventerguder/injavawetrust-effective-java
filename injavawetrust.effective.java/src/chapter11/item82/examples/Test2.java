package chapter11.item82.examples;

public class Test2 {



	// Private lock object idiom - thwarts denial-of-service attack
	private final Object lock = new Object();

	public void foo() {
		synchronized (lock) {
			// ....
		}
	}
}
