package chapter07.item48;

public class Item48Notes {

	// #####
	// Item 48: Use caution when making streams parallel

	// Java 8 introduced streams, which can be parallelized with a single call to
	// the parallel method. Writing concurrent programs in Java keeps getting
	// easier, but writing concurrent programs that are correct and fast is as
	// difficult as it ever was.

	// parallelizing a pipeline is unlikely to increase its performance if the
	// source is from Stream.iterate, or the intermediate operation limit is used.

	// Do not parallelize stream pipelines indiscriminately. The performance
	// consequences may be disastrous.

	// As a rule, performance gains from parallelism are best on streams over
	// ArrayList, HashMap, HashSet, and ConcurrentHashMap instances; arrays; int
	// ranges; and long ranges.

	// Not only can parallelizing a stream lead to poor performance, including
	// liveness failures; it can lead to incorrect results and unpredictable
	// behavior (safety failures).

	// Normally, all parallel stream pipelines in a program run in a common
	// fork-join pool.

	// Under the right circumstances, it is possible to achieve near-linear speedup
	// in the number of processor cores simply by adding a parallel call to a stream
	// pipeline.
}