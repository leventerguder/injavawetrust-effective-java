package chapter05.item33;

public class Item33Notes {

	// ##### Item 33: Consider typesafe heterogeneous containers
	// Common uses of generics include collections, such as Set<E> and Map<K,V>, and
	// single-element containers, such as ThreadLocal<T> and AtomicReference<T>. In
	// all of these uses, it is the container that is parameterized. This limits you
	// to a fixed number of type parameters per container.

	// Sometimes, however, you need more flexibility
	// The idea is to parameterize the key instead of the container. Then present
	// the parameterized key to the container to insert or retrieve a value. The
	// generic type system is used to guarantee that the type of the value agrees
	// with its key.

	// When a class literal is passed among methods to communicate both compile-time
	// and runtime type information, it is called a type token [Bracha] TODO

	// There are two limitations to the Favorites class that are worth noting.
	// First, a malicious client could easily corrupt the type safety of a Favorites
	// instance, by using a Class object in its raw form.

	// In summary, the normal use of generics, exemplified by the collections
	// APIs, restricts you to a fixed number of type parameters per container. You
	// can get around this restriction by placing the type parameter on the key
	// rather than the container. You can use Class objects as keys for such
	// typesafe heterogeneous containers. A Class object used in this fashion is
	// called a type token. You can also use a custom key type. For example, you
	// could have a DatabaseRow type representing a database row (the container),
	// and a generic type Column<T> as its key.
}
