package chapter08.item50;

public class Item50Notes {

	// #####
	// Item 50: Make defensive copies when needed

	// One thing that makes Java a pleasure to use is that it is a safe language.
	// This means that in the absence of native methods it is immune to buffer
	// overruns, array overruns, wild pointers, and other memory corruption errors
	// that plague unsafe languages such as C and C++. In a safe language, it is
	// possible to write classes and to know with certainty that their invariants
	// will hold, no matter what happens in any other part of the system. This is
	// not possible in languages that treat all of memory as one giant array.

	// You must program defensively, with the assumption that clients of your class
	// will do their best to destroy its invariants.
	// This is increasingly true as people try harder to break the security of
	// systems, but more commonly, your class will have to cope with unexpected
	// behavior resulting from the honest mistakes of well-intentioned programmers.

	// Date is obsolete and should no longer be used in new code.

	// it is essential to make a defensive copy of each mutable parameter to the
	// constructor

	// To prevent this sort of attack, do not use the clone method to make a
	// defensive copy of a parameter whose type is subclassable by untrusted
	// parties.

	// Defensive copying of parameters is not just for immutable classes. Any time
	// you write a method or constructor that stores a reference to a client-
	// provided object in an internal data structure, think about whether the
	// client- provided object is potentially mutable.

	// Whether or not your class is immutable, you should think twice before
	// returning a reference to an internal component that is mutable. Chances are,
	// you should return a defensive copy. Remember that nonzero-length arrays are
	// always mutable.

	// Therefore, you should always make a defensive copy of an internal array
	// before returning it to a client.

	// Arguably, the real lesson in all of this is that you should, where possible,
	// use immutable objects as components of your objects so that you that don’t
	// have to worry about defensive copying (Item 17)

	// In summary, if a class has mutable components that it gets from or returns to
	// its clients, the class must defensively copy these components. If the cost of
	// the copy would be prohibitive and the class trusts its clients not to modify
	// the components inappropriately, then the defensive copy may be replaced by
	// documentation outlining the client’s responsibility not to modify the
	// affected components.

}
