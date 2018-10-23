package chapter09.item64.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {

	// Bad - uses class as type!
	LinkedHashSet<String> badSet = new LinkedHashSet<>();

	// Good - uses interface as type
	Set<String> goodSet = new LinkedHashSet<>();
}
