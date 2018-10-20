package chapter09.item60.examples;

public class Test4 {
	/*
	 * An alternative to using BigDecimal is to use int or long, depending on the
	 * amounts involved, and to keep track of the decimal point yourself. In this
	 * example, the obvious approach is to do all computation in cents instead of
	 * dollars.
	 */

	public static void main(String[] args) {
		int itemsBought = 0;
		int funds = 100;
		for (int price = 10; funds >= price; price += 10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Cash left over: " + funds + " cents");
		
		// 4 items bought.
		// Cash left over: 0 cents

	}
}
