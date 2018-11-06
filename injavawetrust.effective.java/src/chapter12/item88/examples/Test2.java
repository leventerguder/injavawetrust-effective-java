package chapter12.item88.examples;

import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		MutablePeriod mp = new MutablePeriod();
		Period p = mp.period;
		Date pEnd = mp.end;
		//
		pEnd.setYear(78);
		System.out.println(p);

		pEnd.setYear(69);
		System.out.println(p);
		
	}
}
