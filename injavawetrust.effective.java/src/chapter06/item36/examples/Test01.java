package chapter06.item36.examples;

import java.util.EnumSet;

public class Test01 {

	public static void main(String[] args) {
		TextV2 text = new TextV2();

		text.applyStyles(EnumSet.of(TextV2.Style.BOLD, TextV2.Style.ITALIC));
	}
}
