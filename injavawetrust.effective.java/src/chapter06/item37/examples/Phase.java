package chapter06.item37.examples;

// Using ordinal() to index array of arrays - DON'T DO THIS!
public enum Phase {
	SOLID, LIQUID, GAS;

	// Rows indexed by from-ordinal, cols by to-ordinal
	public enum Transition {
		MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;
		private static final Transition[][] TRANSITIONS = { { null, MELT, SUBLIME }, { FREEZE, null, BOIL },
				{ DEPOSIT, CONDENSE, null } };

		// Returns the phase transition from one phase to another

		public static Transition from(Phase from, Phase to) {
			return TRANSITIONS[from.ordinal()][to.ordinal()];
		}
	}
	// This program works and may even appear elegant, but appearances can be
	// deceiving. Like the simpler garden example shown earlier, the compiler has no
	// way of knowing the relationship between ordinals and array indices. If you
	// make a mistake in the transition table or forget to update it when you modify
	// the Phase or Phase.Transition enum type, your program will fail at runtime.
	// The failure may be an ArrayIndexOutOfBoundsException, a NullPointerException,
	// or (worse) silent erroneous behavior.
}
