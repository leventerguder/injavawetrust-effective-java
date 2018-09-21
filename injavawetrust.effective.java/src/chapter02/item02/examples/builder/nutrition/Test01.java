package chapter02.item02.examples.builder.nutrition;

public class Test01 {

	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		// The Builder pattern simulates named optional parameters as found in Python
		// and Scala.

		// To ensure these invariants against attack, do the checks on object fields
		// after copying parameters from the builder
	}
}
