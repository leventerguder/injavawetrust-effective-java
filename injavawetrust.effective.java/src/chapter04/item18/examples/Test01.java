package chapter04.item18.examples;

import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		InstrumentedHashSet<String> ihs = new InstrumentedHashSet<>();
		ihs.addAll(List.of("Snap", "Crackle", "Pop"));

		System.out.println(ihs.getAddCount());
		// We would expect the getAddCount method to return three at this point ,
		// but it returns six.

		// What went wrong ? Internally , HashSet's addAll method is implemented on top
		// of its add method.
		// We could fix the subclass by eliminating its override of the addAll method.
		// While the resulting class would work , it would depend for its proper
		// function on the fact that HashSet's addAll method
		// is implemented on top of its add method.

		// A related cause of fragility in subclasses is that their superclass can
		// acquire new methods in subsequent releases.
		//
		// Both of these problem stem from overriding methods.
		// You might think that it is safe to extends a class if you merely add new
		// methods and refrain from overriding existing methods.

		// Instead of extending an existing class , give your new class a private fields
		// that references an instance of the existing class.

		// The design is called composition because the existing class becomes a
		// component of the new one.

		// Each instance method in the new class invokes the corresponding method on the
		// contained instance of the existing class and returns the results.
		// This is known as forwarding , and the methods in the new class are known as
		// forwarding methods.
		// The resulting class will be rock solid , with no dependencies on the
		// implementation details of the existing class.
		// Even adding new methods to the existing class will have no impact on the new
		// class.


	}
}
