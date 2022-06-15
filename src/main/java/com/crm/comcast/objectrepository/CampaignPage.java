package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage  {
	
	WebDriver driver;
	@FindBy(xpath="//img[@title=\"Create Campaign...\"]")
	private WebElement createCampaignBtn;
	
	public CampaignPage(WebDriver driver) {
		
		this.driver = driver;
	PageFactory.initElements(driver,this);
		
	}

	
	// CLICK ON CREATE CAMPAIGN BUTTON +
	public void clickOnCreateCampaign() {
		
		createCampaignBtn.click();
			
	}
	
	
	
	

}
