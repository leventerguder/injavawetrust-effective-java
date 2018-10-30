package chapter10.item75;

public class Item75Notes {

	// #####
	// Item 75: Include failure-capture information in detail messages

	// When a program fails due to an uncaught exception, the system automatically
	// prints out the exception’s stack trace. The stack trace contains the
	// exception’s string representation, the result of invoking its toString method

	// To capture a failure, the detail message of an exception should contain the
	// values of all parameters and fields that contributed to the exception.

	// For example, the detail message of an IndexOutOfBoundsException should
	// contain the lower bound, the upper bound, and the index value that failed to
	// lie between the bounds.

	// One caveat concerns security-sensitive information.
	// Because stack traces may be seen by many people in the process of diagnosing
	// and fixing software issues, do not include passwords, encryption keys, and
	// the like in detail messages.

	// The detail message of an exception should not be confused with a user- level
	// error message, which must be intelligible to end users. Unlike a user- level
	// error message, the detail message is primarily for the benefit of programmers
	// or site reliability engineers, when analyzing a failure. Therefore,
	// information content is far more important than readability. User-level error
	// messages are often localized, whereas exception detail messages rarely are.


	// As suggested in Item 70, it may be appropriate for an exception to provide
	// accessor methods for its failure-capture information (lowerBound, upperBound,
	// and index in the above example). It is more important to provide such
	// accessor methods on checked exceptions than unchecked, because the
	// failure-capture information could be useful in recovering from the failure.
	// It is rare (although not inconceivable) that a programmer might want
	// programmatic access to the details of an unchecked exception. Even for
	// unchecked exceptions, however, it seems advisable to provide these accessors
	// on general principle (Item 12, page 57).

}
