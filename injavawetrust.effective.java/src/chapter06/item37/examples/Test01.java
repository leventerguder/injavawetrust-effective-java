package chapter06.item37.examples;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

// Using ordinal() to index into an array - DON'T DO THIS!
public class Test01 {
	void tt() {
		Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
		for (int i = 0; i < plantsByLifeCycle.length; i++)
			plantsByLifeCycle[i] = new HashSet<>();

		List<Plant> garden = null;
		for (Plant p : garden)
			plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);

	}
}
