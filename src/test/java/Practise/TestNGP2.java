package Practise;

import org.testng.annotations.Test;

public class TestNGP2 {


	@Test
	public void createContactTest() {
		System.out.println(10/0);
		System.out.println("Contact created");
	}
	
	@Test(dependsOnMethods="createContactTest")
	
	public void modifyContactTest() {           // if there is dependency between methods
	                                         // and the method fails then the dependent 
	                                           // method will not get executed(skipped)
		System.out.println("Contact modified");
	}
	
	@Test(dependsOnMethods="modifyContactTest")
   public void deleteContactTest() {
		
	System.out.println("Contact deleted   ");
	
	}
	
	@Test(invocationCount=2)
	public void createOrgTest() {
		
		System.out.println("Org created");
		
	}

	
	
	
}
