package chapter03.item10.examples.violate.liskov.substitution;

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


}
