package chapter11.item78.examples;

import java.util.concurrent.TimeUnit;

//  // Cooperative thread termination with a volatile field
public class StopThread4 {
	private static volatile boolean stopRequested;

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


}
