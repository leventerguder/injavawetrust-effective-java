package chapter04.item23;

public class Item23Notes {

	// ####
	// Item 23 : Prefer class hierarchies to tagged classes
	//

	// Occasionally you may run across a class whose instances come in two or more
	// flavors and contain a tag field indicating the flavor of the instance
	//
	//
	// Tagged classes have numerous shortcomings. They are cluttered with
	// boilerplate , including enum declrations , tag fields , and switch
	// statements.
	//
	// Readability is further harmed because multiple implementations are jumbled
	// togerher in a single class.
	// Memory footprint is increased because instances are burdened with irrelavvant
	// fields belongn to other flavors.

	// Fields cant be made final unless constructors initialize irrelavant fields ,
	// resulting in more boilerplate.
	// Constructor must set the tag fields and initialize the right data fields with
	// no help from the compiler.
	//
	// In short, tagged classes are verbose , error-prone , and inefficient.

	// Luckily , object oriented languages such Java offer a far better alternative
	// for defining a single data type capable of representing objects of multiple
	// flavors : subtyping

	// A tagged class is just a pallid imitation of a class hierarchy.

	// To transform a tagged class into a class hierarchy, first define an abstract
	// class containing an abstract method for each method in the tagged class whose
	// behavior depends on the tag value. In the Figure class, there is only one
	// such method, which is area. This abstract class is the root of the class
	// hierarchy. If there are any methods whose behavior does not depend on the
	// value of the tag, put them in this class. Similarly, if there are any data
	// fields used by all the flavors, put them in this class. There are no such
	// flavor- independent methods or fields in the Figure class.
	//
	// Next, define a concrete subclass of the root class for each flavor of the
	// original tagged class.

	// class hierarchy corrects every shortcoming of tagged classes noted
	// previously.
	// The code is simple and clear, containing none of the boilerplate found in the
	// original.

	// All fields are final.
	// The compiler ensures that each class’s constructor initializes its data
	// fields and that each class has an implementation for every abstract method
	// declared in the root class. This eliminates the possibility of a runtime
	// failure due to a missing switch case.

	// In summary, tagged classes are seldom appropriate. If you’re tempted to write
	// a class with an explicit tag field, think about whether the tag could be
	// eliminated and the class replaced by a hierarchy. When you encounter an
	// existing class with a tag field, consider refactoring it into a hierarchy.
}