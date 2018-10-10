package chapter06.item34.examples;

public enum Planet {
	MERCURY(3.302e+23, 2.439e6), VENUS(4.869e+24, 6.052e6), EARTH(5.975e+24, 6.378e6), MARS(6.419e+23, 3.393e6),
	JUPITER(1.899e+27, 7.149e7), SATURN(5.685e+26, 6.027e7), URANUS(8.683e+25, 2.556e7), NEPTUNE(1.024e+26, 2.477e7);

	// Fields can be public, but it is better to make them private and provide public accessors (Item 16).
	private final double mass;
	private final double radius;
	private final double surfaceGravity;
	private static final double G = 6.67300E-11;

	// To associate data with enum constants, declare instance fields and write a
	// constructor that takes the data and stores it in the fields.

	// Enums are by their nature immutable, so all fields should be final (Item 17).

	// Constructor
	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		surfaceGravity = G * mass / (radius * radius);
	}

	public double mass() {
		return mass;
	}

	public double radius() {
		return radius;
	}

	public double surfaceGravity() {
		return surfaceGravity;
	}

	public double surfaceWeight(double mass) {
		return mass * surfaceGravity; // F = ma
	}

}
