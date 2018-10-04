package chapter04.item20;

public class Item20Notes {

	// ####
	// Item 20 : Prefer interfaces to abstract classes
	// Java has two mechanism to define a type that permits multiple implementations
	// : interfaces and abstract classes.
	// Since the introduction of default methods for interfaces in Java8 , both
	// mechanisms allow you to prodcide implementations for some instance methods.
	// A major difference is that to implement the type defined by an abstract class
	// ,a class must be a subclass of the abstract class.

	// ####
	// Existing classes can easily be retrofitted to implement a new interface
	// All you have to do is to add the required methods, if they dont yet exist and
	// to add an implements clause to the class declaration.

	// Interfaces are ideal for defining mixins.
	// A mixin is a type that a class can implement in addition to its primary type
	// , to declare that it provides some optional behavior.
	// For example , Comparable is a mixin interface that allows a class to declare
	// that its instances are ordered with respect to other mutually comparable
	// objects.
	// Such an interface is called mixin because it allows the optional
	// functionality to be mixed in to the type's primary functionality.

	// Abstract class cant be used to define mixins for the same reason that they
	// cant be retrofitted onto existing classes : a class cannot have mor than one
	// parent , and there is no reasonable place in the class hierarchy to insert a
	// mixing.

	// Interfaces allow for the construction of nonhierarchical type frameworks.

	// Interfaces enable safe , powerful functionality enhancements via the wrapper
	// class idiom (Item 18)
	// If you use abstract classes to define types , you leave the programmer who
	// wants to add functionality wtih no alternative but inheritance.
	// The resulting classes are less powerful and more fragile than wrapper
	// classes.

	// You can, however, combine the advantages of interfaces and abstract classes
	// by providing an abstract skeletal implementation class to go with an
	// interface.

	// The interface defines the type, perhaps providing some default methods, while
	// the skeletal implementation class implements the remaining non-primitive
	// interface methods atop the primitive interface methods. Extending a skeletal
	// implementation takes most of the work out of implementing an interface. This
	// is the Template Method pattern TODO

	// By convention , skeletal implementation classes are called AbstractInterface,
	// where Intereface is name of the interface they implement.
	// For example AbsttractCollection , AbstractSet , AbstractList ...

	// When properly designed , skeletal implementatons can make it very easy for
	// programmers to provide their own implementetations of an interface.

	// if a class cannot be made to extend the skeletal implementation , the class
	// can always implement the interface directly.
	// The class still benefits from any default methods present on the interface
	// itself.

	// The class implementing the interface can forward invocations of interface
	// methods to a contained instance of a private inner class that extends the
	// skeletal implementation. This technique, known as simulated multiple
	// inheritance, is closely related to the wrapper class idiom discussed in Item
	// 18

	// Skeletal implementations are designed for inheritance , you should follow all
	// of the design and documentation guidelines in Item 19.

	// For brevity’s sake, the documentation comments were omitted from the previous
	// example, but good documentation is absolutely essential in a skeletal
	// implementation, whether it consists of default methods on an interface or a
	// separate abstract class.

	// To summarize, an interface is generally the best way to define a type that
	// permits multiple implementations. If you export a nontrivial interface, you
	// should strongly consider providing a skeletal implementation to go with it.
	// To the extent possible, you should provide the skeletal implementation via
	// default methods on the interface so that all implementors of the interface
	// can make use of it. That said, restrictions on interfaces typically mandate
	// that a skeletal implementation take the form of an abstract class.

}
