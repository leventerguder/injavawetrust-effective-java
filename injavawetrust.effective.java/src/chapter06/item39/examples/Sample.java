package chapter06.item39.examples;

public class Sample {

	@Test
	public static void m1() {

	}

	public static void m2() {

	}

	@Test
	public static void m3() {
		throw new RuntimeException("Boom");
	}

	public static void m4() {

	}

	@Test
	public void m5() { // Invalid USE : nonstatic method

	}

	public static void m6() {

	}

	@Test
	public static void m7() {
		throw new RuntimeException("Crash");
	}

	public static void m8() {
	}
}
