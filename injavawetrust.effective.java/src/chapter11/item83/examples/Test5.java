package chapter11.item83.examples;

public class Test5 {

	// If you don’t care whether every thread recalculates the value of a field, and
	// the type of the field is a primitive other than long or double, then you may
	// choose to remove the volatile modifier from the field declaration in the
	// single-check idiom. This variant is known as the racy single-check idiom.
	
	// Single-check idiom - can cause repeated initialization!
	private volatile FieldType field;

	private FieldType getField() {
		FieldType result = field;
		if (result == null)
			field = result = computeFieldValue();
		return result;
	}

	private FieldType computeFieldValue() {
		//
		return new FieldType();
	}
}
