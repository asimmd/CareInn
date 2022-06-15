package com.crm.comcast.campaignTest;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.CampaignInformationPage;
import com.crm.comcast.objectrepository.CampaignPage;
import com.crm.comcast.objectrepository.CreatingNewCampaign_Page;
import com.crm.comcast.objectrepository.CreatingNewProductPage;
import com.crm.comcast.objectrepository.HomePage;
import com.crm.comcast.objectrepository.LoginPage;
import com.crm.comcast.objectrepository.ProductsPage;
import com.crm.comcast.objectrepository.SelectProduct_ChildBrowserPage;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;

public class CreateCampaignTest extends BaseClass {

        
	
		 
		@Test(groups ="smoke")
		public void createCampaignTest() throws Throwable {
		
		
		// HomePage
		HomePage hp = new HomePage(driver);
		//System.out.println(hp);
		hp.clickOnProductModule();
		ProductsPage pp = new ProductsPage(driver);
		pp.clickOnCreateProductBtn();
		//Product page
		CreatingNewProductPage cnpp = new CreatingNewProductPage(driver);
		Excel_Utility eu = new Excel_Utility();
		 String exceldata= eu.getDatafromExcel("./src/test/resources/TestCase.xlsx","Sheet1", 1, 1);
		    System.out.println(exceldata);
		    Java_Utility ju = new Java_Utility();
		    int num = ju.RandomNum(100);
		    String  data = exceldata+num;
		cnpp.giveProductName(data);
		cnpp.clickOnSaveBtn();
		//Click on campaign link from more menu
		hp.moveToMore();
		hp.clickOnCampaign();
		
		//Campaign page
	    CampaignPage cp = new CampaignPage(driver);
	    cp.clickOnCreateCampaign();
	    
	    // Creating New Campaign Page
	    CreatingNewCampaign_Page  cncp = new CreatingNewCampaign_Page(driver);
	    String exceldata1= eu.getDatafromExcel("./src/test/resources/TestCase.xlsx","Sheet1", 2, 1);
	    System.out.println(exceldata);
	    int num1 = ju.RandomNum(100);
	    String  data1 = exceldata+num;
	    cncp.writeCampaignName(data1);
	    cncp.clickOnsave();
	    //Campaign Information page -  Success Msg 
	    
	    CampaignInformationPage cip = new CampaignInformationPage(driver);
	    String msg = cip.getSuccessMsg();
	    
	    //Success msg verification
	    if(msg.contains(data1)) {
	    	
	    	System.out.println("Campaign added Successfully, Passed");
	    }
	    else {
	    	
	    	System.out.println("Campaign not added successfully, Failed");
	    }
	    
	   
		
		}
}
