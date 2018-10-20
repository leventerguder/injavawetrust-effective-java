package chapter09.item58.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

enum Face {
	ONE, TWO, THREE, FOUR, FIVE, SIX
}

//Same bug, different symptom!
public class Test3 {

	public static void main(String[] args) {
		Collection<Face> faces = EnumSet.allOf(Face.class);
		List<Card> deck = new ArrayList<>();
		for (Iterator<Face> i = faces.iterator(); i.hasNext();)
			for (Iterator<Face> j = faces.iterator(); j.hasNext();)
				System.out.println(i.next() + " " + j.next());

		/*
		 * The program doesn’t throw an exception, but it prints only the six “doubles”
		 * (from “ONE ONE” to “SIX SIX”), instead of the expected thirty-six
		 * combinations.
		 */
	}

}
