package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampaign_Page {

	@FindBy(xpath="//input[@name=\"campaignname\"]")
	private WebElement CampaignNameTf;
	
	@FindBy(xpath="//img[@title=\"Select\"]")
	private WebElement SelectProductBtn;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement SaveBtn;
	// CHILD BROWSER
	@FindBy(xpath="//input[@name=\"search_text\"]")
	private WebElement SearchTf;
	
	@FindBy(id="1")
	private WebElement ProductLink;
	

	@FindBy(xpath="//input[@name=\"search\" ]")
	private WebElement SearchBtn;
	
	public CreatingNewCampaign_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	
	// PASS DATA INTO CAMPAIGN NAME TEXT FIELD 
	public void writeCampaignName(String name) {
		
		CampaignNameTf.sendKeys(name);
		
	}
	// CLICK ON SAVE BUTTON
	public void clickOnsave() {
		
		SaveBtn.click();
	}
	
	// CLICK ON PRODUCT BUTTON
	public void clickOnSelectProductBtn() {
		
		SelectProductBtn.click();
		
	}
	
	// PASS DATA INTO SEARCH TEXT FIELD IN CHILD BROWSER PRODUCT PAGE
	public void inputSearchTfData(String searchdata) {
		
		SearchTf.sendKeys(searchdata);
	}
	// CLICK ON SEARCH BUTTON ON CHILD BROWSER
		public void clickOnSearchBtn() {
			
			SearchBtn.click();
			
		}
		
		// CLICK ON PRODUCTLINK IN CHILD BROWSER
		public void clickOnProductlink() {
			
			ProductLink.click();
			
		}
		
		public void clickOnProductLink() {
			
			ProductLink.click();     
			
		}
		
		
	
	
}
