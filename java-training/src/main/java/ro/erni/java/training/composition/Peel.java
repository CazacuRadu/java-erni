package ro.erni.java.training.composition;

public class Peel {
	private int peelCount;

	public Peel() {

	}

	public Peel(int peelCount) {
		this.peelCount = peelCount;
	}

	public int getPeelCount() {

		return peelCount;
	}
	
	public int peelZaFruit() {

		return peelCount + 1;
	}

}
