package chapter05.item31;

public class Item31Notes {

	// #####
	// Item 31: Use bounded wildcards to increase API flexibility

	// As noted in Item 28, parameterized types are invariant. In other words, for
	// any two distinct types Type1 and Type2, List<Type1> is neither a subtype nor
	// a supertype of List<Type2>.

	// Sometimes you need more flexibility than invariant typing can provide.

	// The language provides a special kind of parameterized type call a bounded
	// wildcard type.

	// For maximum flexibility , use wildcard types on input parameters that
	// reprsent producers or consumers.

	// If an input parameter is both a producer and a consumer, then wildcard types
	// will do you no good: you need an exact type match, which is what you get
	// without any wildcards.

	// PECS stands for producer-extends, consumer-super.

	// In other words, if a parameterized type represents a T producer, use <?
	// extends T>; if it represents a T consumer, use <? super T>

	// The PECS mnemonic captures the fundamental principle that guides the use of
	// wild-card types. Naftalin and Wadler call it the Get and Put Principle

	// Do not use bounded wildcard types as return types.
	// If the user of a class has to think about wildcard types, there is probably
	// something wrong with its API.

	// Comparables are always consumers, so you should generally use Comparable<?
	// super T> in preference to Comparable<T>.

	// The same is true of comparators; therefore, you should generally use
	// Comparator<? super T> in preference to Comparator<T>.

	// There is a duality between type parameters and wildcards, and many methods
	// can be declared using one or the other.

	// As a rule, if a type parameter appears only once in a method declaration,
	// replace it with a wildcard.
	// If it’s an unbounded type parameter, replace it with an unbounded wildcard;
	// if it’s a bounded type parameter, replace it with a bounded wildcard.

	// In summary, using wildcard types in your APIs, while tricky, makes the APIs
	// far more flexible. If you write a library that will be widely used, the
	// proper use of wildcard types should be considered mandatory. Remember the
	// basic rule: producer-extends, consumer-super (PECS). Also remember that all
	// comparables and comparators are consumers.
}
