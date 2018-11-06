package chapter12.item88.examples;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

// Immutable class that uses defensive copying
public final class Period implements Serializable {

	// Suppose you decide that you want this class to be serializable. Because the
	// physical representation of a Period object exactly mirrors its logical data
	// content, it is not unreasonable to use the default serialized form (Item 87).

	// private final Date start;
	// private final Date end;

	private Date start;
	private Date end;

	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
	}

	public Date start() {
		return new Date(start.getTime());
	}

	public Date emd() {
		return new Date(end.getTime());
	}

	// readObject method with validity checking - insufficient!
	//	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
	//		s.defaultReadObject();
	//		// Check that our invariants are satisfied
	//		if (start.compareTo(end) > 0)
	//			throw new InvalidObjectException(start + " after " + end);
	//	}

	// readObject method with defensive copying and validity checking
	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		s.defaultReadObject();
		// Defensively copy our mutable components
		start = new Date(start.getTime());
		end = new Date(end.getTime());
		// Check that our invariants are satisfied
		if (start.compareTo(end) > 0)
			throw new InvalidObjectException(start + " after " + end);
	}

	@Override
	public String toString() {
		return "Period [start=" + start + ", end=" + end + "]";
	}

}
