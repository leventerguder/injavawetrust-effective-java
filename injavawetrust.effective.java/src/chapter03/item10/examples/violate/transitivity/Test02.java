package chapter03.item10.examples.violate.transitivity;

import java.awt.Color;

public class Test02 {

	public static void main(String[] args) {
		ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
		
		System.out.println(p1.equals(p2)); // true
		System.out.println(p2.equals(p3)); // true
		System.out.println(p1.equals(p3)); // false
	}
	
	// There is no way to extend an instantiable class and add a value component while preserving the equals contract, 
}
