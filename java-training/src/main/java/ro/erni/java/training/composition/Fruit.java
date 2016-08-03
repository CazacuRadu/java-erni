package ro.erni.java.training.composition;

public class Fruit implements Growing {

	public Fruit() {
	}

	// public int peel() {
	//
	// System.out.println("Peeling is appealing.");
	// return 1;
	// }

	/**
	 * {@inheritDoc}
	 */

	@Override
	public void grow() {
		System.out.println("The fruit is growing");

	}

	/**
	 * {@inheritDoc}
	 */

	@Override
	public void hibernate() {
		System.out.println("The fruit hibernates");

	}

	public Peel peel() {

		System.out.println("Peeling is appealing.");
		return new Peel(1);
	}


}
