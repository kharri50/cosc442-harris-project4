package edu.towson.cis.cosc442.project4.coffeemaker;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;

import junit.framework.TestCase;


public class CoffeeMakerTest extends TestCase {
	
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	
	ArrayList<Recipe> recipeList; 

	

	public void setUp() {
		
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
		
		
		// add additional set up code here
	}


	
	

	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	
	/**
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}
	
	

	public void testCheckInventory1() {
		assertNotNull("Could not check inventory", cm.checkInventory());
	}
	
	/**
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	public void testAddRecipe2() {
		cm.addRecipe(r1);
		// catches second edge case 
		assertFalse(cm.addRecipe(r1));
	}
	
	/**
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	
	// both methods catch edge cases to kill some mutants
	
	public void testDeleteRecipe1_2() {
		cm.addRecipe(r1);
		// the recipe should be deleted 
		assertTrue(cm.deleteRecipe(r1));
		// okay, this works 
	}
	
	public void testDeleteRecipe2() {
		// catches the edge case that the mutant is throwing me!!!
		assertFalse(cm.deleteRecipe(null));
		// I'm also not sure why this works!
	}
	
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = -1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		Recipe r = RecipeFactory.createRecipe2();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testAddRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		Recipe r = RecipeFactory.createRecipe3();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15nullMilk: 15nullSugar: 15nullChocolate: 15null", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getCoffee());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testDeleteRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		Recipe r = RecipeFactory.createRecipe4();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}
	

	public void testCoffeeAmt_2() {
		cm.addRecipe(r1);
		cm.makeCoffee(r1, 50);
		//xsassertEquals("Incorrect coffee", 9, cm.checkInventory().getCoffee());
	}
	
	public void testMilkAmt_2() {
		cm.addRecipe(r1);
		cm.makeCoffee(r1, 50);
		// doesn't have enough miklk 
		assertEquals(14, cm.checkInventory().getMilk());
	}
	
	public void testSugarAmt_2() {
		cm.addRecipe(r1);
		cm.makeCoffee(r1, 50);
		// bad sugar am
		assertEquals(14, cm.checkInventory().getSugar());
	}
	
	public void testChocolateAmt_2() {
		r1.setAmtChocolate(1);
		cm.addRecipe(r1);
		cm.makeCoffee(r1, 50);
		// bad choco
		assertEquals(14, cm.checkInventory().getChocolate());
	}
	

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		Recipe r = RecipeFactory.createRecipe5();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testDeleteRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testEditRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		Recipe oldRecipe = RecipeFactory.createRecipe2();
		Recipe newRecipe = RecipeFactory.createRecipe3();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testEditRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		Recipe oldRecipe = RecipeFactory.createRecipe4();
		Recipe newRecipe = RecipeFactory.createRecipe5();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testEditRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe2();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe3();
		Recipe newRecipe = RecipeFactory.createRecipe4();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		Recipe oldRecipe = RecipeFactory.createRecipe5();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker2();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker3();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
	}

	/* this test attempts to add and make coffee without inventory */
	public void testInsufficientInventory() {
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(65);
		r1.setAmtCoffee(18);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		cm.addRecipe(r1);
		assertEquals("FAIL.. MADE COFFEE W/O MATERIAL", 50, cm.makeCoffee(r1, 50));
	}
	
	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtCoffee());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getPrice());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getAmtCoffee());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getPrice());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getAmtCoffee());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getPrice());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getAmtCoffee());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getPrice());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getAmtCoffee());
	}
	

	
	

	public void testInventoryAddition() {
		// test addition to inventory 
		cm.addInventory(3, 1, 2, 1);
		// add the recipe 
		cm.addRecipe(this.recipeList.get(1));
		cm.deleteRecipe(this.recipeList.get(1));
		// check that the inventory has been changed.. 
		// there should be 18 units of coffee after the test
		assertEquals("inventory has been changed", 18, cm.checkInventory().getCoffee());
	}
	
	/* methods below test the addition of the sugar, milk and chocolate **/
	
	public void testAddition_Milk() {
		cm.addInventory(3, 5, 1,7);
		// there should be 20 units 
		assertEquals("Inventory changed", 20, cm.checkInventory().getMilk());
	}
	
	public void testAddInventory_Sugar() {
		cm.addInventory(5, 2, 8, 6);
		// there should be 23 units of sugar after the addition
		assertEquals("Inventory changed", 23, cm.checkInventory().getSugar());
	}
	
	public void testAddInventory_Chocolate() {
		cm.addInventory(8, 7, 6, 5);
		// 20 units 
		assertEquals("Inventory changed", 20, cm.checkInventory().getChocolate());
	}
	
	// now we need to test the cases where we can add negative units of inventory...
	// which is bizzaree.. 
	public void testAddNegativeCoffee() {
		// all items have 15 units of inventory to begin with ... so 
		cm.addInventory(-1, 0,0,0);
		// this shouldn't effect anything
		assertEquals(15, cm.checkInventory().getCoffee());
	}
	// repeat a similar process below .. 
	public void testAddNegativeMilk() {
		cm.addInventory(0, -1,0,0);
		assertEquals(15, cm.checkInventory().getMilk());
	}
	
	public void testAddNegativeSugar() {
		cm.addInventory(0, 0,-1,0);
		assertEquals(15, cm.checkInventory().getSugar());
	}
	
	public void testAddNegativeChocolate() {
		cm.addInventory(0,0,0,-1);
		assertEquals(15, cm.checkInventory().getChocolate());
	}
	
	

	
	public void testMakePurchase1() {
		Recipe recipe2 = recipeList.get(1);
		cm.addRecipe(recipe2);
		// this should clear the balance.. 
		assertEquals(0, cm.makeCoffee(recipe2, recipe2.getPrice()));
	}
	
	public void testMakePurchase2() {
		Recipe recipe3 = recipeList.get(2);
		cm.addRecipe(recipe3);
		// this shoudl work
		assertEquals("Price was not returend",0, cm.makeCoffee(recipe3, recipe3.getPrice()));
	}
	

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker4();
		Recipe r = RecipeFactory.createRecipe2();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:38 PM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker5();
		Recipe r = RecipeFactory.createRecipe3();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
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
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
	


	// make an arraylist of recipes 

	
	
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

