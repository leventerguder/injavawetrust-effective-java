package chapter11.item78;

public class Item78Notes {

	// Chapter 11
	// THREADS allow multiple activities to proceed concurrently. Concurrent
	// programming is harder than single-threaded programming, because more things
	// can go wrong, and failures can be hard to reproduce. You can’t avoid
	// concurrency. It is inherent in the platform and a requirement if you are to
	// obtain good performance from multicore processors, which are now ubiquitous.
	// This chapter contains advice to help you write clear, correct, well
	// documented concurrent programs.

	// #####
	// Item 78: Synchronize access to shared mutable data

	// The synchronized keyword ensures that only a single thread can execute a
	// method or block at one time.

	// Without synchronization, one thread’s changes might not be visible to other
	// threads. Not only does synchronization prevent threads from observing an
	// object in an inconsistent state, but it ensures that each thread entering a
	// synchronized method or block sees the effects of all previous modifications
	// that were guarded by the same lock.

	// The language specification guarantees that reading or writing a variable is
	// atomic unless the variable is of type long or double [JLS, 17.4, 17.7]. In
	// other words, reading a variable other than a long or double is guaranteed to
	// return a value that was stored into that variable by some thread, even if
	// multiple threads modify the variable concurrently and without
	// synchronization.

	// You may hear it said that to improve performance, you should dispense with
	// synchronization when reading or writing atomic data. This advice is
	// dangerously wrong. While the language specification guarantees that a thread
	// will not see an arbitrary value when reading a field, it does not guarantee
	// that a value written by one thread will be visible to another.

	// Synchronization is required for reliable communication between threads as
	// well as for mutual exclusion.
	// This is due to a part of the language specification known as the memory
	// model, which specifies when and how changes made by one thread become visible
	// to others [JLS, 17.4; Goetz06, 16].

	// The consequences of failing to synchronize access to shared mutable data can
	// be dire even if the data is atomically readable and writable. Consider the
	// task of stopping one thread from another

	// The libraries provide the Thread.stop method, but this method was deprecated
	// long ago because it is inherently unsafe—its use can result in data
	// corruption. Do not use Thread.stop.

	// It is not sufficient to synchronize only the write method!
	// Synchronization is not guaranteed to work unless both read and write
	// operations are synchronized.

	// The actions of the synchronized methods in StopThread would be
	// atomic even without synchronization. In other words, the synchronization on
	// these methods is used solely for its communication effects, not for mutual
	// exclusion.

	// the volatile modifier performs no mutual exclusion, it guarantees that any
	// thread that reads the field will see the most recently written value:

	// The best way to avoid the problems discussed in this item is not to share
	// mutable data. Either share immutable data (Item 17) or don’t share at all. In
	// other words, confine mutable data to a single thread.

	// It is acceptable for one thread to modify a data object for a while and then
	// to share it with other threads, synchronizing only the act of sharing the
	// object reference. Other threads can then read the object without further
	// synchronization, so long as it isn’t modified again. Such objects are said to
	// be effectively immutable [Goetz06, 3.5.4].

	// Transferring such an object reference from one thread to others is called
	// safe publication [Goetz06, 3.5.3]

	// There are many ways to safely publish an object reference: you can store it
	// in a static field as part of class initialization; you can store it in a
	// volatile field, a final field, or a field that is accessed with normal
	// locking; or you can put it into a concurrent collection (Item 81).

	// In summary, when multiple threads share mutable data, each thread that reads
	// or writes the data must perform synchronization. In the absence of
	// synchronization, there is no guarantee that one thread’s changes will be
	// visible to another thread. The penalties for failing to synchronize shared
	// mutable data are liveness and safety failures. These failures are among the
	// most difficult to debug. They can be intermittent and timing-dependent, and
	// program behavior can vary radically from one VM to another. If you need only
	// inter-thread communication, and not mutual exclusion, the volatile modifier
	// is an acceptable form of synchronization, but it can be tricky to use
	// correctly.
}
