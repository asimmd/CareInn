package Practise;

import org.testng.annotations.Test;

public class TestNGP {
	
	@Test(priority=3)
	public void createContactTest() {
		
		System.out.println("Contact created");
	}                                
	                  // priority can be +ve or negative and the order of execution is in
	@Test(priority=-2) // ascending order. If no priority is given then by default priority is 0
	                  // and order of execution depends on alphabetical order
	public void modifyContactTest() {
	
		System.out.println("Contact modified");
	}
	
	@Test(priority=3)
   public void deleteContactTest() {
		
		System.out.println("Contact deleted ");
	}
	

}
