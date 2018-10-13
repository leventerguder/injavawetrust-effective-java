package chapter06.item39.examples;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests4 {

	public static void main(String[] args) throws ClassNotFoundException {

		int tests = 0;
		int passed = 0;
		///
		Class<?> testClass = Class.forName("chapter06.item39.examples.Sample4");

		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(ExceptionTestV3.class) || m.isAnnotationPresent(ExceptionTestContainer.class)) {
				tests++;
				try {
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (InvocationTargetException wrappedEx) {
					Throwable exc = wrappedEx.getCause();
					int oldPassed = passed;
					ExceptionTestV3[] excTests = m.getAnnotationsByType(ExceptionTestV3.class);
					for (ExceptionTestV3 excTest : excTests) {
						if (excTest.value().isInstance(exc)) {
							passed++;
							break;
						}
					}

					if (passed == oldPassed) {
						System.out.printf("Test %s failed: %s %n", m, exc);
					}

				} catch (Exception e) {
					System.out.println("Invalid @Test : " + m);
				}
			}
		}

		System.out.println("tests :  " + tests + " , passed : " + passed + " failed : " + (tests - passed));
	}
}
