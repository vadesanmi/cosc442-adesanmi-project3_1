package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachineTest {
	public static final String A_CODE = "A";
	public static final String B_CODE = "B";
	public static final String C_CODE = "C";
	public static final String D_CODE = "D";
	VendingMachine machine1,machine2;
	VendingMachineItem item,item2,item3,item4;
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp(){
		
		item = new VendingMachineItem("Reese's",1.00);
		item2 = new VendingMachineItem("Mnm", 1.25);
		item3 = new VendingMachineItem("ihy", 2.00);
		item4 = new VendingMachineItem("Gatorade",3.00);
		
		machine1 = new VendingMachine();
		machine2 = new VendingMachine();
		
	
	}
	
	

	/**
	 * Testing to see if item added & stored in slot.
	 */
	@Test
	public void addItemTest() {
		machine1.addItem(item, "A");
		assertEquals(item, machine1.getItem("A"));
		//assertEquals(item, machine1.equals(item));
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
	 * Testing to add an item to incorrect slot 
	 */
	@Test(expected = VendingMachineException.class)
	public void addItemTest_3(){
		machine1.addItem(item3,"F");
		
		//assertFalse(machine1.machine1.equals("B"));
	}
	/**
	 * 
	 * Testing to remove item from vending machine
	 * *
	 */
	@Test
	public void removeItemTest(){
		machine1.addItem(item2, "B");
		machine1.removeItem("B");
		assertNotEquals(item, machine1.equals(item));
		
	}
	
	/**
	 * Testing to removing an empty item 
	 */
	@Test(expected = VendingMachineException.class)
	public void removeItemTest_2(){
		machine1.addItem(null, "B");
		machine1.removeItem("B");
	}
	/**
	 * Testing to check if correct amount of money is inserted
	 */
	@Test
	public void insertMoneyTest(){
		//machine1.balance = 4.00;
		machine1.insertMoney(4.00);
		assertEquals(4.00, machine1.balance, .01);
	}
	
	/**
	 * Test to check if the balance stored is correct from money inserted
	 */
	@Test
	public void getBalanceTest(){
		machine1.balance = 4.00;
		assertEquals(machine1.balance, machine1.getBalance(), .01);
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
	
	
	@Test
	public void makePurchaseTest_1(){
		machine1.addItem(null, "A");
		machine1.balance = 1.00;
		if(item.getPrice() > machine1.balance && item == null){
			assertFalse(machine1.makePurchase("A"));
		}
		
	}
	
	/**
	 * Testing to see if right amount of change was returned
	 */
	@Test
	public void returnChangeTest(){
		machine1.balance = 4.00;
		machine1.addItem(item3, "C");
		machine1.makePurchase("C");
		assertEquals(2.00, machine1.returnChange(), .01);
		
	}
	
	/**
	 * Testing to see money inserted is less than a dollar 
	 */
	@Test(expected = VendingMachineException.class)
	public void insertMoney_2(){
		machine1.insertMoney(-1);
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown(){
		machine1 = null;
		machine2 = null;
	}

}
