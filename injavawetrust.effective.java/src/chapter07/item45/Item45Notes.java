package chapter07.item45;

public class Item45Notes {

	// ##### Item 45 : Use streams judiciously
	// The streams API was added in Java 8 to ease the task of performing bulk
	// operations, sequentially or in parallel.

	// This API provides two key abstractions: the stream, which represents a finite
	// or infinite sequence of data elements, and the stream pipeline, which
	// represents a multistage computation on these elements.

	// The elements in a stream can come from anywhere.
	// Common sources include collections, arrays, files, regular expression pattern
	// matchers, pseudorandom number generators, and other streams.

	// The data elements in a stream can be object references or primitive values.
	// Three primitive types are supported: int, long, and double.

	// A stream pipeline consists of a source stream followed by zero or more
	// intermediate operations and one terminal operation.

	// Each intermediate operation transforms the stream in some way, such as
	// mapping each element to a function of that element or filtering out all
	// elements that do not satisfy some condition.

	// Stream pipelines are evaluated lazily: evaluation doesn’t start until the
	// terminal operation is invoked, and data elements that aren’t required in
	// order to complete the terminal operation are never computed.

	// The streams API is fluent: it is designed to allow all of the calls that
	// comprise a pipeline to be chained into a single expression. In fact, multiple
	// pipelines can be chained together into a single expression.

	// By default, stream pipelines run sequentially. Making a pipeline execute in
	// parallel is as simple as invoking the parallel method on any stream in the
	// pipeline, but it is seldom appropriate to do so (Item 48).

	// If you find this code hard to read, don’t worry; you’re not alone. It is
	// shorter, but it is also less readable, especially to programmers who are not
	// experts in the use of streams. Overusing streams makes programs hard to read
	// and maintain.

	// In the absence of explicit types, careful naming of lambda parameters is
	// essential to the readability of stream pipelines.

	// Using helper methods is even more important for readability in stream
	// pipelines than in iterative code because pipelines lack explicit type
	// information and named temporary variables

	// refactor existing code to use streams and use them in new code only where it
	// makes sense to do so.

	// There are some things you can do from code blocks that you can’t do from
	// function objects:

	// From a code block, you can read or modify any local variable in scope
	// from a lambda, you can only read final or effectively final variables [JLS
	// 4.12.4], and you can’t modify any local variables.

	// From a code block, you can return from the enclosing method, break
	// or continue an enclosing loop, or throw any checked exception that this
	// method is declared to throw; from a lambda you can do none of these things.

	// streams make it very easy to do some things:

	// • Uniformly transform sequences of elements
	// • Filter sequences of elements
	// • Combine sequences of elements using a single operation (for example to add
	// them, concatenate them, or compute their minimum)
	// • Accumulate sequences of elements into a collection, perhaps grouping them
	// by some common attribute
	// • Search a sequence of elements for an element satisfying some criterion
	
	
	//	In summary, some tasks are best accomplished with streams, and others
	//	with iteration. Many tasks are best accomplished by combining the two
	//	approaches. There are no hard and fast rules for choosing which approach to
	//	use for a task, but there are some useful heuristics. In many cases, it will be
	//	clear which approach to use; in some cases, it won’t. If you’re not sure
	//	whether a task is better served by streams or iteration, try both and see
	//	which works better.
}
