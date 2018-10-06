package chapter05.item26;

public class Item26Notes {

	// A class or interface declaration has one or more type parameters is a generic
	// class or interface.
	// For example , the List interface has a single type parameter , E ,
	// representing its element type.

	// Generic classes and interfaces are collectively known as generic types.
	// Each generic type defines a set of parameterized types , which consist of the
	// class or interface name followed by an angle-bracketed list of actual type
	// parameters corresponding to the generic type's formal type parameters.

	// Each generic type defines a raw type , which is the name of the generic type
	// used without any accompanying type parameters.

	// Raw types behave as if all of the generic type information were erased from
	// the type declaration.
	// They exist primarily for compatibility with pre-generics code

	// Raw collection type - dont do this
	// private final Collection stamps = ....;

	// Discover errors as soon as possible after they are made , ideally at compile
	// time!
	// In this case , you dont discover the error until runtime.

	// Parameterized collection type - typesafe
	// private final Collection<Stamp> stamps

	// The compiler knows that stamps should contain only Stamp instances and
	// guarantees it to be true , assuming your entire codebase compiles without
	// emitting (or suppressing) any warnings.

	// It is legal to use raw types (generic types without their type parameters)
	// but you should never do it.
	// if you use raw types , you lose all the safety and expressiveness benefits of
	// generics.

	// you lose type safety if you use a raw type such as List , but not if you use
	// a parameterized type such as List<Object>

	// There are a few minor exceptions to the rule that you should not use raw
	// types
	// You must use raw types in class literals.
	// The specification does not permit the use of parameterized types (though it
	// does permit array types and primitive types)

	// In other words , List.class , String[].class and , int.class are all legal ,
	// but List<String>.class and List<?>.class are not

	// A second exception to the rule concerns the instanceof operator.
	// Because generic type information is erased at runtime, it is illegal to use
	// the instanceof operator on parameterized types other than unbounded wildcard
	// types

	// The use of unbounded wildcard types in place of raw types does not affect the
	// behavior of the instanceof operator in any way.
	// in this case, the angle brackets and question marks are just noise.

	// This is the preferred way to use the instanceof operator with generictypes

	// Legitimate use of rwa type - instance of operator
	// if(o instanceof Set){
	// Set<?> s = (Set<?>)o;
	// }

	// Once you have determined that o is a Set , you must cast it to the wildcard
	// type Set<?> not the raw type Set.
	// This is a checked cast , so it will not cause a compiler warning.

	// In summary, using raw types can lead to exceptions at runtime , so dont use
	// them.
	// They are provided only for compatibility and interoperability with legacy
	// code that predates the introduction of generics.

	// Set<Object> is a parameterized type representing a set that can contain objects of any type
	// Set<?> is a wildcard type representing a set that can contain only objects of some unknown type
	// Set is a raw type , which opts out of the generic type system
	
	// Parameterized type -> List<String>
	// Actial type parameter -> String
	// Generic Type -> List<E>
	// Formal type parameter -> E
	// Unbounded wilcard type -> List<?>
	// Raw type -> List
	// Bounded type parameter -> <E extends Number>
	// Recursive type bound <T extends Comparable<T>>
	// Bounded wildcard type -> List<? extends Number>
	// Generic method -> static <E> List<E> asList(E[] a)
	// Type token -> String.class

}
