package chapter06.item37.examples;

import java.util.EnumMap;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;

public class Test02 {

	// TODO
	private Plant[] garden;

	// EnumMap is comparable in speed to an ordinal-indexed array is that EnumMap
	// uses such an array internally, but it hides this implementation detail from
	// the programmer, combining the richness and type safety of a Map with the
	// speed of an array
	void test() {
		Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
		for (Plant.LifeCycle lc : Plant.LifeCycle.values())
			plantsByLifeCycle.put(lc, new HashSet<>());
		for (Plant p : garden)
			plantsByLifeCycle.get(p.lifeCycle).add(p);
		System.out.println(plantsByLifeCycle);
	}
}
