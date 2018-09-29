package chapter03.item14.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		Car ford = new Car("50", "ford", 100);
		Car fiat = new Car("20", "fiat", 50);
		Car subaru = new Car("500", "subaru", 5000);
		Car bmw = new Car("200", "bmv", 1000);

		List<Car> carList = new ArrayList<>();
		carList.add(ford);
		carList.add(fiat);
		carList.add(subaru);
		carList.add(bmw);

		for (Car c : carList) {
			System.out.println(c);
		}
		System.out.println();

		Collections.sort(carList);

		System.out.println("Comparable Sorting");
		for (Car c : carList) {
			System.out.println(c);
		}

	}
}
