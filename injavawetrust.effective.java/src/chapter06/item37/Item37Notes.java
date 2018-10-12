package chapter06.item37;

public class Item37Notes {

	// ##### Item 37: Use EnumMap instead of ordinal indexing

	// Now suppose you have an array of plants representing a garden, and you want
	// to list these plants organized by life cycle (annual, perennial, or
	// biennial).

	// there is a very fast Map implementation designed for use with enum keys,
	// known as java.util.EnumMap

	// In summary, it is rarely appropriate to use ordinals to index into arrays:
	// use EnumMap instead. If the relationship you are representing is
	// multidimensional, use EnumMap<..., EnumMap<...>>. This is a special case of
	// the general principle that application programmers should rarely, if ever,
	// use Enum.ordinal (Item 35).
}
