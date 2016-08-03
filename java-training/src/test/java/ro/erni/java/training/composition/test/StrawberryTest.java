package ro.erni.java.training.composition.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.erni.java.training.composition.Strawberry;

public class StrawberryTest {
	private Strawberry capsuna;
	
	@Before
	public void instantiate2StrawberryObject(){
		capsuna = new Strawberry("Dulce ", "Cea mai dulce");
	}
	
	@Test
	public void concatenateMethodForA2StringStrawberryObject() {
		//assertNotNull();
		assertEquals("Dulce Cea mai dulce", capsuna.concatenate());
	}

}
