package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class RecipeTest extends TestCase{
	

	// may need to use the list for the recipes 
	ArrayList<Recipe> recipeList; 
	
	public void setUp() {
		this.recipeList = new ArrayList<Recipe>();
		Recipe coffee = new Recipe();
		coffee.setName("Coffee");
		coffee.setPrice(5);
		coffee.setAmtCoffee(6);
		coffee.setAmtMilk(2);
		coffee.setAmtSugar(2);
		coffee.setAmtChocolate(0);
		
		Recipe latte = new Recipe();
		latte.setName("Latte");
		latte.setPrice(6);
		latte.setAmtCoffee(5);
		latte.setAmtMilk(3);
		latte.setAmtSugar(1);
		latte.setAmtChocolate(0);
		
		Recipe frap = new Recipe();
		frap.setName("Frap");
		frap.setPrice(6);
		frap.setAmtCoffee(3);
		frap.setAmtMilk(2);
		frap.setAmtSugar(2);
		frap.setAmtChocolate(3);
		
		
		this.recipeList.add(coffee);
		this.recipeList.add(latte);
		this.recipeList.add(frap);
	}
	
	/**
	private String name;
    	private int price;
    private int amtCoffee;
    private int amtMilk;
    private int amtSugar;
    private int amtChocolate;
	*/
	
	
	@Test
	public void testGetName() {
		final String coffeeName = "Coffee";
		final String latteName = "Latte";
		final String frapName = "Frap";
		assertEquals(recipeList.get(0).getName(), coffeeName);
		assertEquals(recipeList.get(1).getName(), latteName);
		assertEquals(recipeList.get(2).getName(), frapName);
	}

	@Test 
	public void testGetAmtChocolate() {
		// we know that the frap has 3 choco
		assertEquals(recipeList.get(2).getAmtChocolate(),3);
	}
	
	@Test 
	public void testGetAmtCoffee() {
		assertEquals(recipeList.get(0).getAmtCoffee(),6);
		assertEquals(recipeList.get(1).getAmtCoffee(),5);
		assertEquals(recipeList.get(2).getAmtCoffee(),3);
	}
	
	@Test 
	public void testSetAmtCoffee() {
		Recipe temp = this.recipeList.get(0);
		int coffeeAmount=0;
		temp.setAmtCoffee(coffeeAmount);
		assertEquals(temp.getAmtCoffee(), coffeeAmount);
		
		// test setting a negative number
		temp.setAmtCoffee(-29);
		// make sure it's caught and actually equals zero
		assertEquals(temp.getAmtCoffee(), 0);

		
		
	}
	
	@Test 
	public void testSetAmtMilk() {
		Recipe temp = this.recipeList.get(0);
		int milkAmount=7;
		temp.setAmtMilk(milkAmount);
		assertEquals(temp.getAmtMilk(), milkAmount);
		

		// test setting a negative number
		temp.setAmtMilk(-29);
		// make sure it's caught and actually equals 0
		assertEquals(temp.getAmtMilk(),0);
		
	}
	
	@Test 
	public void testSetAmtChocolate() {

		Recipe temp = this.recipeList.get(0);
		int chocAmount=8;
		temp.setAmtChocolate(chocAmount);
		assertEquals(temp.getAmtChocolate(), chocAmount);
		
		// test setting a negative number
		temp.setAmtChocolate(-29);
		// make sure it's caught and actually equals 0
		assertEquals(temp.getAmtChocolate(),0);
				
		
	}
	
	@Test 
	public void testSetAmtSugar() {

		Recipe temp = this.recipeList.get(0);
		int sugarAmount=9;
		temp.setAmtSugar(sugarAmount);
		assertEquals(temp.getAmtSugar(), sugarAmount);
		
		// test setting a negative number
		temp.setAmtSugar(-23);
		// make sure it's caught and actually equals 0
		assertEquals(temp.getAmtSugar(),0);
		
	}
	@Test 
	public void testSetPrice() {
		Recipe temp = this.recipeList.get(0);
		int tempPrice=0;
		temp.setPrice(tempPrice);
		assertEquals(temp.getPrice(), tempPrice);
		
		// test setting a negative number
		temp.setPrice(-63);
		// make sure it's caught and actually equals 0
		assertEquals(temp.getPrice(),0);
	}
	
	@Test
	public void testEquals() {
		Recipe temp = new Recipe();
		temp.setName("Coffee");
		temp.setPrice(5);
		temp.setAmtCoffee(6);
		temp.setAmtMilk(2);
		temp.setAmtSugar(2);
		temp.setAmtChocolate(0);
		// now check that they're actually equal 
		assertTrue(temp.equals(recipeList.get(0)));
		
		// now check the other tails 
		Recipe temp2 = new Recipe();
		assertFalse(temp.equals(temp2));
		assertFalse(temp2.equals(temp));
		
		temp2.setName("filler");
		assertFalse(temp2.equals(temp));

		
	}
	
	@Test
	public void testToString() {
		String coffeeString= "Coffee";
		assertEquals(recipeList.get(0).toString(),coffeeString);
	}
}
