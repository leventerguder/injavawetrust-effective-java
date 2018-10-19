package chapter08.item55.examples;

import java.util.List;

public class Test2 {

	// If a method returns an optional, the client gets to choose what action to
	// take if the method can’t return a value. You can specify a default value:

	// Using an optional to provide a chosen default value
	List<String> words;

	public String test() {
		String lastWordInLexicon = Test1.maxV3(words).orElse("No words...");
		return lastWordInLexicon;
	}

	// or you can throw any exception that is appropriate. Note that we pass in an
	// exception factory rather than an actual exception. This avoids the expense of
	// creating the exception unless it will actually be thrown:

	// Using an optional to throw a chosen exception

	public String test2() {
		String lastWordInLexicon = Test1.maxV3(words).orElseThrow(RuntimeException::new);
		return lastWordInLexicon;
	}
}
