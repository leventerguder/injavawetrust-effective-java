package chapter06.item34.examples;

//Enum type with constant-specific method implementations
public enum OperationV2 {

	// If you add a new constant to the second version of Operation, it is unlikely
	// that you’ll forget to provide an apply method, because the method immediately
	// follows each constant declaration. In the unlikely event that you do forget,
	// the compiler will remind you because abstract methods in an enum type must be
	// overridden with concrete methods in all of its constants.
	
	PLUS {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE {
		public double apply(double x, double y) {
			return x / y;
		}
	};

	public abstract double apply(double x, double y);
}