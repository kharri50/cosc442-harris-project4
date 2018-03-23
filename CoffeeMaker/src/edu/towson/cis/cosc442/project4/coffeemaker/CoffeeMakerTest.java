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
			
		}

		public void testAddRecipe1() {
			assertTrue(cm.addRecipe(r1));
		}

		public void testDeleteRecipe1() {
			cm.addRecipe(r1);
			assertTrue(cm.deleteRecipe(r1));
		}

		public void testEditRecipe1() {
			cm.addRecipe(r1);
			Recipe newRecipe = new Recipe();
			newRecipe = r1;
			newRecipe.setAmtSugar(2);
			assertTrue(cm.editRecipe(r1, newRecipe));
		}
}
