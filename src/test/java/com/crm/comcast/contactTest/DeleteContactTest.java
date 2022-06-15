package com.crm.comcast.contactTest;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.ContactInformationPage;
import com.crm.comcast.objectrepository.ContactsPage;
import com.crm.comcast.objectrepository.CreatingNewContactPage;
import com.crm.comcast.objectrepository.HomePage;
import com.crm.comcast.objectrepository.LoginPage;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;
@Listeners(Generic_Utility.MyListeners.class)
public class DeleteContactTest extends BaseClass {
	
    @Test
    public void deleteContact() throws Throwable {
		

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
	
    if(msg.contains(s)) {
		
		System.out.println("Contact created successfully,  Passed");
	
    }
    
    else {
		
		System.out.println("Contact not created successfully, Failed");
	}
    
	// Delete Contact  
	cig.clickOnDeleteBtn();
	//Handle alert pop up
	WebDriver_Utility wu = new WebDriver_Utility();
	wu.acceptAlert(driver);
	
	   //SIGNOUT
    
	
	
}
}
