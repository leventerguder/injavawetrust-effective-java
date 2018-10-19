package chapter08.item53.examples;

public class Test4 {

	// Every invocation of a varargs method causes an array allocation and
	// initialization.
	// Suppose you’ve determined that 95 percent of the calls to a method have three
	// or fewer parameters. Then declare five overloadings of the method,
	// one each with zero through three ordinary parameters, and a single varargs
	// method for use when the number of arguments exceeds three:

	// Now you know that you’ll pay the cost of the array creation only in the 5
	// percent of all invocations where the number of parameters exceeds three.
	public void foo() {
	}

	public void foo(int a1) {
	}

	public void foo(int a1, int a2) {
	}

	public void foo(int a1, int a2, int a3) {
	}

	public void foo(int a1, int a2, int a3, int... rest) {
	}
}
