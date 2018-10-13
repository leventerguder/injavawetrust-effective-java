package chapter06.item39.examples;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

	public static void main(String[] args) throws ClassNotFoundException {

		int tests = 0;
		int passed = 0;
		///
		Class<?> testClass = Class.forName("chapter06.item39.examples.Sample");

		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				tests++;
				try {
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed : " + exc);
				} catch (Exception e) {
					System.out.println("Invalid @Test : " + m);
				}
			}
		}

		System.out.println("tests :  " + tests + " , passed : " + passed + " failed : " + (tests - passed));
	}

	// The isAnnotationPresent method tells the tool which methods to run.
	// if a test method throws an exception , the reflection facility wraps it in an
	// InvocationTargetException

	// If an attempt to invoke a test method by reflection throws any exception
	// other than InvocationTargetException, it indicates an invalid use of
	// the Test annotation that was not caught at compile time.
}
