package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/22/18 11:38 PM
 * @author kyleharris
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15nullMilk: 15nullSugar: 15nullChocolate: 15null", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getCoffee());
	}
	
	@Test 
	public void testSetAmtCoffee() {
		Inventory temp = new Inventory();
		int coffeeAmount=1;
		temp.setCoffee(coffeeAmount);
		assertEquals(temp.getCoffee(), coffeeAmount);
		
		// test setting a negative number
		temp.setCoffee(-29);
		// make sure it's caught and actually equals zero
		assertEquals(temp.getCoffee(), 0);
	}
	
	@Test 
	public void testSetAmtChocolate() {
		Inventory temp = new Inventory();
		int chocAmount=1;
		temp.setChocolate(chocAmount);
		assertEquals(temp.getChocolate(), chocAmount);
		
		// test setting a negative number
		temp.setChocolate(-29);
		// make sure it's caught and actually equals zero
		assertEquals(temp.getChocolate(), 0);
	}
	
	
	@Test 
	public void testSetAmtSugar() {
		Inventory temp = new Inventory();
		int sugarAmount=1;
		temp.setSugar(sugarAmount);
		assertEquals(temp.getSugar(), sugarAmount);
		
		// test setting a negative number
		temp.setSugar(-29);
		// make sure it's caught and actually equals zero
		assertEquals(temp.getSugar(), 0);
	}
	
	@Test 
	public void testSetAmtMilk() {
		Inventory temp = new Inventory();
		int milkAmount=1;
		temp.setMilk(milkAmount);
		assertEquals(temp.getMilk(), milkAmount);
		
		// test setting a negative number
		temp.setMilk(-29);
		// make sure it's caught and actually equals zero
		assertEquals(temp.getMilk(), 0);
	}
	
	

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory4();
		Recipe r = RecipeFactory.createRecipe2();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory4();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory5();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int chocolate = 1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	

		int hypo = -1;
		fixture.setChocolate(hypo);
		if(fixture.getChocolate()<0) {
			fail("invalid chocolate");
		}
		int hypo_2 = 0;
		fixture.setChocolate(hypo_2);
		assertTrue(fixture.getChocolate()==0);
		
		
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory5();
		int coffee = -1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = 1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory3();
		int milk = -1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory4();
		int milk = 1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int sugar = -1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory2();
		int sugar = 1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory5();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15nullMilk: 15nullSugar: 15nullChocolate: 15null", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	Inventory i;
	
	@Before
	public void setUp()
		throws Exception {
		  i = new Inventory();	
		 }

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
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
	public void testEnoughIngredientsAlt() {
		i.setCoffee(15);
		i.setMilk(15);
    		i.setSugar(15);
    		i.setChocolate(15);
    		
    		
    			Recipe r1 = new Recipe();
			r1.setName("Coffee");
			r1.setPrice(5);
			r1.setAmtCoffee(15);
			r1.setAmtMilk(15);
			r1.setAmtSugar(15);
			r1.setAmtChocolate(15);
			
			assertTrue(i.enoughIngredients(r1));
			
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