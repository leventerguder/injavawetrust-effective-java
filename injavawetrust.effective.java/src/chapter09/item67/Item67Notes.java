package chapter09.item67;

public class Item67Notes {

	// #####
	// Item 67: Optimize judiciously

	// There are three aphorisms concerning optimization that everyone should know:

	// More computing sins are committed in the name of efficiency (without
	// necessarily achieving it) than for any other single reason—including blind
	// stupidity.
	// —William A. Wulf [Wulf72]

	// We should forget about small efficiencies, say about 97% of the time:
	// premature optimization is the root of all evil.
	// —Donald E. Knuth [Knuth74]

	// We follow two rules in the matter of optimization:
	// Rule 1. Don’t do it.
	// Rule 2 (for experts only). Don’t do it yet—that is, not until you have a
	// perfectly clear and unoptimized solution.
	// —M. A. Jackson [Jackson75]

	// They tell a deep truth about optimization: it is easy to do more harm than
	// good, especially if you optimize prematurely.

	// Don’t sacrifice sound architectural principles for performance.

	// Strive to write good programs rather than fast ones.
	// If a good program is not fast enough, its architecture will allow it to be
	// optimized. Good programs embody the principle of information hiding: where
	// possible, they localize design decisions within individual components, so
	// individual decisions can be changed without affecting the remainder of the
	// system (Item 15).

	// Strive to avoid design decisions that limit performance.
	// The components of a design that are most difficult to change after the fact
	// are those specifying interactions between components and with the outside
	// world. Chief among these design components are APIs, wire-level protocols,
	// and persistent data formats. Not only are these design components difficult
	// or impossible to change after the fact, but all of them can place significant
	// limitations on the performance that a system can ever achieve.

	// Consider the performance consequences of your API design decisions. Making a
	// public type mutable may require a lot of needless defensive copying (Item
	// 50). Similarly, using inheritance in a public class where composition would
	// have been appropriate ties the class forever to its superclass, which can
	// place artificial limits on the performance of the subclass (Item 18). As a
	// final example, using an implementation type rather than an interface in an
	// API ties you to a specific implementation, even though faster implementations
	// may be written in the future (Item 64).

	// Luckily, it is generally the case that good API design is consistent with
	// good performance. It is a very bad idea to warp an API to achieve good
	// performance.

	// Recall that Jackson’s two rules of optimization were “Don’t do it,” and “(for
	// experts only). Don’t do it yet.” He could have added one more: measure
	// performance before and after each attempted optimization.

	// Profiling tools can help you decide where to focus your optimization efforts.
	// These tools give you runtime information, such as roughly how much time each
	// method is consuming and how many times it is invoked.

	// If a quadratic (or worse) algorithm lurks inside your program, no amount of
	// tuning will fix the problem. You must replace the algorithm with one that is
	// more efficient. The more code in the system, the more important it is to use
	// a profiler.

	// To summarize, do not strive to write fast programs—strive to write good ones;
	// speed will follow. But do think about performance while you’re designing
	// systems, especially while you’re designing APIs, wire-level protocols, and
	// persistent data formats. When you’ve finished building the system, measure
	// its performance. If it’s fast enough, you’re done. If not, locate the source
	// of the problem with the aid of a profiler and go to work optimizing the
	// relevant parts of the system. The first step is to examine your choice of
	// algorithms: no amount of low-level optimization can make up for a poor choice
	// of algorithm. Repeat this process as necessary, measuring the performance
	// after every change, until you’re satisfied.
}
