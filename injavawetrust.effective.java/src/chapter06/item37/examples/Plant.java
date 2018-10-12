package chapter06.item37.examples;

public class Plant {
	enum LifeCycle {
		ANNUAL, PERENNIAL, BIENNIAL
	}

	final String name;
	final LifeCycle lifeCycle;

	Plant(String name, LifeCycle lifeCycle) {
		this.name = name;
		this.lifeCycle = lifeCycle;
	}

	@Override
	public String toString() {
		return name;
	}
}
