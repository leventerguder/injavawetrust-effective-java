package chapter08.item53;

public class Item53Notes {

	// #####
	// Item 53: Use varargs judiciously

	// Varargs methods, formally known as variable arity methods [JLS, 8.4.1],
	// accept zero or more arguments of a specified type.

	// The varargs facility works by first creating an array whose size is the
	// number of arguments passed at the call site, then putting the argument values
	// into the array, and finally passing the array to the method.

	// Every invocation of a varargs method causes an array allocation and
	// initialization.

	// The static factories for EnumSet use this technique to reduce the cost of
	// creating enum sets to a minimum. This was appropriate because it was critical
	// that enum sets provide a performance-competitive replacement for bit fields
	// (Item 36).

	// In summary, varargs are invaluable when you need to define methods with a
	// variable number of arguments. Precede the varargs parameter with any required
	// parameters, and be aware of the performance consequences of using varargs.

}
