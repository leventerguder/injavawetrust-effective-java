package chapter11.item80.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

	public static void main(String[] args) {

		ExecutorService exec = Executors.newSingleThreadExecutor();

		exec.execute(() -> System.out.println(Thread.currentThread().getName()));
	}
}
