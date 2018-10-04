package chapter04.item22;

public class Item22Notes {

	// #####
	// Item 22 : Use interfaces only to define types

	// When a class implements an interface , the interface serves as a type that
	// can be used to refer to instances of the class.
	// That a class implements an interface should therefore say something about
	// what a client can do with instances of the class.
	// It is inappropriate to define an interface for any other purpose.

	// The constant interface pattern is a poor use of interfaces!
	// That a class uses some constants internally is an implementation detail.
	// Implementing a constant interface causes this implementation detail to leak
	// into the class's exported API.

	// It is of no consequence to the users of a class that the class implements a
	// constant interface.
	// In fact , it may even confuse them.
	// Worse , it represent a commitment : if in a future release the class is
	// modified so that is no longer needs to use constants , it still must
	// implement
	// the interface to ensure binary compatibility

	// There are several constant interfaces in the Java platform libraries , such
	// as
	// java.io.ObjectStreamConstants.
	// These interfaces should be regarded as anomalies and should not be emulated.

	// if the constants are strongly tied to an existing class or interface , you
	// should add them to the class or interface.
	// For example , all of the boxed numerical primitive classes , such as Integer
	// and Double , export MIN_VALUE and MAX_VALUE constants.

	// if the constant are best viewed as members of an enumerated type, you should
	// export them with an enum type (Item 34)
	// Otherwise , you should export the constants with a noninstantiable utility
	// class (Item4)

	// use of static import to avoid qualifying constants

	// In summary , interfaces should be used only to define types.
	// They should not be used merely to export constants.

}