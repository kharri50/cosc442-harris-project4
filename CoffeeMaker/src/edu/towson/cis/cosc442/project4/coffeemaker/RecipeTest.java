package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 3/22/18 11:37 PM
 * @author kyleharris
 * @version $Revision: 1.0 $
 */
public class RecipeTest {
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe2();
		Recipe r = RecipeFactory.createRecipe3();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe2();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe3();
		Recipe r = RecipeFactory.createRecipe4();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getAmtChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testGetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtChocolate();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testGetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe4();

		int result = fixture.getAmtCoffee();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testGetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe3();

		int result = fixture.getAmtMilk();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testGetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe2();

		int result = fixture.getAmtSugar();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe3();

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */


	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe3();
		int amtChocolate = 1;

		fixture.setAmtChocolate(amtChocolate);

		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = -1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe2();
		int amtCoffee = 1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe4();
		int amtMilk = -1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = 1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe3();
		int amtSugar = -1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe4();
		int amtSugar = 1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe2();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe4();
		int price = -1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.toString();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		this.recipeList = new ArrayList<Recipe>();
		Recipe coffee = new Recipe();
		coffee.setName("Coffee");
		coffee.setPrice(5);
		coffee.setAmtCoffee(6);
		coffee.setAmtMilk(2);
		coffee.setAmtSugar(2);
		coffee.setAmtChocolate(1);
		
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
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 11:37 PM
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
	 * @generatedBy CodePro at 3/22/18 11:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
	
	
	
	// may need to use the list for the recipes 
		ArrayList<Recipe> recipeList; 
		
		Recipe r;
		
		
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
			int coffeeAmount=1;
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
			assertTrue(temp.getAmtChocolate()>0);
			assertEquals(temp.getAmtChocolate(), chocAmount);
		
			// test setting a negative number
			temp.setAmtChocolate(-29);
			// make sure it's caught and actually equals 0
			assertEquals(temp.getAmtChocolate(),0);
			
			temp.setAmtChocolate(-1);
			assertTrue(temp.getAmtChocolate()>=0);
			
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
			int tempPrice=3;
			temp.setPrice(tempPrice);
			assertEquals(temp.getPrice(), tempPrice);
			
			// test setting a negative number
			temp.setPrice(-63);
			// make sure it's caught and actually equals 0
			assertEquals(temp.getPrice(),0);
			
			assertTrue(temp.getPrice()!=-63);
			
			Recipe temp2 = this.recipeList.get(0);
			int tempPrice2=-66;
			temp2.setPrice(tempPrice2);
			if(temp2.getPrice() < 0) {
				fail("invalid price");
			}
			// try to set the price = 0
			
		}
		
		@Test 
		public void testNegPrice(){
			Recipe temp2 = this.recipeList.get(0);
			int tempPrice=-66;
			temp2.setPrice(tempPrice);
			if(temp2.getPrice() < 0) {
				fail("invalid price");
			}
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
		
		public void testSetAmtChocolate_1(){
			Recipe r1 = new Recipe();
			r1.setAmtChocolate(-1);
			assertEquals(r1.getAmtChocolate(), 0);
		}

}