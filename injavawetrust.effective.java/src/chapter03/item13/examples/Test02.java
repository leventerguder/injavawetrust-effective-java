package chapter03.item13.examples;

public class Test02 {

	public static void main(String[] args) {
		StackImpl stack = new StackImpl();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		StackImpl cloned = stack.clone();

		cloned.push(50);
		cloned.push(60);

		System.out.println(stack);
		System.out.println(cloned);

	}
}

//if the clone method merely returns super.clone() 
//the resulting Stack instance will have the correct value in its size field
//but its elements field will refer to the same array as the original Stack instance.
//Modifying the original will destroy the invariants in the clone and vice versa.