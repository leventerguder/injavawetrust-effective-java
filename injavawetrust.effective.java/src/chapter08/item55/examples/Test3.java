package chapter08.item55.examples;

import java.util.Optional;

public class Test3 {

	void test() {
		Optional<ProcessHandle> parentProcess = Optional.empty();
		System.out.println(
				"Parent PID: " + (parentProcess.isPresent() ? String.valueOf(parentProcess.get().pid()) : "N/A"));
	}

	void test2() {
		Optional<ProcessHandle> parentProcess = Optional.empty();
		System.out.println("Parent PID: " + parentProcess.map(h -> String.valueOf(h.pid())).orElse("N/A"));
	}
}
