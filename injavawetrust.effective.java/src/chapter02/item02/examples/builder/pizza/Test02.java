package chapter02.item02.examples.builder.pizza;

import chapter02.item02.examples.builder.pizza.NyPizza.Size;
import chapter02.item02.examples.builder.pizza.Pizza.Topping;

public class Test02 {

	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
		Calzone calzone = new Calzone.Builder().addTopping(Topping.HAM).sauceInside().build();
	}
}

