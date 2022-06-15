package Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	
	@Test(dataProvider="bookTicketDataProvider")
	public void bookTicket (String src, String dest, int ticket)
	{
		
		System.out.println("source is"+src+" destination is "+dest+" number of tickets is "+ticket);
		
		
	}
	
   @DataProvider
   public Object[][] bookTicketDataProvider(){
	 
	   Object[][] objarr =new Object[3][3];
	   objarr[0][0]="Bangalore";
	   objarr[0][1]="Kolkata";
	   objarr[0][2]=10;	   
	   
	   objarr[1][0]="Mangalore";
	   objarr[1][1]="Kolkata";
	   objarr[1][2]=1;	
	   
	   objarr[2][0]="bhalore";
	   objarr[2][1]="Kolkata";
	   objarr[2][2]=8;	
	   
	   return objarr;
   }

}
