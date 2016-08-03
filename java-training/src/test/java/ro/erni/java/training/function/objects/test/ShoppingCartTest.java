package ro.erni.java.training.function.objects.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.erni.java.training.function.objects.Item;
import ro.erni.java.training.function.objects.ShoppingCart;

public class ShoppingCartTest {

	private ShoppingCart shop ;
	
	@Before 
	public void instantiateShoppingCartItems(){
		shop =  new ShoppingCart();
		shop.addItem(new Item("Paine", 15));
		shop.addItem(new Item("Apa", 84));
		shop.addItem(new Item("Dacia", 1100));
	}
	
	@Test
	public void calculateTotalMethodForAShoppingCartObjectWith3NewItemsTest() {
		assertEquals("Expected 1199 : calculate total price for 3 new Item Objects", 1199,  shop.calculateTotal());
	}

}
