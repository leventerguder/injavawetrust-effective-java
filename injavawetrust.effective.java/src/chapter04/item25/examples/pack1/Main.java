package chapter04.item25.examples.pack1;

public class Main {
	public static void main(String[] args) {
		System.out.println(Utensil.NAME + Dessert.NAME);
	}

}

// 
// Two classes defined in one file. Don't ever do this!
class Utensil {
	static final String NAME = "pan";
}

class Dessert {
	static final String NAME = "cake";
}
