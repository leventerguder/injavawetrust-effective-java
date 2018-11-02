package chapter11.item84.examples;

// Awful CountDownLatch implementation - busy-waits incessantly!
public class SlowCountDownLatch {

	private int count;

	public SlowCountDownLatch(int count) {
		if (count < 0)
			throw new IllegalArgumentException(count + "< 0");
		this.count = count;
	}

	public void await() {
		while (true) {
			synchronized (this) {
				if (count == 0)
					return;
			}
		}
	}

	public synchronized void countDown() {
		if (count != 0)
			count--;
	}

	// When faced with a program that barely works because some threads aren’t
	// getting enough CPU time relative to others, resist the temptation to “fix”
	// the program by putting in calls to Thread.yield.

	// Thread.yield has no testable semantics.
	// A better course of action is to restructure the application to reduce the
	// number of concurrently runnable threads.
}
