package chapter11.item79;

public class Item79Notes {

	// #####
	// Item 79: Avoid excessive synchronization

	// Item 78 warns of the dangers of insufficient synchronization. This item
	// concerns the opposite problem. Depending on the situation, excessive
	// synchronization can cause reduced performance, deadlock, or even
	// nondeterministic behavior.

	// To avoid liveness and safety failures, never cede control to the client
	// within a synchronized method or block.

	// In other words, inside a synchronized region, do not invoke a method that is
	// designed to be overridden, or one provided by a client in the form of a
	// function object (Item 24).
	// From the perspective of the class with the synchronized region, such methods
	// are alien. The class has no knowledge of what the method does and has no
	// control over it. Depending on what an alien method does, calling it from a
	// synchronized region can cause exceptions, deadlocks, or data corruption.

	// An alien method invoked outside of a synchronized region is known as an open
	// call [Goetz06, 10.1.4]. Besides preventing failures, open calls can greatly
	// increase concurrency. An alien method might run for an arbitrarily long
	// period. If the alien method were invoked from a synchronized region, other
	// threads would be denied access to the protected resource unnecessarily.

	// As a rule, you should do as little work as possible inside synchronized
	// regions. Obtain the lock, examine the shared data, transform it as necessary,
	// and drop the lock. If you must perform some time-consuming activity, find a
	// way to move it out of the synchronized region without violating the
	// guidelines in Item 78.

	// While the cost of synchronization has plummeted since the
	// early days of Java, it is more important than ever not to oversynchronize

	// In a multicore world, the real cost of excessive synchronization is not the
	// CPU time spent getting locks; it is contention: the lost opportunities for
	// parallelism and the delays imposed by the need to ensure that every core has
	// a consistent view of memory. Another hidden cost of over synchronization is
	// that it can limit the VM’s ability to optimize code execution.

	// If you are writing a mutable class, you have two options: you can omit all
	// synchronization and allow the client to synchronize externally if concurrent
	// use is desired, or you can synchronize internally, making the class
	// thread-safe (Item 82).

	// If a method modifies a static field and there is any possibility that the
	// method will be called from multiple threads, you must synchronize access to
	// the field internally (unless the class can tolerate nondeterministic
	// behavior)

	// In summary, to avoid deadlock and data corruption, never call an alien method
	// from within a synchronized region. More generally, keep the amount of work
	// that you do from within synchronized regions to a minimum.

	// In the multicore era, it is more important than ever not to oversynchronize.
	// Synchronize your class internally only if there is a good reason to do so,
	// and document your decision clearly (Item 82).
}
