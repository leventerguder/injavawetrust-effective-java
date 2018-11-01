package chapter11.item82;

public class Item82Notes {

	// #####
	// Item 82: Document thread safety

	// How a class behaves when its methods are used concurrently is an important
	// part of its contract with its clients. If you fail to document this aspect of
	// a class’s behavior, its users will be forced to make assumptions

	// The presence of the synchronized modifier in a method declaration is an
	// implementation detail, not a part of its API. It does not reliably indicate
	// that a method is thread-safe.

	// To enable safe concurrent use, a class must clearly document what level of
	// thread safety it supports.

	// ## Immutable : Instances of this class appear constant. No external
	// synchronization is necessary. Examples include String, Long, and BigInteger
	// (Item 17).

	// ## Unconditionally thread-safe : Instances of this class are mutable, but the
	// class has sufficient internal synchronization that its instances can be used
	// concurrently without the need for any external synchronization. Examples
	// include AtomicLong and ConcurrentHashMap.

	// ## Conditionally thread-safe : Like unconditionally thread-safe, except that
	// some
	// methods require external synchronization for safe concurrent use. Examples
	// include the collections returned by the Collections.synchronized wrappers,
	// whose iterators require external synchronization.

	// ## Not thread-safe : Instances of this class are mutable. To use them
	// concurrently, clients must surround each method invocation (or invocation
	// sequence) with external synchronization of the clients’ choosing. Examples
	// include the general-purpose collection implementations, such as ArrayList and
	// HashMap.

	// ## Thread-hostile : This class is unsafe for concurrent use even if every
	// method invocation is surrounded by external synchronization. Thread hostility
	// usually results from modifying static data without synchronization. No one
	// writes a thread-hostile class on purpose; such classes typically result from
	// the failure to consider concurrency. When a class or method is found to be
	// thread-hostile, it is typically fixed or deprecated.

	// Documenting a conditionally thread-safe class requires care. You must
	// indicate which invocation sequences require external synchronization, and
	// which lock (or in rare cases, locks) must be acquired to execute these
	// sequences.
}
