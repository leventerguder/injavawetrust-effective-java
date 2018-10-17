package chapter08.item50.examples;

import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
	
		// Second attack on the internals of a Period instance
		Date start = new Date();
		Date end = new Date();
		Period2 p = new Period2(start, end);
		p.end().setYear(78); // Modifies internals of p!

		// To defend against the second attack, merely modify the accessors to return
		// defensive copies of mutable internal fields:
	}

}
