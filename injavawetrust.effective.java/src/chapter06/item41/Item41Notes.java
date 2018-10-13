package chapter06.item41;

public class Item41Notes {

	// #####
	// Item 41 : Use marker interfaces to define types

	// A marker interface is an interface that contains no method declarations but
	// merely designates (or “marks”) a class that implements the interface as
	// having some property. For example, consider the Serializable interface
	// (Chapter 12). By implementing this interface, a class indicates that its

	// First and foremost, marker interfaces
	// define a type that is implemented by instances of the marked class;
	// marker annotations do not.

	// The existence of a marker interface type allows
	// you to catch errors at compile time that you couldn’t catch until runtime if
	// you used a marker annotation.

	// Another advantage of marker interfaces over marker annotations is
	// that they can be targeted more precisely.

	// If an annotation type is declared
	// with target ElementType.TYPE, it can be applied to any class or interface.

	// If you define it as a marker interface, you can have it
	// extend the sole interface to which it is applicable, guaranteeing that all
	// marked types are also subtypes of the sole interface to which it is
	// applicable.

	// The chief advantage of marker annotations over marker interfaces is
	// that they are part of the larger annotation facility.
	// Therefore, marker annotations allow for consistency in annotation-based
	// frameworks.

	// Clearly you must use an annotation if the marker applies to
	// any program element other than a class or interface, because only classes and
	// interfaces can be made to implement or extend an interface.

	// If the marker applies only to classes and interfaces, ask yourself the
	// question “Might I want to write one or more methods that accept only objects
	// that have this marking?” If so, you should use a marker interface in
	// preference to an annotation.

	// In summary, marker interfaces and marker annotations both have their
	// uses. If you want to define a type that does not have any new methods
	// associated with it, a marker interface is the way to go.

	// If you want to mark program elements other than classes and interfaces or to
	// fit the marker into a framework that already makes heavy use of annotation
	// types, then a marker annotation is the correct choice

	// If you find yourself writing a marker
	// annotation type whose target is ElementType.TYPE, take the time to
	// figure out whether it really should be an annotation type or whether a
	// marker interface would be more appropriate.

	// In a sense, this item is the inverse of Item 22, which says, “If you don’t
	// want to define a type, don’t use an interface.” To a first approximation,
	// this item says, “If you do want to define a type, do use an interface.”
}
