package chapter03.item10.examples.violate.liskov.substitution;

import java.util.Set;

public class TestCase3 {

	public static void main(String[] args) {

		Point point = new Point(1, 0);
		CounterPoint cp = new CounterPoint(1, 0);
		System.out.println(onUnitCircle(point));
		System.out.println(onUnitCircle(cp));

		//
		// if the Point class uses a getClass based equals method
		// the onUnitCircle method will return false regardless of the CounterPoint
		// instance's x and y coordinates
		// This is so because most collections, including the HashSet used by the onUnitCircle method, use the equals method
		// to test for containment, and no CounterPoint instance is equal to any Point.
		//

	}

	private static final Set<Point> unitCircle = Set.of(new Point(1, 0), new Point(0, 1), new Point(-1, 0),
			new Point(0, -1));

	public static boolean onUnitCircle(Point p) {
		return unitCircle.contains(p);
	}
}
