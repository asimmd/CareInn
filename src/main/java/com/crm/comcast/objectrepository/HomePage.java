package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.WebDriver_Utility;

public class HomePage extends WebDriver_Utility {
	
	WebDriver driver;
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreMenu;
	
    @FindBy(name="Campaigns")
    private WebElement campaignLink;
    
   
    @FindBy(xpath="//a[text()='Organizations']")
    private WebElement orgModule;
    
    @FindBy(linkText="Contacts")
    private WebElement contactModule;
    
    @FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
    private WebElement administratorLink;
    
    @FindBy(linkText="Sign Out")
    private WebElement SignOut;
    
    @FindBy(linkText="Products")
    private WebElement ProductModule;
    
    public HomePage(WebDriver driver) {
    	
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
    }


	
	
	// SIGN OUT
	public void signOut() {
		
		moveToElement(driver,administratorLink);
		SignOut.click();
		
		
	}
	
	// CLICK ON CONTACTS MODULE
	public void clickOnContactModule() {
		
		contactModule.click();
		
	}
	
	// click on Campaign
	  public void moveToMore() {
		    
	    	moveToElement(driver, moreMenu);
	    
	   	
	    }
	// CLICK ON ORGANIZATIONAL MODULE
	  public void clickOnOrgModule() {
		  
		  orgModule.click();
		  
	  }
	  
	  // CLICK ON PRODUCT MODULE
	  public void clickOnProductModule() {
		  
		  ProductModule.click();
		  
	  }
	  // CLCIK ON CAMPAIGN IN MORE MENU
	  public void clickOnCampaign() {
		  
		  campaignLink.click();
	  }
	

}
