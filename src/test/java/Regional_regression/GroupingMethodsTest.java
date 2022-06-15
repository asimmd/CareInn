package Regional_regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.comcast.objectrepository.ContactInformationPage;
import com.crm.comcast.objectrepository.ContactsPage;
import com.crm.comcast.objectrepository.CreatingNewContactPage;
import com.crm.comcast.objectrepository.HomePage;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.WebDriver_Utility;

public class GroupingMethodsTest extends BaseClass{
	
	@Test(groups="smoke")
	public void createContact() throws Throwable {
		
		
		// HomePage
		HomePage hp = new HomePage(driver);
		hp.clickOnContactModule();
		
		//Contacts PAge
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnAddContactBtn();
		
		Excel_Utility eu = new Excel_Utility();
		String data = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx","Sheet1", 3, 1);
		
		Java_Utility ju = new Java_Utility();
		int num = ju.RandomNum(100);
		String s = data+num;
		
		//Creating New Contact Page
		CreatingNewContactPage cnc = new CreatingNewContactPage(driver);
		cnc.inputLastNameData(s);
		System.out.println("Entered data:"+"\t"+s);
		cnc.clickOnSaveBtn();
		
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
        
        String filedtext = cip.getLastNameTf().getText();
        System.out.println("contact Name created in Text field:   "+filedtext);
        //SIGNOUT
       
		
		
		
		
	}
	
	@Test(groups="regression")
	public void deleteContact() throws EncryptedDocumentException, IOException {
		

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
