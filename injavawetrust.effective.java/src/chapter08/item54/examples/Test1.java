package chapter08.item54.examples;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Returns null to indicate an empty collection. Don't do this!
public class Test1 {

	private final List<Cheese> cheesesInStock = null;

	/**
	 * @return a list containing all of the cheeses in the shop, or null if no
	 *         cheeses are available for purchase.
	 */
	public List<Cheese> getCheeses() {
		return cheesesInStock.isEmpty() ? null : new ArrayList<>(cheesesInStock);
	}

	private void test() {
		Test1 shop = new Test1();
		List<Cheese> cheeses = shop.getCheeses();
		// This sort of circumlocution is required in nearly every use of a method that
		// returns null in place of an empty collection or array. It is error-prone,
		// because the programmer writing the client might forget to write the special-
		// case code to handle a null return. Such an error may go unnoticed for years
		// because such methods usually return one or more objects
		if (cheeses != null && cheeses.contains(Cheese.STILTON))
			System.out.println("Jolly good, just the thing.");
	}

	// It is sometimes argued that a null return value is preferable to an empty
	// collection or array because it avoids the expense of allocating the empty
	// container. This argument fails on two counts. First, it is inadvisable to
	// worry about performance at this level unless measurements have shown that the
	// allocation in question is a real contributor to performance problems (Item
	// 67). Second, it is possible to return empty collections and arrays without
	// allocating them. Here is the typical code to return a possibly empty
	// collection. Usually, this is all you need:

	// The right way to return a possibly empty collection
	public List<Cheese> getCheesesV2() {
		return new ArrayList<>(cheesesInStock);
	}

	// Optimization - avoids allocating empty collections
	public List<Cheese> getCheesesV3() {
		return cheesesInStock.isEmpty() ? Collections.emptyList() : new ArrayList<>(cheesesInStock);
	}

	// The right way to return a possibly empty array
	public Cheese[] getCheesesArray() {
		return cheesesInStock.toArray(new Cheese[0]);
	}

	// Optimization - avoids allocating empty arrays
	private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

	public Cheese[] getCheesesArrayV2() {
		return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
	}

	/*
	 * In the optimized version, we pass the same empty array into every toArray
	 * call, and this array will be returned from getCheeses whenever cheesesInStock
	 * is empty. Do not preallocate the array passed to toArray in hopes of
	 * improving performance. Studies have shown that it is counterproductive
	 * [Shipilëv16]:
	 */
	
	// Don’t do this - preallocating the array harms performance!
	public Cheese[] getCheesesArrayV3() {
		return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]);
	}

}

enum Cheese {
	STILTON
}
