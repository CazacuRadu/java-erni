package ro.erni.java.training.composition.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import ro.erni.java.training.composition.Peel;

public class PeelTest {
	private Peel pl; 
	
	@Before
	public void Instantiate3rdPeelObject() {
		pl = new Peel(3);
		
	}
	
	@Test
	public void getPeelCountMethodFor3rdPeelObjectTest() {
		assertTrue("Expected: 3 ", 3 == pl.getPeelCount());
	}
	
	@Test
	public void peelZaFruitMethodFor3rdPeelObjectTest() {
		assertFalse("Expected: 4, but we return true for false (assertFalse)", 5 == pl.peelZaFruit());
	}


}
