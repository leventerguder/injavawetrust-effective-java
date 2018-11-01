package chapter11.item80;

public class Item80Notes {

	// #####
	// Item 80: Prefer executors, tasks, and streams to threads
	// java.util.concurrent had been added to Java. This package contains an
	// Executor Framework, which is a flexible interface-based task execution
	// facility.

	//
	// You can do many more things with an executor service. For example, you can
	// wait for a particular task to complete (with the get method, as shown in Item
	// 79), you can wait for any or all of a collection of tasks to
	// complete (using the invokeAny or invokeAll methods), you can wait for the
	// executor service to terminate (using the awaitTermination method), you can
	// retrieve the results of tasks one by one as they complete (using an
	// ExecutorCompletionService), you can schedule tasks to run at a particular
	// time or to run periodically (using a ScheduledThreadPoolExecutor), and so on.

	// Choosing the executor service for a particular application can be tricky. For
	// a small program, or a lightly loaded server, Executors.newCachedThreadPool is
	// generally a good choice because it demands no configuration and generally
	// “does the right thing.” But a cached thread pool is not a good choice for a
	// heavily loaded production server!

	// in a heavily loaded production server, you are much better off using
	// Executors.newFixedThreadPool, which gives you a pool with a fixed number of
	// threads, or using the ThreadPoolExecutor class directly, for maximum control.

	// When you work directly with threads, a Thread serves as both a unit of work
	// and the mechanism for executing it. In the executor framework, the unit of
	// work and the execution mechanism are separate. The key abstraction is the
	// unit of work, which is the task. There are two kinds of tasks: Runnable and
	// its close cousin, Callable (which is like Runnable, except that it returns a
	// value and can throw arbitrary exceptions)

	// In Java 7, the Executor Framework was extended to support fork-join tasks,
	// which are run by a special kind of executor service known as a fork-join
	// pool. A fork-join task, represented by a ForkJoinTask instance, may be split
	// up into smaller subtasks, and the threads comprising a ForkJoinPool not only
	// process these tasks but “steal” tasks from one another to ensure that all
	// threads remain busy, resulting in higher CPU utilization, higher throughput,
	// and lower latency.

	// Parallel streams (Item 48) are written atop fork join pools and allow you to
	// take advantage of their performance benefits with little effort, assuming
	// they are appropriate for the task at hand.

	// use ConcurrentHashMap in preference to Collections.synchronizedMap. Simply
	// replacing synchronized maps with concurrent maps can dramatically increase
	// the performance of concurrent applications.

	// Synchronizers are objects that enable threads to wait for one another,
	// allowing them to coordinate their activities. The most commonly used
	// synchronizers are CountDownLatch and Semaphore. Less commonly used are
	// CyclicBarrier and Exchanger. The most powerful synchronizer is Phaser.

	// Countdown latches are single-use barriers that allow one or more threads to
	// wait for one or more other threads to do something. The sole constructor for
	// CountDownLatch takes an int that is the number of times the countDown method
	// must be invoked on the latch before all waiting threads are allowed to
	// proceed.
}
