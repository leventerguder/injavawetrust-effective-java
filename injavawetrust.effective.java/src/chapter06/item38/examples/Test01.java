package chapter06.item38.examples;

import java.util.Arrays;
import java.util.Collection;

public class Test01 {

	public static void main(String[] args) {
		double x = 2.5;
		double y = 3.6;
		test(ExtendedOperation.class, x, y);
		testV2(Arrays.asList(ExtendedOperation.values()), x, y);
	}

	// The admittedly complex declaration for the opEnumType parameter (<T extends
	// Enum<T> & Operation> Class<T>) ensures that the Class object represents both
	// an enum and a subtype of Operation, which is exactly what is required to
	// iterate over the elements and perform the operation associated with each one.
	private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
		for (Operation op : opEnumType.getEnumConstants())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));

	}

	private static void testV2(Collection<? extends Operation> opSet, double x, double y) {
		for (Operation op : opSet)
			System.out.printf("%f %s %f = %f%n",

					x, op, y, op.apply(x, y));
	}
}
