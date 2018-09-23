package chapter02.item08.examples;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {

	private static final Cleaner cleaner = Cleaner.create();
	// resource that requires cleaning.
	// must not refer to ROom

	private static class State implements Runnable {

		private int numJunkPiles;

		private State(int numJunkPiles) {
			this.numJunkPiles = numJunkPiles;
		}

		// invoked by close method or cleaner.
		@Override
		public void run() {
			System.out.println("Cleaning room...");
			numJunkPiles = 0;
		}

	}

	// the state of this room , shared with our cleaneable
	private final State state;

	// our cleanable, cleans the room when it's eligible for gc

	private final Cleaner.Cleanable cleanable;

	public Room(int numJunkPiles) {
		state = new State(numJunkPiles);
		cleanable = cleaner.register(this, state);
	}

	@Override
	public void close() throws Exception {
		cleanable.clean();
	}

}

