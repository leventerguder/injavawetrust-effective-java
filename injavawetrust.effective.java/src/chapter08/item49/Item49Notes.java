package chapter08.item49;

import java.math.BigInteger;

public class Item49Notes {

	// Chapter 8
	// THIS chapter discusses several aspects of method design: how to treat
	// parameters and return values, how to design method signatures, and how to
	// document methods. Much of the material in this chapter applies to
	// constructors as well as to methods. Like Chapter 4, this chapter focuses on
	// usability, robustness, and flexibility.

	// ##### Item 49: Check parameters for validity

	// Most methods and constructors have some restrictions on what values may be
	// passed into their parameters. For example, it is not uncommon that index
	// values must be non-negative and object references must be non-null.

	// You should clearly document all such restrictions and enforce them with
	// checks at the beginning of the method body.

	// This is a special case of the general principle that you

	// If an invalid parameter value is passed to a method and the method checks its
	// parameters before execution, it will fail quickly and cleanly with an
	// appropriate exception.

	// If the method fails to check its parameters, several things could happen. The
	// method could fail with a confusing exception in the midst of processing.
	// Worse, the method could return normally but silently compute the wrong
	// result. Worst of all, the method could return normally but leave some object
	// in a compromised state, causing an error at some unrelated point in the code
	// at some undetermined time in the future. In other words, failure to validate
	// parameters, can result in a violation of failure atomicity (Item 76).

	// For public and protected methods, use the Javadoc @throws tag to document the
	// exception that will be thrown if a restriction on parameter values is
	// violated (Item 74).

	// Typically, the resulting exception will be IllegalArgumentException,
	// IndexOutOfBoundsException, or NullPointerException (Item 72).

	// BigInteger#mod
	/**
	 * Returns a BigInteger whose value is {@code (this mod m}). This method differs
	 * from {@code remainder} in that it always returns a <i>non-negative</i>
	 * BigInteger.
	 *
	 * @param m the modulus.
	 * @return {@code this mod m}
	 * @throws ArithmeticException {@code m} &le; 0
	 * @see #remainder
	 */
	// public BigInteger mod(BigInteger m) {
	// if (m.signum <= 0)
	// throw new ArithmeticException("BigInteger: modulus not positive");
	//
	// BigInteger result = this.remainder(m);
	// return (result.signum >= 0 ? result : result.add(m));
	// }

	// Note that the doc comment does not say “mod throws NullPointerException if m
	// is null,” even though the method does exactly that, as a byproduct of
	// invoking m.signum(). This exception is documented in the class-level doc
	// comment for the enclosing BigInteger class. The class-level comment applies
	// to all parameters in all of the class’s public methods. This is a good way to
	// avoid the clutter of documenting every NullPointerException on every method
	// individually.

	// The Objects.requireNonNull method, added in Java 7, is flexible and
	// convenient, so there’s no reason to perform null checks manually anymore.

	// In Java 9, a range-checking facility was added to java.util.Objects. This
	// facility consists of three methods: checkFromIndexSize, checkFromToIndex, and
	// checkIndex.

	// Constructors represent a special case of the principle that you should check
	// the validity of parameters that are to be stored away for later use. It is
	// critical to check the validity of constructor parameters to prevent the
	// construction of an object that violates its class invariants.
	//

	// Occasionally, a computation implicitly performs a required validity check but
	// throws the wrong exception if the check fails. In other words, the exception
	// that the computation would naturally throw as the result of an invalid
	// parameter value doesn’t match the exception that the method is documented to
	// throw. Under these circumstances, you should use the exception translation
	// idiom, described in Item 73, to translate the natural exception into the
	// correct one.

	// To summarize, each time you write a method or constructor, you should think
	// about what restrictions exist on its parameters. You should document these
	// restrictions and enforce them with explicit checks at the beginning of the
	// method body. It is important to get into the habit of doing this. The modest
	// work that it entails will be paid back with interest the first time a
	// validity check fails.
}
