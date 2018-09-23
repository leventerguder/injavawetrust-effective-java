package chapter02.item08.examples;

public class Test01 {

	public static void main(String[] args) throws Exception {
		
		try(Room room = new Room(10)) {
			System.out.println("Good bye!");
		}
		
	}
}
