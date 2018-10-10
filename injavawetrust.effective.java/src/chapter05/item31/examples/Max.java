package chapter05.item31.examples;

import java.util.List;

public class Max {

	public static <T extends Comparable<T>> T max(List<T> list) {

		// max
		return null;
	}

	// It produces T instances, so we change the type from List<T> to List<? extends
	// T>.

	// Comparables are always consumers, so you should generally use Comparable<?
	// super T> in preference to Comparable<T>.
	public static <T extends Comparable<? super T>> T maxV2(List<? extends T> list) {
		// max
		return null;
	}
}
