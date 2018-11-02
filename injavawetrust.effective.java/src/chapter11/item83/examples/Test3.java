package chapter11.item83.examples;

public class Test3 {

	// Lazy initialization holder class idiom for static fields
	private static class FieldHolder {
		static final FieldType field = computeFieldValue();
	}

	private static FieldType getField() {
		return FieldHolder.field;
	}

	private static FieldType computeFieldValue() {
		//
		return new FieldType();
	}

	// When getField is invoked for the first time, it reads FieldHolder.field for
	// the first time, causing the initialization of the FieldHolder class.

	// The beauty of this idiom is that the getField method is not synchronized and
	// performs only a field access, so lazy initialization adds practically nothing
	// to the cost of acces
}
