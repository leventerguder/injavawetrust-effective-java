package chapter03.item13.examples;

public class Test01 {

	public static void main(String[] args){
		PhoneNumber pn = new PhoneNumber(216, 600, 0000);
		PhoneNumber cloned = pn.clone();

		System.out.println(pn == cloned);
	}
}
