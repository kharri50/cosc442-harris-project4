package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class InventoryTest extends TestCase{

	Inventory i;
	
	@Before
	public void setUp() throws Exception {
	  i = new Inventory();
	}
	
	@Test
	public void testSetChocolate() {
		i.setChocolate(15);
		assertEquals(i.getChocolate(),15);
		
		i.setChocolate(-100);
		// make sure that it's zero
		assertEquals(i.getChocolate(),0);
	}
	
	@Test
	public void testSetCoffee() {
		i.setCoffee(15);
		assertEquals(i.getCoffee(),15);
		
		i.setCoffee(-9);
		assertEquals(i.getCoffee(),0);
	}
	
	@Test
	public void testSetMilk() {
		i.setMilk(15);
		assertEquals(i.getMilk(),15);
		i.setMilk(-11);
		assertEquals(i.getMilk(),0);
		}
	
	@Test
	public void testSetSugar() {
		i.setSugar(15);
		assertEquals(i.getSugar(),15);
		i.setSugar(-1);
		assertEquals(i.getSugar(),0);
	}



	@Test
	public void testEnoughIngredients() {
		i.setCoffee(15);
		i.setMilk(15);
    		i.setSugar(15);
    		i.setChocolate(15);
    		
    		
    			Recipe r1 = new Recipe();
			r1.setName("Coffee");
			r1.setPrice(5);
			r1.setAmtCoffee(6);
			r1.setAmtMilk(1);
			r1.setAmtSugar(1);
			r1.setAmtChocolate(0);
			
			assertTrue(i.enoughIngredients(r1));
			
			Recipe r2 = new Recipe();
			r2.setName("Coffee");
			r2.setPrice(51);
			r2.setAmtCoffee(65);
			r2.setAmtMilk(111);
			r2.setAmtSugar(190);
			r2.setAmtChocolate(26);
			assertFalse(i.enoughIngredients(r2));	
			
			
	}
	
	@Test 
	public void testToString() {
		i.setCoffee(15);
		i.setMilk(15);
    		i.setSugar(15);
    		i.setChocolate(15);
    		
    		String expected = "Coffee: " + i.getCoffee() + System.getProperty("line.seperator") +
    				"Milk: " + i.getMilk() + System.getProperty("line.seperator") +
    				"Sugar: " + i.getSugar() + System.getProperty("line.seperator") +
    				"Chocolate: " + i.getChocolate() + System.getProperty("line.seperator");
    		
    		assertEquals(i.toString(), expected);
	}

}
