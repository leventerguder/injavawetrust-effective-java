package chapter11.item78.examples;

import java.util.concurrent.TimeUnit;

//Broken! - How long would you expect this program to run?
public class StopThread {
	private static boolean stopRequested;

	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!stopRequested)
				i++;
		});
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}
	// You might expect this program to run for about a second, after which the main
	// thread sets stopRequested to true, causing the background thread’s loop to
	// terminate. On my machine, however, the program never terminates: the
	// background thread loops forever!

	// The problem is that in the absence of synchronization, there is no guarantee
	// as to when, if ever, the background thread will see the change in the value
	// of stopRequested made by the main thread.
}