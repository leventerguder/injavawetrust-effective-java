package chapter06.item37.examples;

import java.util.Map;
import java.util.stream.Stream;
import java.util.EnumMap;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.groupingBy;

// Using a nested EnumMap to associate data with enum pairs
public enum PhaseV2 {
	SOLID, LIQUID, GAS;

	public enum Transition {
		MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID), SUBLIME(SOLID, GAS),
		DEPOSIT(GAS, SOLID);
		private final PhaseV2 from;
		private final PhaseV2 to;

		Transition(PhaseV2 from, PhaseV2 to) {
			this.from = from;
			this.to = to;
		}

		// Initialize the phase transition map
		private static final Map<PhaseV2, Map<PhaseV2, Transition>> m =

				Stream.of(values()).collect(groupingBy(t -> t.from, () -> new EnumMap<>(PhaseV2.class),
						toMap(t -> t.to, t -> t, (x, y) -> y, () -> new EnumMap<>(PhaseV2.class))));
	}
}
