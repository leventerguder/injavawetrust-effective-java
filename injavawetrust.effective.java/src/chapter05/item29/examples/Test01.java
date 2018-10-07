package chapter05.item29.examples;

public class Test01 {

	public static void main(String[] args) {

		StackV2<String> stackV2 = new StackV2<>();
		stackV2.push("e1");
		stackV2.push("e2");
		stackV2.push("e3");

		while (!stackV2.isEmpty())
			System.out.println(stackV2.pop());

		StackV3<String> stackV3 = new StackV3<>();
		stackV3.push("e1");
		stackV3.push("e2");
		stackV3.push("e3");

		while (!stackV3.isEmpty())
			System.out.println(stackV3.pop());

	}
}
