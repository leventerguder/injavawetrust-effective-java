package chapter06.item34.examples;

// Enum type that switches on its own value - questionable
public enum Operation {
	PLUS, MINUS, TIMES, DIVIDE;

	// Do the arithmetic operation represented by this constant
	public double apply(double x, double y) {
		switch (this) {
		case PLUS:
			return x + y;
		case MINUS:
			return x - y;
		case TIMES:
			return x * y;
		case DIVIDE:
			return x / y;
		}
		throw new AssertionError("Unknown op: " + this);
	}

	// This code works, but it isn’t very pretty. It won’t compile without the throw
	// statement because the end of the method is technically reachable, even though
	// it will never be reached [JLS, 14.21]. Worse, the code is fragile. If you add
	// a new enum constant but forget to add a corresponding case to the switch, the
	// enum will still compile, but it will fail at runtime when you try to apply
	// the new operation.

	public static Operation inverse(Operation op) {
		switch (op) {
		case PLUS:
			return Operation.MINUS;
		case MINUS:
			return Operation.PLUS;
		case TIMES:
			return Operation.DIVIDE;
		case DIVIDE:
			return Operation.TIMES;
		default:
			throw new AssertionError("Unknown op: " + op);
		}
	}
}
