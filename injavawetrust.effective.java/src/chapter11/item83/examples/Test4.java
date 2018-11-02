package chapter11.item83.examples;

public class Test4 {

	// While you can apply the double-check idiom to static fields as well, there is
	// no reason to do so: the lazy initialization holder class idiom is a better
	// choice.

	// instance fields
	private volatile FieldType field;

	private FieldType getField() {
		FieldType result = field;
		if (result == null) { // First check (no locking)
			synchronized (this) {
				if (field == null) // Second check (with locking)
					field = result = computeFieldValue();
			}
		}
		return result;
	}

	private FieldType computeFieldValue() {
		//
		return new FieldType();
	}
}
