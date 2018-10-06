package chapter04.item24;

public class Item24Notes {

	// #####
	// Item24 : Favor static member classes over nonstatic
	//
	// A nested class is a class defined within another class. A nested class should
	// exist only to serve its enclosing class.
	// If a nested class would be useful in some other context, then it should be a
	// top-level class.

	// There are four kinds of nested classes:
	// - static member classes,
	// - nonstatic member classes
	// - anonymous classes
	// - local classes.

	// A static member class is the simplest kind of nested class. It is best
	// thought
	// A static member class is a static member of its enclosing class and obeys the
	// same accessibility rules as other static members. If it is declared private,
	// it is accessible only within the enclosing class, and so forth.

	// One common use of a static member class is as a public helper class, useful
	// only in conjunction with its outer class.

	// Syntactically, the only difference between static and nonstatic member
	// classes is that static member classes have the modifier static in their
	// declarations.

	// One common use of a nonstatic member class is to define an Adapter
	// [Gamma95] that allows an instance of the outer class to be viewed as an
	// instance of some unrelated class

	// For example, implementations of the Map interface typically use nonstatic
	// member classes to implement their collection views, which are returned by
	// Map’s keySet, entrySet, and values methods.

	// if you declare a member class that does not require access to an enclosing
	// instance, always put the static modifier in its declaration,making it a
	// static rather than a nonstatic member class.

	// If you omit this modifier, each instance will have a hidden extraneous
	// reference to its enclosing instance.
	// As previously mentioned, storing this reference takes time and space. More
	// seriously, it can result in the enclosing instance being retained when it
	// would otherwise be eligible for garbage collection (Item 7).
	// The resulting memory leak can be catastrophic. It is often difficult to
	// detect because the reference is invisible.

	// A common use of private static member classes is to represent components of
	// the object represented by their enclosing class. For example, consider a Map
	// instance, which associates keys with values. Many Map implementations have an
	// internal Entry object for each key-value pair in the map. While each entry is
	// associated with a map, the methods on an entry (getKey, getValue, and
	// setValue) do not need access to the map. Therefore, it would be wasteful to
	// use a nonstatic member class to represent entries: a private static member
	// class is best. I
	// If you accidentally omit the static modifier in the entry declaration, the
	// map will still work, but each entry will contain a superfluous reference to
	// the map, which wastes space and time.

	// There are many limitations on the applicability of anonymous classes. You
	// can’t instantiate them except at the point they’re declared. You can’t
	// perform instanceof tests or do anything else that requires you to name the
	// class.

	// You can’t declare an anonymous class to implement multiple interfaces or to
	// extend a class and implement an interface at the same time.

	// Before lambdas were added to Java (Chapter 6), anonymous classes were the
	// preferred means of creating small function objects and process objects on the
	// fly, but lambdas are now preferred (Item 42).

	// Local classes are the least frequently used of the four kinds of nested
	// classes. A local class can be declared practically anywhere a local variable
	// can be declared and obeys the same scoping rules. Local classes have
	// attributes in common with each of the other kinds of nested classes. Like
	// member classes, they have names and can be used repeatedly. Like anonymous
	// classes, they have enclosing instances only if they are defined in a
	// nonstatic context, and they cannot contain static members. And like anonymous
	// classes, they should be kept short so as not to harm readability.

	// To recap, there are four different kinds of nested classes, and each has its
	// place. If a nested class needs to be visible outside of a single method or is
	// too long to fit comfortably inside a method, use a member class. If each
	// instance of a member class needs a reference to its enclosing instance, make
	// it nonstatic; otherwise, make it static. Assuming the class belongs inside a
	// method, if you need to create instances from only one location and there is a
	// preexisting type that characterizes the class, make it an anonymous class;
	// otherwise, make it a local class.

}
