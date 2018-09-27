package chapter03.item10.examples.violate.transitivity.case2;

import java.awt.Color;

public class TestCase2 {

	public static void main(String[] args) {

		ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

		// This approach does provide symmetry, but at the expense of transitivity:
		System.out.println(p1.equals(p2)); // true
		System.out.println(p2.equals(p3)); // true
		System.out.println(p1.equals(p3)); // false

	}
}
