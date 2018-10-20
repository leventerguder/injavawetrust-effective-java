package chapter09.item62.examples;

import java.util.Iterator;

public class Test1 {

	String className = "name";
	Iterator<String> i;
	// Inappropriate use of string as aggregate type
	String compoundKey = className + "#" + i.next();

	/*
	 * This approach has many disadvantages. If the character used to separate
	 * fields occurs in one of the fields, chaos may result. To access individual
	 * fields, you have to parse the string, which is slow, tedious, and
	 * error-prone.
	 */

	/*
	 * A better approach is simply to write a class to represent the aggregate,
	 * often a private static member class (Item 24).
	 */
}
