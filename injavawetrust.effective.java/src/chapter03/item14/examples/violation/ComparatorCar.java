package chapter03.item14.examples.violation;

import java.util.Comparator;

public class ComparatorCar implements Comparator<Car> {

	// BROKEN difference0based comparator - violates transitivity!
	// @Override
	// public int compare(Car o1, Car o2) {
	// return o1.hashCode() - o2.hashCode();
	// }

	// Do not use this technique. it is fraught with danger from integer overflow
	// and IEEE 754 floating point arithmetic artifacts
	// Furthermore ,the resulting methods are unlikely to be significantly faster
	// than those written using the techniques described in this item.
	// Use either a static compare method
	@Override
	public int compare(Car o1, Car o2) {
		return Integer.compare(o1.hashCode(), o2.hashCode());
	}

	// or a comparator construction method
	static Comparator<Car> hashCodeOrder = Comparator.comparingInt(o -> o.hashCode());
}
