package chapter09.item60;

public class Item60Notes {

	// #####
	// Item 60: Avoid float and double if exact answers are required

	/*
	 * The float and double types are designed primarily for scientific and
	 * engineering calculations. They perform binary floating-point arithmetic,
	 * which was carefully designed to furnish accurate approximations quickly over
	 * a broad range of magnitudes.
	 */
	// The float and double types are particularly ill-suited for monetary
	// calculations

	/*
	 * because it is impossible to represent 0.1 (or any other negative power of
	 * ten) as a float or double exactly
	 */

	/*
	 * The right way to solve this problem is to use BigDecimal, int, or long for
	 * monetary calculations.
	 */

	/*
	 * Note that BigDecimal’s String constructor is used rather than its double
	 * constructor. This is required in order to avoid introducing inaccurate values
	 * into the computation
	 */

	/*
	 * There are, however, two disadvantages to using BigDecimal: it’s a lot less
	 * convenient than using a primitive arithmetic type, and it’s a lot slower. The
	 * latter disadvantage is irrelevant if you’re solving a single short problem,
	 * but the former may annoy you.
	 */

	/*
	 * In summary, don’t use float or double for any calculations that require an
	 * exact answer. Use BigDecimal if you want the system to keep track of the
	 * decimal point and you don’t mind the inconvenience and cost of not using a
	 * primitive type. Using BigDecimal has the added advantage that it gives you
	 * full control over rounding, letting you select from eight rounding modes
	 * whenever an operation that entails rounding is performed. This comes in handy
	 * if you’re performing business calculations with legally mandated rounding
	 * behavior. If performance is of the essence, you don’t mind keeping track of
	 * the decimal point yourself, and the quantities aren’t too big, use int or
	 * long. If the quantities don’t exceed nine decimal digits, you can use int; if
	 * they don’t exceed eighteen digits, you can use long. If the quantities might
	 * exceed eighteen digits, use BigDecimal.
	 */

}
