package chapter04.item15;

public class Item15Notes {

	// ####
	// Chapter 4 . Classes and Interfaces
	// Classes and interfaces lie at the hearth of the Java programming language.
	// They are its basic units of abstraction

	// #####
	// Minimize the accessibility of classes and members
	// The single most important factor that distinguishes a well-designed component
	// from a poorly designed one is the degree
	// to which the component hides its internal data and other implementation
	// details from other components.

	// A well designed component hides all its implementation details cleanly
	// separating its API from its implementation
	// This concept , known as information hidinf or encapsulation , is a
	// fundamental tenet of software design.

	// Information hiding increases software reuse because components that arent
	// tightly coupled often prove useful in other contexts besides
	// the ones for which they were developed.

	// Information hiding decrease the risk in building large systems because
	// individual components may prove successful even if the system does not.

	// Java has many facilities to aid in information hiding. The access control
	// mechanism specifies the accessibility of classes , interfaces , and members

	// The rule of thumb is simple : make each class or member as inaccessible as
	// possible.
	// In other words use the lowest possible access level consistent with the
	// proper functioning of the software that you are writing.

	// For top-level (non-nested) classes and interfaces , there are only two
	// possible access levels : package-private and public.

	// if a top-level class or interface can be made package private , it should be.
	// By making it package-private , you make it part of the implementation rather
	// than the exported API
	// and you can modify it, replace it , or eliminate it in a subsequent release
	// without fear of harming existing clients.
	// if you make it public you are obligated to support it forever to maintain
	// compatibility.

	// if a package-private top level-class or interfaces is used by only one class
	// consider making the top-level class a private static nested class of the sole
	// class that uses it (Item 24) .This reduces its accessibility.

	// It is far more important to reduce accessibility of a gratuitously public
	// class than of a package-private top level class
	//

	// After carefully designing your class's public API , your reflex should be to
	// make all other members private.

	// Only if another class in the same package really needs to access a member
	// should you remove the private modifier,
	// making the member package-private.

	// Both private and package-private members are part of a class's implementation
	// and do not normally impact its exported API

	// For members of public classes a huge increase in accessibility occurs when
	// the access level goes from package-private to protected.

	// A protected member is part of the class's exported API and must be supported
	// forever.
	// Also , a protected member of an exported class represent a public commitment
	// to an implementation detail (Item 19)

	// if a method overrides a superclass method , it cannot have a more restrictive
	// access level in the subclass than in the superclass.
	// This is necessary to ensure that an instance of the subclass is usable
	// anywhere
	// that an instance of the superclass is usable (the Liskov substitution
	// principle)

	// ####
	// Instance fields of public classes should rarely be public (Item 16)
	// if an instance field is nonfinal or is a reference to a mutable object , then
	// by making it public
	// you give up the ability to limit the values that can be stored in the field.
	// ####
	// classes with public mutable fields are not generally thread-safe.

	// The same advice applies to static fields , with one exception.
	// You can expose constant via public static final fields , assuming the
	// constants form an integral part of the abstraction provided by the class

	// it is critical that these fields containe either primitive values or
	// references to immutable objects(item 17)

	// Note that a nonzero-length array is always mutable , so it is wrong for a
	// class to have a public static final array field , or an accessor that returns
	// such a field.

	// if a class has such a field or accessor , clients will be able to modify the
	// contents of the array.

	// Potential security hole !
	// public static final Thing[] VALUES = { .... };

	// There are two ways to fix the problem.
	// You can make the public array private and add a public immutable list.

	// private static final Things[] PRIVATE_VALUES = { .... };
	// public static final List<Thing> VALUES =
	// Collections.ummodifiableList(Arrays.asList(PRIVATE_VALUES);

	// Alternatively , you can make the array private and add a public method that
	// returns a copy of a private array
	// private static final Thing[] PRIVATE_VALUES = {...} ;
	// public static final Thing[] values() { return PRIVATE_VALUES.clone()};

	// To choose between these alternatives , think about what the client is likely
	// to do with the result.
	// which return type will be more convenient ?

	// As of Java 9 , there are two additional , implicit access levels introduced
	// as part of the module system.
	// A module is a grouping of packages , like a package is a grouping of classes.

	// A module may explicitly export some of its packages via export declarations
	// in its module declaration (which is by convention contained in a source file
	// named module-info.java)

	// Using the module system allows you to share classes among packages within a
	// module without making them visible to the entire world.

	// Unlike the four main access levels , the two module-based levels are largely
	// advisory.
	// TODO module-info.java

	// To summarize , you should reduce accessibility of program elements as much as
	// possible (within reason)
	// After carefully designing a minimal public API , you should prevent any stray
	// classes , interfaces , or members from
	// becoming part of teh API.
	// With the exception of public static final fields which serve as constants ,
	// public classes should have no public fields.
	// Ensure that objects referenced by public static final fields are immutable.

	// In summary , public classes shoud never expose mutable fields.
	// It is less harmful , though still questionable , for public classes to expose
	// immutable fields.
	// It is , however , sometimes desirable for package-private or private nested
	// classes to expose fields , whether mutable or immutable.

}
