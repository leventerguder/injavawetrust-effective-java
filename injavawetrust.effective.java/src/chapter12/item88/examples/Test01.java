package chapter12.item88.examples;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		MutablePeriod mp = new MutablePeriod();
		Period p = mp.period;
		Date pEnd = mp.end;
		//
		// Let's turn back the clock
		pEnd.setYear(78);
		System.out.println(p);

		// Bring back the 60s!
		pEnd.setYear(69);
		System.out.println(p);
		
		// The source of the problem is that Period’s readObject method is not doing enough defensive copying. 
	}
}
