package chapter09.item60.examples;

import java.math.BigDecimal;

public class Test3 {

	public static void main(String[] args) {
		final BigDecimal TEN_CENTS = new BigDecimal(".10");
		int itemsBought = 0;
		BigDecimal funds = new BigDecimal("1.00");
		for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
			funds = funds.subtract(price);
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Money left over: $" + funds);

		// Correct answer!!
		// 4 items bought.
		// Money left over: $0.00

	}
}
