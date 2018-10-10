package chapter06.item34.examples;

public class Test01 {

	// The int enum pattern - severely deficient!
	public static final int APPLE_FUJI = 0;
	public static final int APPLE_PIPPIN = 1;
	public static final int APPLE_GRANNY_SMITH = 2;
	public static final int ORANGE_NAVEL = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD = 2;

	// This technique, known as the int enum pattern, has many shortcomings. It
	// provides nothing in the way of type safety and little in the way of
	// expressive power.

	// Tasty citrus flavored applesauce!
	int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN;

	// Programs that use int enums are brittle. Because int enums are constant
	// variables [JLS, 4.12.4], their int values are compiled into the clients that
	// use them [JLS, 13.1].


}
