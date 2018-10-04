package chapter04.item21;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

public class Item21Notes {

	// #####
	// Item 21 : Design interfaces for posterity

	// In Java 8 , the default method construct was added , with the intent of
	// allowing the addition of methods to existing interfaces.

	// The declaration for a default method includes a default implementation that
	// is used by all classes that implement the interface
	// but do not implement the default method

	// Default methods are "injected" into existing implementations without the
	// knowledge or consent of their implementors.
	//
	// Many new default methods were added to the core collection interfaces in Java
	// 8,
	// primarily to facilitate the use of lambdas.

	// It is not always possible to write a default method that maintains all
	// invariants of every conceivable implementation.

	// In the presence of default methods , existing implementations of an interface
	// may compile without error or warning but fail at runtime.

	// Using default methods to add new methods to existing interfaces should be
	// avoided unless the need is critical ,
	// in which case you should think long and hard about whether an existing
	// interface implementation might be broken by your default method
	// implementation.

	// The moral is clear. Even though default methods are now a part of the Java
	// platform , it is still of the utmost importance to design interface with
	// great care.

	// While default methods make it possible to add methods to existing interfaces
	// there is great risk in doing so.
	// if an interface contains a minor flaw, it may irritate its users forever;
	// if an interface is severely deficient , it may doom the API that contains it.
	//

	// while it may be possible to correct some interface flaws after an interface
	// is released , you cannot count on it.
}
