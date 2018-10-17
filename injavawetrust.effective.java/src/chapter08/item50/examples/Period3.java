package chapter08.item50.examples;

import java.util.Date;

public class Period3 {
	private final Date start;
	private final Date end;

	/**
	 * @param start the beginning of the period
	 * @param end   the end of the period; must not precede start
	 * @throws IllegalArgumentException if start is after end
	 * @throws NullPointerException     if start or end is null
	 */

	// Repaired constructor - makes defensive copies of parameters
	public Period3(Date start, Date end) {
		this.start = start();
		this.end = end();
		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(this.start + " after " + this.end);
	}

	// Repaired accessors - make defensive copies of internal fields
	// With the new constructor and the new accessors in place, Period is truly immutable. 
	public Date start() {
		return new Date(start.getTime());
	}

	public Date end() {
		return new Date(end.getTime());
	}
}
