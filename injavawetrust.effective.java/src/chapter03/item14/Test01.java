package chapter03.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {

	public static void main(String[] args) {
		//
		BigDecimal decimal1 = new BigDecimal("1.0");
		BigDecimal decimal2 = new BigDecimal("1.00");

		System.out.println(decimal1.equals(decimal2));

		Set<BigDecimal> hashSet = new HashSet<>();
		hashSet.add(decimal1);
		hashSet.add(decimal2);
		//
		//
		Set<BigDecimal> treeSet = new TreeSet<>();
		treeSet.add(decimal1);
		treeSet.add(decimal2);

		System.out.println(hashSet); // [1.0, 1.00]
		System.out.println(treeSet); // [1.0]

		// BigDecimal class , whose compareTo method is inconsistent with equals
		// BigDecimal("1.0") , BigDecimal("1.00")

		// HashSet will contain two elements !
		// TreeSet will contain only one element because the two BigDecimal instances
		// are equals when compared using the compareTo method.

	}
}
