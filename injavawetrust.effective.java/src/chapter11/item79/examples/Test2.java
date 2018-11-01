package chapter11.item79.examples;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

		set.addObserver(new SetObserver<>() {
			public void added(ObservableSet<Integer> s, Integer e) {
				System.out.println(e);
				if (e == 23)
					s.removeObserver(this);
			}
		});

		for (int i = 0; i < 100; i++)
			set.add(i);
		

		// You might expect the program to print the numbers 0 through 23, after which
		// the observer would unsubscribe and the program would terminate silently. In
		// fact, it prints these numbers and then throws a
		// ConcurrentModificationException. The problem is that notifyElementAdded is in
		// the process of iterating over the observers list when it invokes the
		// observer’s added method.
		
		// The added method calls the observable set’s removeObserver method, which in
		// turn calls the method observers.remove. Now we’re in trouble. We are trying
		// to remove an element from a list in the midst of iterating over it, which is
		// illegal.
	}
}