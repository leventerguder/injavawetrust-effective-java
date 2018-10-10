package chapter06.item34;

public class Item34Notes {

	// JAVA supports two special-purpose families of reference types: a kind of
	// class called an enum type, and a kind of interface called an annotation type.
	// This chapter discusses best practices for using these type families.

	// Item 34: Use enums instead of int constants

	// An enumerated type is a type whose legal values consist of a fixed set of
	// constants, such as the seasons of the year, the planets in the solar system,
	// or the suits in a deck of playing cards.

	// There is no easy way to translate int enum constants into printable strings.

	// You may encounter a variant of this pattern in which String constants are
	// used in place of int constants. This variant, known as the String enum
	// pattern, is even less desirable.

	// If such a hard-coded string constant contains a typographical error, it will
	// escape detection at compile time and result in bugs at runtime.

	// Also, it might lead to performance problems, because it relies on string
	// comparisons.

	// Luckily, Java provides an alternative that avoids all the shortcomings of the
	// int and string enum patterns and provides many added benefits. It is the enum
	// type [JLS, 8.9].

	// Java’s enum types are full-fledged classes, far more powerful than their
	// counterparts in these other languages, where enums are essentially int
	// values.

	// The basic idea behind Java’s enum types is simple: they are classes that
	// export one instance for each enumeration constant via a public static final
	// field. Enum types are effectively final, by virtue of having no accessible
	// constructors. Because clients can neither create instances of an enum type
	// nor extend it, there can be no instances but the declared enum constants. In
	// other words, enum types are instance-controlled (page 6). They are a
	// generalization of singletons (Item 3), which are essentially single-element
	// enums.

	// Enums provide compile-time type safety. If you declare a parameter to be of
	// type Apple, you are guaranteed that any non-null object reference passed to
	// the parameter is one of the three valid Apple values. Attempts to pass values
	// of the wrong type will result in compile-time errors, as will attempts to
	// assign an expression of one enum type to a variable of another, or to use the
	// == operator to compare values of different enum types.

	// To associate data with enum constants, declare instance fields and write a
	// constructor that takes the data and stores it in the fields.

	// Enums are by their nature immutable, so all fields should be final (Item 17).
	// Fields can be public, but it is better to make them private and provide
	// public accessors (Item 16).

	// all enums, has a static values method that returns an array of its values in
	// the order they were declared

	// If an enum is generally useful, it should be a top-level class; if its use is
	// tied to a specific top-level class, it should be a member class of that
	// top-level class (Item 24).

	// Enum types have an automatically generated valueOf(String) method that
	// translates a constant’s name into the constant itself.
	// If you override the toString method in an enum type, consider writing a
	// fromString method to translate the custom string representation back to the
	// corresponding enum.
	//

	// Enum constructors aren’t permitted to access the enum’s static fields, with
	// the exception of constant variables
	// This restriction is necessary because static fields have not yet been
	// initialized when enum constructors run.

	// If switch statements on enums are not a good choice for implementing
	// constant-specific behavior on enums, what are they good for? Switches on
	// enums are good for augmenting enum types with constant-specific behavior.

	// when should you use enums? Use enums any time you need a set of constants
	// whose members are known at compile time.

	// It is not necessary that the set of constants in an enum type stay fixed for
	// all time.

	// In summary, the advantages of enum types over int constants are compelling.
	// Enums are more readable, safer, and more powerful. Many enums require no
	// explicit constructors or members, but others benefit from associating data
	// with each constant and providing methods whose behavior is affected by this
	// data. Fewer enums benefit from associating multiple behaviors with a single
	// method. In this relatively rare case, prefer constant- specific methods to
	// enums that switch on their own values. Consider the strategy enum pattern if
	// some, but not all, enum constants share common behaviors.
}
