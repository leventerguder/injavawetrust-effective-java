package chapter02.item06.examples;

public class Test02 {

	// Hideously slow !
	private static long sum() {
		Long sum = 0L;

		for (long i = 0; i <= Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}
	
	// the variable sum is declared as a Long instead of a long.
	// which means that the program constructs about 2^31 unnecessary Long instances.
	
	// prefer primitives to boxed primitives , and watch out for unintentional autoboxing!
}
