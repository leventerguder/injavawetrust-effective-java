package chapter02.item03.examples;

public class Elvis {

	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {

		// The private constructor is called once , to initialize the public static
		// final field Elvic.INSTANCE

		// Nothing that a client does can change this , with one caveat : a privileged
		// client can invoke the private constructor reflectively with the aid of the
		// AccessibleObject.setAccessible method.
		// if you need to defend against this attack, modify the constructor make it
		// throw an exception if it's asked to create a second instance.

	}
}

class Elvis2 {
	private static final Elvis2 INSTANCE = new Elvis2();

	public static Elvis2 getInstance() {
		return INSTANCE;
	}
}

// Main advantage of the public field approach is that the API makes it clear that the class is a singleton.
// the public static field is final , so it will always contain the same object reference.

// One advantage of the static factory approach is that it gives you the 
// flexibility to change your mind about whether the class is a singleton without changing its API.

// To maintain the singleton guarantee , declare all instance fields transient and provide a readResolve method.
// otherwise , each time a serialized instance is deserialized , a new instance will be created.