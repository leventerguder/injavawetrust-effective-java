package chapter03.item10.examples.violate.transitivity;

import java.awt.Color;

public class Point {

	final int x;
	final int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
}

class ColorPoint extends Point {
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	// How should the equals method look ?
	// if you leave it out entirely , the implementation is inherited from Point and
	// color information is ignored in equals comparisons.
	//

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	// Broken - violates symmetry!
//	@Override
//	public boolean equals(Object o) {
//		if (!(o instanceof ColorPoint))
//			return false;
//		return super.equals(o) && ((ColorPoint) o).color == color;
//	}

	// Broken - violates transitivity!
//	@Override
//	public boolean equals(Object o) {
//		if (!(o instanceof Point))
//			return false;
//		// If o is a normal Point, do a color-blind comparison
//		if (!(o instanceof ColorPoint))
//			return o.equals(this);
//		// o is a ColorPoint; do a full comparison
//		return super.equals(o) && ((ColorPoint) o).color == color;
//	}
	
	
	@Override public boolean equals(Object o) {
	      if (o == null || o.getClass() != getClass())
	          return false;
	      Point p = (Point) o;
	      return p.x == x && p.y == y;
	  }

}