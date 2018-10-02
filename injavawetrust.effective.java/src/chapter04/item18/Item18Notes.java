package chapter04.item18;

public class Item18Notes {

	// #####
	// Item 18 : Favor composition over inheritance

	// Inheritance is a powerful way to achieve code reuse , but it is not always
	// the best tool for the job.
	// Used inappropriately, it leads to fragile software.

	// It is safe to use inheritance within a package , where the subclass and the
	// superclass implementations are under the control of the same programmers.

	// It is also safe to use inheritance when extending classes specifically
	// designed and documented for extension (Item 19)

	// Inheriting from ordinary concrete classes across package boundaries ,
	// however, is dangerous.

	// #### Unlike method invocation , inheritance violates encapsulation
	// In other words , a subclass depends on the implementation details of its
	// superclass for its proper function.
	//
	//

	// Inheritance is appropriate only in circumstances where the subclass really is
	// a subtype of the superclass.

	// There are a number of obvious violations of this principle in the Java
	// platform libraries.

	// For example , a stack is not a vector , so Stack should not extend Vector
	// Similaryly,a property list is not a hash table so, Properties should not
	// extend Hashtable
	// In both cases , composition would have been preferable.

	// if you use inheritance where composition is appropriate , you needlessly
	// expose implementation details.
	// The resulting API ties you to the original implementation , forever limitin
	// the performance of your class.

	// To summarize , inheritance is powerful, but it is problematic because it
	// violates encapsulation.
	// It is appropriate only when a genuine subtype relationship exists between the
	// subclass and superclass.
	// Even then , inheritance may lead to fragility if the subclass is in a
	// different package from the superclass and the super class is not designed for
	// inheritance.
	
	// To avoid this fragility use composition and forwarding instead of inheritance
	// especially an appropriate interface to implement a wrapper class exists.
	// Not only are wrapper classes more robust than subclasses they are also more powerful.
}