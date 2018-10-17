package chapter08.item49.examples;

import java.util.Objects;

public class Test1 {

	private String strategy;

	Test1() {
		// Inline use of Java's null-checking facility
		this.strategy = Objects.requireNonNull(strategy, "strategy");
	}

	public static void main(String[] args) {

	}
}
