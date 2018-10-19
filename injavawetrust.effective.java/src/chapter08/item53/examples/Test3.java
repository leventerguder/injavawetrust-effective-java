package chapter08.item53.examples;

public class Test3 {

	// The right way to use varargs to pass one or more arguments
	// As you can see from this example, varargs are effective in circumstances
	// where you want a method with a variable number of arguments.
	static int min(int firstArg, int... remainingArgs) {
		int min = firstArg;
		for (int arg : remainingArgs)
			if (arg < min)
				min = arg;
		return min;
	}
}
