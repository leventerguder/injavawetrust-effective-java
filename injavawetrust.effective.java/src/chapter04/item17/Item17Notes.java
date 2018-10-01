package chapter04.item17;

public class Item17Notes {

	// #####
	// Minimize mutability

	// An immutable class is simply a class whose instances cannot be modified.
	// Java platform libraries contain many immutable classes , including String ,
	// the boxed primitive classes
	// and BigInteger , BigDecimal.

	// There are many good reasons for this ;
	// - Immutable classes are easier to design , implement, and use than mutable
	// classes.
	// - They are less prone to error and are more secure.

	// To make a class immutable follow these 5 rules.

	// 1 - Dont provide methods that modify the object's state. (knonw as mutators
	// (setters))
	// 2 - Ensure that the class cant be extended.
	// This prevents careless or malicious subclasses from comrpomising the
	// immutable behavior of the class by behaving as if the objcet's state has
	// changed.

	// 3 - Make all fields final
	// 4 - make all fields private
	// This prevents clients from obtaining access to mutable objects referred to by
	// fields and modifying these objects directly.

	// 5 - Ensure exclusive access to any mutable components.
	// if your class has any fields that refer to mutable objects, ensure that
	// clients of the class cannot obtain references to these objects.
	// Make defensive copies (Item50) in constructors , accessors , and readObject
	// methods (Item 88)

	// ### Immutable objects are simple. An immutable object can be in exactly one
	// state
	// , the state in which it was created

	// ### Immutable objects are inherently thread-safe ; they require no
	// synchronization.
	// They cannot be corrupted by multiple threads accessing them concurrently.
	// Since no thread can ever observer any effect of another thread on an
	// immutable object,
	// immutable can be shared freely.

	// You never have to make any copies at all because the copies would be forever
	// equivalent to the originals.
	// Therefore , you need not and should not provide a clone method or copy
	// constructor on immutable class.

	// Not only can you share immutable objects , but they can share their
	// internals.
	// For example , the BigInteger class uses a sing-magnitude representation
	// internally.
	// The sign is represented by an int , and the magnitude is represented by an
	// int array.
	// The negate method produces a new BigInteger of like magnitude and opposite
	// sign.
	// It does not need to copy the array even though it is mutable ;
	// the newly created BigInteger points to the same internal array as the
	// original.

	// Immutable objects make great building blocks for other objects , whether
	// mutable or immutable.

	// Immutable objects provide failure atomicity for free (item 76)
	// their state never changes , so there is no possibility of a temporary
	// inconsistency.

	// The major disadvantage of immutable classes is that they require a separate
	// object for each distinct value.

	// For example , suppose that you have a million-bit BigInteger and you want to
	// change its low-order bit
	// BigInteger moby =
	// moby = moby.flipBit(0);

	// flipBit method creates a new BigInteger instance , also a million bits long ,
	// that differs from the original in only one bit.
	// java.util.BitSet -> is mutable

	// BitSet moby = ...;
	// moby.flip(0);

	// Instead of making an immutable class final , you can make all of its
	// constructors private or package-private and add public static
	// factories in place of the public constructors(Item1)

	// This approach is often the best alternative. It is the most flexible because
	// it allows the use of multiple package-private implementation classes.

	// It was not widely understood that immutable classes had to be effectively
	// final
	// when BigInteger and BigDecimal were written , so all of their methods may be
	// overriden.

	// The list of rules for immutable classes at the beginning of this item says
	// that no methods may modify the object and that all its fields must be final.
	// in fact these rules are a bit stronger than necessary and can be relaxed to
	// improve performance.
	// in truth , no method may produce an externally visible change in the
	// objects's state.
	// However some immutable classes have one or more non final fields in which
	// they cache the results of expensive
	// computations the first time they are needed.
	// if the same value is requested again, the cached value is returned , saving
	// the cost of recalculation.

	// ####
	// Classes should be immutable unless there is a very good reason to make them
	// mutable.
	// Immutable classes provide many advantages , and their only disadvantage is
	// the potential for performance problems under certain circumtances.
	// You should always make small value objects , such as PhoneNumber and Complex
	//
	// There are several classes in the Java platform libraries, such as
	// java.util.Date and java.awt.Point
	// that should have been immutable but arent.

	// if a class cannot be made immutable , limit its mutabiliy as much as
	// possible.
	// Reducing the number of states in which an object can exist makes it easier to
	// reason about the object and reduces the likelihood of errors.

	// Therefore , make every field final unless there is a compelling reason to
	// make it nonfinal.

	// Constructors should create fully initialized objects with all of their
	// invariants established.
	//
	// Dont provide a public initialization method separate from the constructor or
	// static factory unless there is a compelling reason to do so.
	// Similary, dont provide a "reinitialize"method that enables an object to be
	// reused as if it had been constructed with a different initial state.
	//

	// your natural inclination shoulod be to declare every field private final
	// unless there is a good reason to do otherwise.

	// TODO
	// The CountDownLatch class exemplifies these principles. It is mutable but its
	// state space is kept intentionally small.
	// You create an instance , use it once , and its done. once the coutdown
	// latch's count has reached zero , you may not reuse it.
}
