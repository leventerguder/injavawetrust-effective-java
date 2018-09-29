package chapter03.item14.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {

		short areaCode1 = 90;
		short prefix1 = 216;
		short lineNum1 = 200;

		short areaCode2 = 90;
		short prefix2 = 216;
		short lineNum2 = 100;

		short areaCode3 = 90;
		short prefix3 = 212;
		short lineNum3 = 500;

		short areaCode4 = 90;
		short prefix4 = 212;
		short lineNum4 = 400;

		short areaCode5 = 80;
		short prefix5 = 500;
		short lineNum5 = 800;

		PhoneNumber pn1 = new PhoneNumber(areaCode1, prefix1, lineNum1);
		PhoneNumber pn2 = new PhoneNumber(areaCode2, prefix2, lineNum2);
		PhoneNumber pn3 = new PhoneNumber(areaCode3, prefix3, lineNum3);
		PhoneNumber pn4 = new PhoneNumber(areaCode4, prefix4, lineNum4);
		PhoneNumber pn5 = new PhoneNumber(areaCode5, prefix5, lineNum5);

		List<PhoneNumber> list = Arrays.asList(pn1, pn2, pn3, pn4, pn5);

		Collections.sort(list);

		list.forEach(System.out::println);

	}
}
