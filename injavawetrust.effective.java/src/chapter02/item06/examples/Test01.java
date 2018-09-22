package chapter02.item06.examples;

public class Test01 {

	String s = new String("not-effective");
	// Dont do this.
	// The statement creates a new String instance each time it is executed , and
	// none of those object creatings is necessary.

	String s2 = "this-is-effective";
	// This version uses a single String instance , rather than creating a new one
	// each time it is executed.

}
