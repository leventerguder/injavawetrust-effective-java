package chapter11.item83.examples;

public class Test2 {

	// If you use lazy initialization to break an initialization circularity, use a
	// synchronized accessor because it is the simplest, clearest alternative:

	// Lazy initialization of instance field - synchronized accessor
	private FieldType field;

	private synchronized FieldType getField() {
		if (field == null)
			field = computeFieldValue();
		return field;
	}

	private FieldType computeFieldValue() {
		//
		return new FieldType();
	}
}
