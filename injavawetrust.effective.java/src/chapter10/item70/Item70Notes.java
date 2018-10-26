package chapter10.item70;

public class Item70Notes {

	// #####
	// Item 70 : Use checked exceptions for recoverable conditions and runtime
	// exceptions for programming errors

	// Java provides three kinds of throwables: checked exceptions, runtime
	// exceptions, and errors.

	// The cardinal rule in deciding whether to use a checked or an unchecked
	// exception is this: use checked exceptions for conditions from which the
	// caller can reasonably be expected to recover.

	// By throwing a checked exception, you force the caller to handle the exception
	// in a catch clause or to propagate it outward. Each checked exception that a
	// method is declared to throw is therefore a potent indication to the API user
	// that the associated condition is a possible outcome of invoking the method.

	// There are two kinds of unchecked throwables: runtime exceptions and errors.
	// They are identical in their behavior: both are throwables that needn’t, and
	// generally shouldn’t, be caught. If a program throws an unchecked exception or
	// an error, it is generally the case that recovery is impossible and continued
	// execution would do more harm than good. If a program does not catch such a
	// throwable, it will cause the current thread to halt with an appropriate error
	// message.

	// Use runtime exceptions to indicate programming errors. The great majority of
	// runtime exceptions indicate precondition violations. A precondition violation
	// is simply a failure by the client of an API to adhere to the contract
	// established by the API specification. For example, the contract for array
	// access specifies that the array index must be between zero and the array
	// length minus one, inclusive.
	// ArrayIndexOutOfBoundsException indicates that this precondition was violated.

	// all of the unchecked throwables you implement should subclass
	// RuntimeException
	// (directly or indirectly). Not only shouldn’t you define Error subclasses, but
	// with the exception of AssertionError, you shouldn’t throw them either.

	// To summarize, throw checked exceptions for recoverable conditions and
	// unchecked exceptions for programming errors. When in doubt, throw unchecked
	// exceptions. Don’t define any throwables that are neither checked
	// exceptions nor runtime exceptions. Provide methods on your checked exceptions
	// to aid in recovery.
}
