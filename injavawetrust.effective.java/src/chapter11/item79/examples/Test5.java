package chapter11.item79.examples;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test5 {
	public static void main(String[] args) {

		ObservableSet3<Integer> set = new ObservableSet3<>(new HashSet<>());

		set.addObserver(new SetObserver3<>() {
			public void added(ObservableSet3<Integer> s, Integer e) {
				System.out.println(e);
				if (e == 23) {
					ExecutorService exec = Executors.newSingleThreadExecutor();
					try {
						exec.submit(() -> s.removeObserver(this)).get();
					} catch (ExecutionException | InterruptedException ex) {
						throw new AssertionError(ex);
					} finally {
						exec.shutdown();
					}
				}
			}
		});

		for (int i = 0; i < 100; i++)
			set.add(i);
	}
}