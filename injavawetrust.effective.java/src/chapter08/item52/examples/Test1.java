package chapter08.item52.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

	// The addition of lambdas and method references in Java 8 further increased the
	// potential for confusion in overloading

	public static void main(String[] args) {

		new Thread(System.out::println).start();
		ExecutorService exec = Executors.newCachedThreadPool();
		// exec.submit(System.out::println); // compile error
		// The method submit(Callable<Object>) is ambiguous for the type ExecutorService

		// The surprising answer is that the submit method has an overloading that takes
		// a Callable<T>, while the Thread constructor does not.
	}
}
