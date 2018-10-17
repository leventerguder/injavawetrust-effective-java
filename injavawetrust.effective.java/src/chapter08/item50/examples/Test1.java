package chapter08.item50.examples;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// Attack the internals of a Period instance
		Date start = new Date();
		Date end = new Date();
		Period1 p = new Period1(start, end);
		end.setYear(78); // Modifies internals of p!

		// easy to violate this invariant by exploiting the fact that Date is mutable:

		// As of Java 8, the obvious way to fix this problem is to use Instant (or
		// Local-DateTime or ZonedDateTime) in place of a Date because Instant (and the
		// other java.time classes) are immutable
	}
}
