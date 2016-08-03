package ro.erni.java.training.composition.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.erni.java.training.composition.Apple;

public class AppleTest {

	
	@Test
	//public void peelFunctionTest() {
	public void peelMethodForNewAppleTest() {
		Apple mar = new  Apple();
		//assertEquals("The result expected is 1 because of the return new Peel(1) and 'Peeling is appealing.' is printed out" , 1 , mar.peel());
		assertEquals("Expected 1: peel() method returns a new Peel Object initiated with 1" , 1 , mar.peel());
	}
	
	//@Test
	//public void peelMethodForAThirdAppleTest() {
	//public void peelFunctionTest() {
	//	Apple mar = new  Apple(3);
	//	assertEquals("The result expected is 1 because of the return new Peel(1) and 'Peeling is appealing.' is printed out" , 1 , mar.peel());
	//	assertEquals("Expected 1: peel() method returns a new Peel Object initiated with 1" , 1 , mar.peel());
	//}
}
