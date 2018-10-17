package chapter08.item50.examples;

import java.util.Date;

public class Period2 {
	private final Date start;
	private final Date end;

	/**
	 * @param start the beginning of the period
	 * @param end   the end of the period; must not precede start
	 * @throws IllegalArgumentException if start is after end
	 * @throws NullPointerException     if start or end is null
	 */

	// Repaired constructor - makes defensive copies of parameters
	public Period2(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(this.start + " after " + this.end);
	}

	// Note that defensive copies are made before checking the validity of the
	// parameters (Item 49), and the validity check is performed on the copies
	// rather than on the original

	// While this may seem unnatural, it is necessary. It protects the class against
	// changes to the parameters from another thread during the window of
	// vulnerability between the time the parameters are checked and the time they
	// are copied. In the computer security community, this is known as a
	// time-of-check/time-of-use or TOCTOU attack

	// Note also that we did not use Date’s clone method to make the
	// Because Date is nonfinal, the clone method is not guaranteed to return an
	// object whose class is java.util.Date: it could return an instance of an
	// untrusted subclass that is specifically designed for malicious mischief

	public Date start() {
		return start;
	}

	public Date end() {
		return end;
	}
}
