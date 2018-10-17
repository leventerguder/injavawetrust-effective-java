package chapter08.item50.examples;

import java.util.Date;

// Broken "immutable" time period class
public class Period1 {
	private final Date start;
	private final Date end;

	/**
	 * @param start the beginning of the period
	 * @param end   the end of the period; must not precede start
	 * @throws IllegalArgumentException if start is after end
	 * @throws NullPointerException     if start or end is null
	 */
	public Period1(Date start, Date end) {
		if (start.compareTo(end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
		this.start = start;
		this.end = end;
	}

	public Date start() {
		return start;
	}

	public Date end() {
		return end;
	}
}
