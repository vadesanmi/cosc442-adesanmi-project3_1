package edu.towson.cis.cosc442.project3.vendingmachine;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 3/17/16 11:50 PM
 * @author vadesanmi
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	public static final String A_CODE = "A";
	public static final String B_CODE = "B";
	public static final String C_CODE = "C";
	public static final String D_CODE = "D";
	VendingMachine machine1,machine2;
	VendingMachineItem item,item2,item3,item4;
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "D";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "C";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "B";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	
	
	/**
	 * Testing to add multiple items to same slot 
	 */
	@Test(expected = VendingMachineException.class)
	public void addItemTest_2(){
		machine1.addItem(item, "A");
		machine1.addItem(item2,"A");
	}
	
	
	
	
	/**
	 * 
	 * Testing to remove item from vending machine
	 * *
	 */
	@Test
	public void testRemoveItem_4(){
		machine1.addItem(item2, "B");
		machine1.removeItem("B");
		assertNotEquals(item, machine1.equals(item));
		
	}
	
	@Test
	public void testMakePurchase_5(){
		machine1.addItem(item, "A");
		machine1.balance = .50;
		if(item.getPrice() < machine1.balance  && item != null){
			machine1.removeItem("A");
		}
		
		assertFalse(machine1.makePurchase("A"));	
		
	}
	
	
	
	
	
	@Test
	public void testMakePurchase_6(){
		machine1.addItem(null, "C");
		assertTrue(machine1.makePurchase("C") == false);
	}
	
	
	
	
	
	
	/**
	 * Testing to see if a purchase was made
	 */
	@Test
	public void makePurchaseTest(){
		machine1.addItem(item4, "D");
		machine1.balance = 5.00;
		machine1.makePurchase("D");
		assertFalse(machine1.makePurchase("D"));
	}
	
	/**
	 * Null item purchase Test 
	 */
	@Test
	public void makePurchaseTest_1(){
		machine1.addItem(null, "A");
		machine1.balance = 1.00;
		if(item.getPrice() > machine1.balance && item == null){
			assertFalse(machine1.makePurchase("A"));
		}
		
	}
	
	
	
	
	
	
	
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		item = new VendingMachineItem("Reese's",1.00);
		item2 = new VendingMachineItem("Mnm", 1.25);
		item3 = new VendingMachineItem("ihy", 2.00);
		item4 = new VendingMachineItem("Gatorade",3.00);
		
		machine1 = new VendingMachine();
		machine2 = new VendingMachine();
		// add additional set up code here
	}


	

	
	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/17/16 11:50 PM
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
	 * @generatedBy CodePro at 3/17/16 11:50 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}