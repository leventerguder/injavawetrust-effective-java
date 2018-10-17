package chapter07.item47;

public class Item47Notes {

	// #####
	// Item 47 : Prefer Collection to Stream as a return type

	// In Java 8, streams were added to the platform, substantially complicating the
	// task of choosing the appropriate return type for a sequence-returning method.

	// You may hear it said that streams are now the obvious choice to return a
	// sequence of elements, but as discussed in Item 45, streams do not make
	// iteration obsolete: writing good code requires combining streams and
	// iteration judiciously.

	// The Collection interface is a subtype of Iterable and has a stream method, so
	// it provides for both iteration and stream access. Therefore, Collection or an
	// appropriate subtype is generally the best return type for a public,
	// sequence-returning method.

	// do not store a large sequence in memory just to return it as a collection.

	// In summary, when writing a method that returns a sequence of elements,
	// remember that some of your users may want to process them as a stream while
	// others may want to iterate over them. Try to accommodate both groups. If it’s
	// feasible to return a collection, do so. If you already have the elements in a
	// collection or the number of elements in the sequence is small enough to
	// justify creating a new one, return a standard collection such as ArrayList.
	// Otherwise, consider implementing a custom collection as we did for the power
	// set. If it isn’t feasible to return a collection, return a stream or
	// iterable, whichever seems more natural. If, in a future Java release, the
	// Stream interface declaration is modified to extend Iterable, then you should
	// feel free to return streams because they will allow for both stream
	// processing and iteration.

	// In summary, do not even attempt to parallelize a stream pipeline unless you
	// have good reason to believe that it will preserve the correctness of the
	// computation and increase its speed. The cost of inappropriately parallelizing
	// a stream can be a program failure or performance disaster. If you believe
	// that parallelism may be justified, ensure that your code remains correct when
	// run in parallel, and do careful performance measurements under realistic
	// conditions. If your code remains correct and these experiments bear out your
	// suspicion of increased performance, then and only then parallelize the stream
	// in production code.
}
