package chapter04.item23.examples;

public class Figure {

	enum Shape {
		RECTANGLE, CIRCLE
	};

	// Tag field -the shape of this figure
	final Shape shape;

	// these fields are used only if shape is RECTANGLE
	double length;
	double width;

	// this field is used only if shape is CIRCLE
	double radius;

	// Constructor for circle
	public Figure(double radius) {
		super();
		shape = Shape.CIRCLE;
		this.radius = radius;
	}

	// Construct for rectangle
	public Figure(double length, double width) {
		super();
		shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}

	double area() {
		switch (shape) {
		case RECTANGLE:
			return length * width;
		case CIRCLE:
			return Math.PI * (radius * radius);
		default:
			throw new AssertionError(shape);
		}
	}

}
