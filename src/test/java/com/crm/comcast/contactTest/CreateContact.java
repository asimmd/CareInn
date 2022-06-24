package com.crm.comcast.contactTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.ContactInformationPage;
import com.crm.comcast.objectrepository.ContactsPage;
import com.crm.comcast.objectrepository.CreatingNewContactPage;
import com.crm.comcast.objectrepository.HomePage;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;
@Listeners(Generic_Utility.MyListeners.class)
public class CreateContact extends BaseClass {
	
	
	@Test
    public void Contactcreation() throws Throwable {
		

	//Homepage
	HomePage hp = new HomePage(driver);
	hp.clickOnContactModule();
	
	ContactsPage cp = new ContactsPage(driver);
	cp.clickOnAddContactBtn();
	
	Excel_Utility eu = new Excel_Utility();
	String data = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx","Sheet1", 3, 1);
	
	Java_Utility ju = new Java_Utility();
	int num = ju.RandomNum(100);
	String s = data+num;
	CreatingNewContactPage cnc = new CreatingNewContactPage(driver);
	cnc.inputLastNameData(s);
	cnc.clickOnSaveBtn();
	
	ContactInformationPage cig = new ContactInformationPage(driver);
	
	//Contact Information Page
	
	ContactInformationPage cip = new ContactInformationPage(driver);
	String msg = cip.successMessageVerification();
	
	//Message Verification
	Assert.assertEquals(msg.contains(s), true);
	
	}
}
