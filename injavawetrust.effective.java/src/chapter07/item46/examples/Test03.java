package chapter07.item46.examples;

import static java.util.stream.Collectors.toMap;

import java.util.Map;
import java.util.stream.Stream;

public class Test03 {

	// Using a toMap collector to make a map from string to enum
	private static final Map<String, Operation> stringToEnum = Stream.of(Operation.values())
				.collect(toMap(Object::toString, e -> e));
}
