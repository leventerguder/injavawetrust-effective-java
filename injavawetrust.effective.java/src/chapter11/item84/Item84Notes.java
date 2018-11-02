package chapter11.item84;

public class Item84Notes {

	// #####
	// Item 84: Don’t depend on the thread scheduler

	// Any program that relies on the thread scheduler for correctness or
	// performance is likely to be nonportable.

	// The best way to write a robust, responsive, portable program is to ensure
	// that the average number of runnable threads is not significantly greater than
	// the number of processors.

	// Threads should not run if they aren’t doing useful work. In terms of the
	// Executor Framework (Item 80), this means sizing thread pools appropriately
	// [Goetz06, 8.2] and keeping tasks short, but not too short, or dispatching
	// overhead will harm performance.

	// Threads should not busy-wait, repeatedly checking a shared object waiting for
	// its state to change.

	// A related technique, to which similar caveats apply, is adjusting thread
	// priorities. Thread priorities are among the least portable features of Java.

	// It is unreasonable to attempt to solve a serious liveness problem by
	// adjusting thread priorities.

	// In summary, do not depend on the thread scheduler for the correctness of your
	// program. The resulting program will be neither robust nor portable. As a
	// corollary, do not rely on Thread.yield or thread priorities. These facilities
	// are merely hints to the scheduler. Thread priorities may be used sparingly to
	// improve the quality of service of an already working program, but they should
	// never be used to “fix” a program that barely works.
}
