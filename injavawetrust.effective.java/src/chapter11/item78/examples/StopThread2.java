package chapter11.item78.examples;

import java.util.concurrent.TimeUnit;

//Broken! - How long would you expect this program to run?
public class StopThread2 {
	private static boolean stopRequested;

	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			if (!stopRequested)
				while (true)
					i++;
		});
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}

	// This optimization is known as hoisting, and it is precisely what the OpenJDK
	// Server VM does. The result is a liveness failure: the program fails to make
	// progress. One way to fix the problem is to synchronize access to the
	// stopRequested field.

}