package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class CoffeeMakerTest extends TestCase {
	
		private CoffeeMaker cm;
		private Inventory i;
		private Recipe r1;
		
		// make an arraylist of recipes 
		private ArrayList<Recipe> recipeList; 

		public void setUp() {
			// init recipeList 
			recipeList = new ArrayList<Recipe>();
			
			cm = new CoffeeMaker();
			i = cm.checkInventory();

			r1 = new Recipe();
			r1.setName("Coffee");
			r1.setPrice(50);
			r1.setAmtCoffee(6);
			r1.setAmtMilk(1);
			r1.setAmtSugar(1);
			r1.setAmtChocolate(0);
			// this is so annoying 
			recipeList.add(r1);
			
			Recipe r2 = new Recipe();
			r2.setName("Latte");
			r2.setPrice(10);
			r2.setAmtCoffee(2);
			r2.setAmtMilk(1);
			r2.setAmtSugar(1);
			r2.setAmtChocolate(3);
			recipeList.add(r2);
			
			Recipe r3 = new Recipe();
			r3.setName("Frap");
			r3.setPrice(9);
			r3.setAmtCoffee(4);
			r3.setAmtMilk(1);
			r3.setAmtSugar(2);
			r3.setAmtChocolate(4);
			recipeList.add(r3);
			
			Recipe r4 = new Recipe();
			r4.setName("mocha");
			r4.setPrice(6);
			r4.setAmtCoffee(2);
			r4.setAmtMilk(4);
			r4.setAmtSugar(1);
			r4.setAmtChocolate(10);
			recipeList.add(r4);
			
			Recipe r5 = new Recipe();
			r5.setName("vanilla");
			r5.setPrice(4);
			r5.setAmtCoffee(2);
			r5.setAmtMilk(1);
			r5.setAmtSugar(8);
			r5.setAmtChocolate(0);
			recipeList.add(r5);
			
			
			
			
		}
		
		@Test
		public void testAddRecipe() {
			// loop through the recipe list
			for(int i =0;i<recipeList.size(); i++) {
				if(i<4) {
					assertTrue(cm.addRecipe(recipeList.get(i)));
				}else {
					assertFalse(cm.addRecipe(recipeList.get(i)));
				}
			}
			Recipe recipes [] = cm.getRecipes();
			for(int i = 0; i < recipes.length; i++) {
				// check that the addition is correct and that the array is good 
				assertTrue(recipes[3-i].equals(recipeList.get(i)));
			}
			
			
		}
		
		
		@Test
		public void testDeleteRecipe1() {
			cm.addRecipe(r1);
			assertTrue(cm.deleteRecipe(r1));
		}
		
		@Test
		public void testEditRecipe1() {
			cm.addRecipe(r1);
			Recipe newRecipe = new Recipe();
			newRecipe = r1;
			newRecipe.setAmtSugar(2);
			assertTrue(cm.editRecipe(r1, newRecipe));
		}
		
		@Test
		public void testAddInventory() {
			assertTrue(cm.addInventory(1, 1, 2, 4));
			assertFalse(cm.addInventory(-1, 1, 0, 4));
		}
		
		@Test
		public void testMakeCoffee() {
			int money = 0;
			assertTrue(cm.addInventory(10, 10, 10, 10));
			assertEquals(cm.makeCoffee(recipeList.get(0), 60),10);
			// check that this doesn't work 
			assertEquals(cm.makeCoffee(recipeList.get(0), 10),10);
			// make it so that there is a bunch of ingrediatns 

			Recipe r6 = new Recipe();
			r6.setName("vanilla");
			r6.setPrice(1);
			r6.setAmtCoffee(100);
			r6.setAmtMilk(100);
			r6.setAmtSugar(80);
			r6.setAmtChocolate(100);
			assertEquals(cm.makeCoffee(r6, 10),10);
		}
		
		@Test
		public void testGetRecipeForName() {
			testAddRecipe();
			String name = "Coffee";
			System.out.println(recipeList.get(0).toString());
			System.out.println(cm.getRecipeForName(name).toString());
			//assertTrue(cm.getRecipeForName(name).equals(recipeList.get(0)));
		}
		
		
}
