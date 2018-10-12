package chapter06.item38.examples;

public enum BasicOperation implements Operation {

	// While the enum type (BasicOperation) is not extensible, the interface type
	// (Operation) is, and it is the interface type that is used to represent
	// operations in APIs.
	
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {

		@Override
		public double apply(double x, double y) {
			return x - y;
		}

	},
	TIMES("*") {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}

	},
	DIVIDE("/") {

		@Override
		public double apply(double x, double y) {
			return x / y;
		}

	};

	private final String symbol;

	BasicOperation(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

}
