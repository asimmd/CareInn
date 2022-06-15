package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.ContactsPage;
import com.crm.comcast.objectrepository.CreatingNewContactPage;
import com.crm.comcast.objectrepository.HomePage;

import Generic_Utility.BaseClass;
import Generic_Utility.WebDriver_Utility;

public class CreateContactWithoutLastNameTest extends BaseClass{
	

	@Test(groups="Regression")
	public void createContactTest() throws Throwable {
		
		// HomePage
		HomePage hp = new HomePage(driver);
		hp.clickOnContactModule();
		
		//Contacts PAge
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnAddContactBtn();
		
		
		
		//Creating New Contact Page
		CreatingNewContactPage cnc = new CreatingNewContactPage(driver);

		cnc.clickOnSaveBtn();
		
		// handling popup
		 WebDriver_Utility wu = new WebDriver_Utility();
	     String alertText = wu.getAlertText(driver);
	     wu.acceptAlert(driver);
	     
	  //
       
	
	
	
	
	}
}
