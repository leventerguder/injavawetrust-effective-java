package chapter03.item10.examples.violate.transitivity.case2;

import java.awt.Color;

public class ColorPoint extends Point {

	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	// Broken - violates transitivity!
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		// If o is a normal Point, do a color-blind comparison
		if (!(o instanceof ColorPoint))
			return o.equals(this);
		// o is a ColorPoint; do a full comparison
		return super.equals(o) && ((ColorPoint) o).color == color;
	}

////	@Override
////	public boolean equals(Object obj) {
////		if (this == obj)
////			return true;
////		if (!super.equals(obj))
////			return false;
////		if (getClass() != obj.getClass())
////			return false;
////		ColorPoint other = (ColorPoint) obj;
////		if (color == null) {
////			if (other.color != null)
////				return false;
////		} else if (!color.equals(other.color))
////			return false;
////		return true;
////	}
//
//	// Broken - violates symmetry!
//	@Override
//	public boolean equals(Object o) {
//		if (!(o instanceof ColorPoint))
//			return false;
//		return super.equals(o) && ((ColorPoint) o).color == color;
//	}
//
//	// How should the equals method look? If you leave it out entirely, the
//	// implementation is inherited from Point and color information is ignored in
//	// equals comparisons. While this does not violate the equals contract, it is
//	// clearly unacceptable. Suppose you write an equals method that returns true
//	// only if its argument is another color point with the same position and color:

}
