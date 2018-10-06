package chapter04.item25.examples.staticmember;

//Static member classes instead of multiple top-level classes
public class Test {
	public static void main(String[] args) {
		System.out.println(Utensil.NAME + Dessert.NAME);
	}

	private static class Utensil {
		static final String NAME = "pan";
	}

	private static class Dessert {
		static final String NAME = "cake";
	}
}