package Practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.Excel_Utility;
import Generic_Utility.IConstants;

public class DataProviderwithExcel {
	
	
	@Test(dataProvider="bookTicketFor")
	public void bookTicket(String name,String hall, String movie) {
		
		System.out.println("ticket booked for "+ name +" Hall is "+hall+" movie is "+movie);
		
		
		
		
	}
	@DataProvider
	public Object[][] bookTicketFor() throws Throwable{
		
	    Excel_Utility eu = new Excel_Utility();
	    String name1 = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx", "Sheet1", 1, 1);
	   
	    String name2 = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx", "Sheet1", 1, 0);
	    
	    String name3 = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx", "Sheet1", 0, 1);
	    
	    
	    String name4 = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx", "Sheet1", 1, 1);
		   
	    String name5 = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx", "Sheet1", 1, 0);
	    
	    String name6 = eu.getDatafromExcel("./src/test/resources/TestCase.xlsx", "Sheet1", 0, 1);
	    
	    
	    
		Object[][] name = new Object[2][3];
		
		name[0][0]=name1;
		name[0][1] = name2;
		name[0][2]=name3;
		
		name[1][0]=name4;
		name[1][1] = name5;
		name[1][2]=name6;
		
		return name;
		

	}
	
	
	

}
