package chapter09.item65.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class Test1 {

	// Reflective instantiation with interface access
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Class<? extends Set<String>> c1 = null;

		String className = "java.util.HashSet";
		args = new String[] { "e", "e2", "e3" };
		//
		try {
			c1 = (Class<? extends Set<String>>) Class.forName(className); // Unchecked cast
		} catch (ClassNotFoundException e) {
			fatalError("Class not found.");
		}

		Constructor<? extends Set<String>> cons = null;
		try {
			cons = c1.getDeclaredConstructor();
		} catch (NoSuchMethodException e) {
			fatalError("No parameterless constructor");
		}

		// Instantiate the set
		Set<String> s = null;

		try {
			s = cons.newInstance();
		} catch (InstantiationException e) {
			fatalError("Class not instantiable.");
		} catch (IllegalAccessException e) {
			fatalError("Constructor not accessible");
		} catch (IllegalArgumentException e) {
			fatalError("IllegalArgumentException");
		} catch (InvocationTargetException e) {
			fatalError("InvocationTargetException");
		}

		// Exercise the set
		s.addAll(Arrays.asList(args).subList(1, args.length));
		System.out.println(s);

		/*
		 * This example demonstrates two disadvantages of reflection. First, the example
		 * can generate six different exceptions at runtime, all of which would have
		 * been compile-time errors if reflective instantiation were not used.
		 */

		/*
		 * The second disadvantage is that it takes twenty-five lines of tedious code to
		 * generate an instance of the class from its name, whereas a constructor
		 * invocation would fit neatly on a single line.
		 */

		/*
		 * The length of the program could be reduced by catching
		 * ReflectiveOperationException, a superclass of the various reflective
		 * exceptions that was introduced in Java 7
		 */

	}

	private static void fatalError(String msg) {
		System.err.println(msg);
		System.exit(1);
	}

}
