package chapter11.item83;

public class Item83Notes {

	// ####
	// Item 83: Use lazy initialization judiciously
	// Lazy initialization is the act of delaying the initialization of a field
	// until its value is needed.

	// If the value is never needed, the field is never initialized. This technique
	// is applicable to both static and instance fields.

	// While lazy initialization is primarily an optimization, it can also be used
	// to break harmful circularities in class and instance initialization [Bloch05,
	// Puzzle 51].

	// As is the case for most optimizations, the best advice for lazy
	// initialization is "don’t do it unless you need to" (Item 67).

	// Lazy initialization is a double-edged sword.

	// It decreases the cost of initializing a class or creating an instance, at the
	// expense of increasing the cost of accessing the lazily initialized field.

	// In the presence of multiple threads, lazy initialization is tricky. If two or
	// more threads share a lazily initialized field, it is critical that some form
	// of synchronization be employed, or severe bugs can result (Item 78).

	// Under most circumstances, normal initialization is preferable to lazy
	// initialization. Here is a typical declaration for a normally initialized
	// instance field. Note the use of the final modifier (Item 17):

	// If you need to use lazy initialization for performance on a static field, use
	// the lazy initialization holder class idiom.

	// If you need to use lazy initialization for performance on an instance field,
	// use the double-check idiom. This idiom avoids the cost of locking when
	// accessing the field after initialization (Item 79). The idea behind the idiom
	// is to check the value of the field twice (hence the name double-check): once
	// without locking and then, if the field appears to be uninitialized, a second
	// time with locking. Only if the second check indicates that the field is
	// uninitialized does the call initialize the field. Because there is no locking
	// once the field is initialized, it is critical that the field be declared
	// volatile (Item 78)

	// In summary, you should initialize most fields normally, not lazily. If you
	// must initialize a field lazily in order to achieve your performance goals or
	// to break a harmful initialization circularity, then use the appropriate lazy
	// initialization technique. For instance fields, it is the double-check idiom;
	// for static fields, the lazy initialization holder class idiom. For instance
	// fields that can tolerate repeated initialization, you may also consider the
	// single-check idiom.

}
