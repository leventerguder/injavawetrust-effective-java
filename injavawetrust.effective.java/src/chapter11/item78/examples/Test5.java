package chapter11.item78.examples;

public class Test5 {

	// Broken - requires synchronization!
	private static volatile int nextSerialNumber = 0;

	public static int generateSerialNumber() {
		return nextSerialNumber++;
	}

	// The intent of the method is to guarantee that every invocation returns a
	// unique value (so long as there are no more than 2^32 invocations). The
	// method’s state consists of a single atomically accessible field,
	// nextSerialNumber, and all possible values of this field are legal.

	// Therefore, no synchronization is necessary to protect its invariants. Still,
	// the method won’t work properly without synchronization.

	// The problem is that the increment operator (++) is not atomic. It performs
	// two operations on the nextSerialNumber field: first it reads the value, and
	// then it writes back a new value, equal to the old value plus one. If a second
	// thread reads the field between the time a thread reads the old value and
	// writes back a new one, the second thread will see the same value as the first
	// and return the same serial number. This is a safety failure: the program
	// computes the wrong results.

	// One way to fix generateSerialNumber is to add the synchronized modifier to
	// its declaration. This ensures that multiple invocations won’t be interleaved
	// and that each invocation of the method will see the effects of all previous
	// invocations. Once you’ve done that, you can and should remove the volatile
	// modifier from nextSerialNumber.
}
