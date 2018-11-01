package chapter11.item81;

public class Item81Notes {

	// Item 81: Prefer concurrency utilities to wait and notify
	// Since Java 5, the platform has provided higher-level concurrency utilities
	// that do the sorts of things you formerly had to hand-code atop wait and
	// notify.

	// Given the difficulty of using wait and notify correctly, you should use the
	// higher-level concurrency utilities instead

	// The concurrent collections are high-performance concurrent implementations of
	// standard collection interfaces such as List, Queue, and Map

	// To provide high concurrency, these implementations manage their own
	// synchronization internally (Item 79). Therefore, it is impossible to exclude
	// concurrent activity from a concurrent collection; locking it will only slow
	// the program.

	// For interval timing, always use System.nanoTime rather than
	// System.currentTimeMillis.

	// While you should always use the concurrency utilities in preference to wait
	// and notify, you might have to maintain legacy code that uses wait and notify.
	// The wait method is used to make a thread wait for some condition. It must be
	// invoked inside a synchronized region that locks the object on which it is
	// invoked.

	// The standard idiom for using the wait method
	//	  synchronized (obj) {
	//	      while (<condition does not hold>)
	//	      obj.wait(); // (Releases lock, and reacquires on wakeup)
	//	      ... // Perform action appropriate to condition
	//	  }

	// Always use the wait loop idiom to invoke the wait method; never invoke it
	// outside of a loop.

	// In summary, using wait and notify directly is like programming in
	// “concurrency assembly language,” as compared to the higher-level language
	// provided by java.util.concurrent. There is seldom, if ever, a reason to use
	// wait and notify in new code. If you maintain code that uses wait and notify,
	// make sure that it always invokes wait from within a while loop using the
	// standard idiom. The notifyAll method should generally be used in preference
	// to notify. If notify is used, great care must be taken to ensure liveness.

}
