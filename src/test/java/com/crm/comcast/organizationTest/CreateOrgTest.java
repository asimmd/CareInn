package com.crm.comcast.organizationTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.CreatingNewOrganizationPage;
import com.crm.comcast.objectrepository.HomePage;
import com.crm.comcast.objectrepository.LoginPage;
import com.crm.comcast.objectrepository.OrganizationInformationPage;
import com.crm.comcast.objectrepository.OrganizationsPage;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;

public class CreateOrgTest extends BaseClass
{

  @Test
  public void createOrgTest() throws Throwable {
		
		
		// Home Page
		HomePage hp = new HomePage(driver);
		hp.clickOnOrgModule();
		
		OrganizationsPage op = new OrganizationsPage(driver);
		op.clickOnCreateOrganizationBtn();
		
		// Create New Organization Page
		CreatingNewOrganizationPage cnop = new CreatingNewOrganizationPage(driver);
		Excel_Utility eu = new Excel_Utility();
		String value = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx","Sheet1", 2, 1);
		Java_Utility ju = new Java_Utility();
		int num = ju.RandomNum(100);
		String data =value+num;
		cnop.insertOrganizationName(data);
		cnop.clickOnSaveBtn();
		
		//Organization Information page
		Thread.sleep(2000);
		OrganizationInformationPage oip = new OrganizationInformationPage(driver);
		String msg = oip.getSuccessMsg();
		// Verification 
		if(msg.contains(data)) {
			
			System.out.println("Organization created Successfully, Passed");
			
		}
		
		else {
			
			System.out.println("Organization not created Successfully, Failed");
		}
		   //SIGNOUT
        
		
	}


}
