package chapter12.item90.examples;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public final class Period implements Serializable {

	private final Date start;
	private final Date end;

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

	// Serialization proxy for Period class
	private static class SerializationProxy implements Serializable {
		private final Date start;
		private final Date end;

		SerializationProxy(Period p) {
			this.start = p.start;
			this.end = p.end;
		}

		private static final long serialVersionUID = 234098243823485285L;

		// Finally, provide a readResolve method on the SerializationProxy class that
		// returns a logically equivalent instance of the enclosing class.

		// readResolve method for Period.SerializationProxy
		private Object readResolve() {
			return new Period(start, end); // Uses public constructor
		}
	}

	// writeReplace method for the serialization proxy pattern
	private Object writeReplace() {
		return new SerializationProxy(this);
	}

	// the writeReplace method translates an instance of the enclosing class to its
	// serialization proxy prior to serialization.

	// With this writeReplace method in place, the serialization system will never
	// generate a serialized instance of the enclosing class, but an attacker might
	// fabricate one in an attempt to violate the class’s invariants. To guarantee
	// that such an attack would fail, merely add this readObject method to the
	// enclosing class:

	// readObject method for the serialization proxy pattern
	private void readObject(ObjectInputStream stream) throws InvalidObjectException {
		throw new InvalidObjectException("Proxy required");
	}

	@Override
	public String toString() {
		return "Period [start=" + start + ", end=" + end + "]";
	}

}
