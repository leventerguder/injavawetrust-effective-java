package chapter07.item46;

public class Item46Notes {

	// ##### Item 46 : Prefer side-effect-free functions in streams

	// Streams isn’t just an API, it’s a paradigm based on functional programming.
	// In order to obtain the expressiveness, speed, and in some cases
	// parallelizability that streams have to offer, you have to adopt the paradigm
	// as well as the API.

	// The most important part of the streams paradigm is to structure your
	// computation as a sequence of transformations where the result of each stage
	// is as close as possible to a pure function of the result of the previous
	// stage.

	// The forEach operation should be used only to report the result of a stream
	// computation, not to perform the computation.

	// The improved code uses a collector, which is a new concept that you have
	// to learn in order to use streams.

	// The collectors for gathering the elements of a stream into a true
	// Collection are straightforward. There are three such collectors:
	// toList(), toSet(), and toCollection(collectionFactory).

	// It is customary and wise to statically import all members
	// of Collectors because it makes stream pipelines more readable.

	// The simplest map collector is toMap(keyMapper, valueMapper),
	// which takes two functions, one of which maps a stream element to a key, the
	// other, to a value.

	// In addition to the toMap method, the Collectors API provides the
	// groupingBy method, which returns collectors to produce maps that group
	// elements into categories based on a classifier function.

	// words.collect(groupingBy(word -> alphabetize(word)))

	// Map<String, Long> freq = words.collect(groupingBy(String::toLowerCase,
	// counting()))

	// there is never a reason to say collect(counting()).
	
	// Collectors method is joining, which operates only on streams of CharSequence instances such as strings.
	
	//	In summary, the essence of programming stream pipelines is side-effectfree
	//	function objects. This applies to all of the many function objects passed
	//	to streams and related objects. The terminal operation forEach should only
	//	be used to report the result of a computation performed by a stream, not to
	//	perform the computation. In order to use streams properly, you have to know
	//	about collectors. The most important collector factories are toList, toSet,
	//	toMap, groupingBy, and joining.
}
