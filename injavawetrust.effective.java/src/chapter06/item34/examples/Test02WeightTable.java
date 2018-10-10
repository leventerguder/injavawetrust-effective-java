package chapter06.item34.examples;

public class Test02WeightTable {
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble("185");
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
}