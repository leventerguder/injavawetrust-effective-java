package chapter08.item53.examples;

public class Test2 {
	// The WRONG way to use varargs to pass one or more arguments!

	// The most serious is that if the client invokes this method with no arguments,
	// it fails at runtime rather than compile time. Another problem is that it is
	// ugly
	static int min(int... args) {
		if (args.length == 0)
			throw new IllegalArgumentException("Too few arguments");
		int min = args[0];
		for (int i = 1; i < args.length; i++)
			if (args[i] < min)
				min = args[i];
		return min;
	}

}
