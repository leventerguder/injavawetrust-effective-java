package chapter06.item36.examples;

import java.util.Set;

// // EnumSet - a modern replacement for bit fields
public class TextV2 {
	public enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
	}

	// Any Set could be passed in, but EnumSet is clearly best
	public void applyStyles(Set<Style> styles) {

	}
}