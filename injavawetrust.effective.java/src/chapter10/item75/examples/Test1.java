package chapter10.item75.examples;

public class Test1 {
}

// One way to ensure that exceptions contain adequate failure-capture
// information in their detail messages is to require this information in their
// constructors instead of a string detail message. The detail message can then
// be generated automatically to include the information. For example, instead
// of a String constructor, IndexOutOfBoundsException could have had a
// constructor that looks like this:

class IndexOutOfBoundsExceptionV1 extends Exception {
	/**
	 * Constructs an IndexOutOfBoundsExceptionV1.
	 *
	 * @param lowerBound the lowest legal index value
	 * @param upperBound the highest legal index value plus one
	 * @param index      the actual index value
	 */

	int lowerBound;
	int upperBound;
	int index;

	public IndexOutOfBoundsExceptionV1(int lowerBound, int upperBound, int index) {
		// Generate a detail message that captures the failure
		super(String.format("Lower bound: %d, Upper bound: %d, Index:%d", lowerBound, upperBound, index));
		// Save failure information for programmatic access
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}
}

// As of Java 9, IndexOutOfBoundsException finally acquired a constructor that
// takes an int valued index parameter, but sadly it omits the lowerBound and
// upperBound parameters. More generally, the Java libraries don’t make heavy
// use of this idiom, but it is highly recommended. It makes it easy for the
// programmer throwing an exception to capture the failure. In fact, it makes it
// hard for the programmer not to capture the failure! In effect, the idiom
// centralizes the code to generate a high-quality detail message in the
// exception class, rather than requiring each user of the class to generate the
// detail message redundantly.

/**
 * Constructs a new {@code IndexOutOfBoundsException} class with an argument
 * indicating the illegal index.
 *
 * <p>
 * The index is included in this exception's detail message. The exact
 * presentation format of the detail message is unspecified.
 *
 * @param index the illegal index.
 * @since 9
 */
// public IndexOutOfBoundsException(int index) {
// super("Index out of range: " + index);
// }
//
