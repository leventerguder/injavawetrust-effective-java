package chapter06.item37.examples;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class Test03 {

	// TODO
	private Plant[] garden;

	// Naive stream-based approach - unlikely to produce an EnumMap!
	void test() {
		Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
		for (Plant.LifeCycle lc : Plant.LifeCycle.values())
			plantsByLifeCycle.put(lc, new HashSet<>());
		System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle)));
	}

	// Using a stream and an EnumMap to associate data with an enum
	void testV2() {
		Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
		for (Plant.LifeCycle lc : Plant.LifeCycle.values())
			plantsByLifeCycle.put(lc, new HashSet<>());
		
		System.out.println(Arrays.stream(garden)
				.collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(Plant.LifeCycle.class), toSet())));
	}
}
