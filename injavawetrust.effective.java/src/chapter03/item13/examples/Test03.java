package chapter03.item13.examples;

public class Test03 {

	public static void main(String[] args) {
		StackImpl2 stack = new StackImpl2();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		StackImpl2 cloned = stack.clone();

		cloned.push(50);
		cloned.push(60);

		System.out.println(stack);
		System.out.println(cloned);

	}
}