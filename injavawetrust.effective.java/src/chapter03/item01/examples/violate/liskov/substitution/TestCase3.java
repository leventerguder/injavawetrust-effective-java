package chapter03.item01.examples.violate.liskov.substitution;

import java.util.Set;

public class TestCase3 {

	public static void main(String[] args) {

		//

	}

	private static final Set<Point> unitCircle = Set.of(
			new Point(1, 0), new Point(0, 1), 
			new Point(-1, 0),
			new Point(0, -1));
	
	  public static boolean onUnitCircle(Point p) {
	      return unitCircle.contains(p);
	  }
}
