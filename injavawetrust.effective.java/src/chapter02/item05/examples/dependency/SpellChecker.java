package chapter02.item05.examples.dependency;

import java.util.Objects;

// Dependency injection provides flexibility and testability

public class SpellChecker {

	private final Lexicon dictionary;

	public SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}

	public boolean isValid(String word) {
		return true;
	}

}

class Lexicon {

}

// The dependency injection pattern is so simple that many programmers use it for years without knowing it has a name.
// A useful variant of the pattern is to pass resource factory to the constructor.
// A factory is an object that can be called repeatedly to create instance of a type
// The Supplier<T> interface , introduced in Java 8 is perfect for representing factories.
// Methods that take a Supplier<T> on input should typically constrain the factory's type parameter 
// using a bounded wildcard type to allow the client to pass in a factory that creates any subtype of a specified type.

 // Dependency injection greatly improves flexibility and testability.

// In summary, do not use a singleton or static utility class to implement a class that depends on one or more underlying resources
// whose behavior affects that of the class , and do not have the class create these resources directly.
// Instead , pass the resources , or factories to create them, into the constructor (or static factory or builder)
// This practice , known as dependency injection, will greatly enhance the flexibility, reusability , and testability of a class.