package chapter06.item34.examples;

import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toMap;
import java.util.stream.Stream;

// Enum type with constant-specific class bodies and data
public enum OperationV3 {

	PLUS("+") {

		public double apply(double x, double y) {
			return x + y;
		}

	},
	MINUS("-") {

		public double apply(double x, double y) {
			return x - y;
		}

	},
	TIMES("*") {

		public double apply(double x, double y) {
			return x * y;
		}

	},
	DIVIDE("/") {

		public double apply(double x, double y) {
			return x / y;
		}

	};
	// A disadvantage of constant-specific method implementations is that they make
	// it harder to share code among enum constants.

	public abstract double apply(double x, double y);

	private final String symbol;

	OperationV3(String symbol) {
		// Enum constructors aren’t permitted to access the enum’s static fields, with
		// the exception of constant variables
		// This restriction is necessary because static fields have not yet been
		// initialized when enum constructors run.
		// System.out.println(PLUS); // Cannot refer to the static enum field
		// OperationV3.PLUS within an initializer
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;

	}

	private static final Map<String, OperationV3> stringToEnum = Stream.of(values())
			.collect(toMap(Object::toString, e -> e));

	// Returns Operation for string, if any
	public static Optional<OperationV3> fromString(String symbol) {
		return Optional.ofNullable(stringToEnum.get(symbol));
	}

	// Note that the Operation constants are put into the stringToEnum map from a
	// static field initialization that runs after the enum constants have been
	// created.

}
