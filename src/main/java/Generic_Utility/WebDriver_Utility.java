package Generic_Utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

public class WebDriver_Utility {
	
	public void implictlywait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	public void explicitWait(WebDriver driver, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void moveToChildBrowser(WebDriver driver, String pageTitle ) {
		
		   Set<String> allId = driver.getWindowHandles();
		   Iterator<String> itr = allId.iterator();
		   while(itr.hasNext()) {
			   
			  String id = itr.next();
			  driver.switchTo().window(id);
			  String title = driver.getTitle();
			  if(title.contains(pageTitle)) {
				  
				  break;
				  
			  }
			    
		   }
	}
	
	public void selectDropdownbyIndex(WebElement ele,int index) {
		
		Select s= new Select(ele);
		s.getOptions();
	    s.selectByIndex(index);
		
	}
   public void selectDropdownbyText(WebElement ele,String text) {
		
		Select s= new Select(ele);
		s.getOptions();
	    s.selectByVisibleText(text);
		
	}
	
   public void acceptAlert(WebDriver driver) {
	   
	  Alert alert = driver.switchTo().alert();
	   alert.accept();
	   
   }
   
   public String getAlertText(WebDriver driver ) {
	   
	   Alert alert = driver.switchTo().alert();
	   return alert.getText();
	   
   }
   public void acceptConfirmation(WebDriver driver) {
	   
	   Alert alert = driver.switchTo().alert();
	   alert.dismiss();
	   
   }
   public void dismissConfirmation(WebDriver driver) {
	   
	   Alert alert = driver.switchTo().alert();
	   alert.dismiss();
   }
   public void acceptPropmpt(WebDriver driver,String value) {
	   
	   Alert alert = driver.switchTo().alert();
	   alert.sendKeys(value);
	   alert.accept();
	   
   }
   //frames
   /**
    * This method is to switch control to the frames
    * Author Shadab
    */
   public void moveToframe(WebDriver driver, int index) {
	   
	   driver.switchTo().frame(index);
   }
   public void moveToframe(WebDriver driver, String id ) {
	   
	   driver.switchTo().frame(id);
   }
   
  
   public void moveToframe(WebDriver driver, WebElement ele) {
	   
	   driver.switchTo().frame(ele);
 }
   //MouseHovering
   public void dragAnddrop(WebDriver driver,WebElement source, WebElement dest) {
	   
	  Actions ac = new Actions(driver);
	  ac.dragAndDrop(source, dest).perform();;
   }
   
   public void doubleClick(WebDriver driver,WebElement ele) {
	   
	   Actions ac = new Actions(driver);
	   ac.doubleClick(ele).perform();;
   }
   public void contextClick(WebDriver driver,WebElement ele) {
	   
	   Actions ac = new Actions(driver);
	   ac.contextClick(ele).perform();
   }
   public void moveToElement(WebDriver driver,WebElement ele) {
	   
	   Actions ac = new Actions(driver);
	   ac.moveToElement(ele).perform();
   }
   public void maximize(WebDriver driver) {
	 
	 driver.manage().window().maximize();
 }
 
 
   
   
   

}
