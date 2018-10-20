package chapter09.item60.examples;

public class Test2 {

	// Broken - uses floating point for monetary calculation!
	public static void main(String[] args) {

		double funds = 1.00;

		int itemsBought = 0;

		for (double price = 0.10; funds >= price; price += 0.10) {
			funds -= price;
			itemsBought++;
		}

		System.out.println(itemsBought + " items bought.");
		System.out.println("Change: $" + funds);

		// 3 items bought.
		// Change: $0.3999999999999999

		/*
		 * If you run the program, you’ll find that you can afford three pieces of
		 * candy, and you have $0.3999999999999999 left. This is the wrong answer!
		 */

	}
}
