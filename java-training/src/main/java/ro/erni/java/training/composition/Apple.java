package ro.erni.java.training.composition;

public class Apple {

	private Fruit fruit = new Fruit();
	//private Fruit marulDiscordiei = new Fruit();
	
	public Apple() {
	}

	// public int peel() {
	// return fruit.peel();
	// }

	public int peel() {

		Peel peel = fruit.peel();
		return peel.getPeelCount();
	}
}
