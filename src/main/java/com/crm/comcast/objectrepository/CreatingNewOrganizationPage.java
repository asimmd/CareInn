package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {
	WebDriver driver;
	@FindBy(name="accountname")
	private WebElement OrgName;
	
	@FindBy(xpath="//input[@class=\"crmbutton small save\"]")
	private WebElement SaveBtn;
	
	public CreatingNewOrganizationPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	//CLICK ON SAVE BUTTON
	public void clickOnSaveBtn() {
		SaveBtn.click();
		
	}
	
	// PASS DATA IN ORGANIZATION NAME TEXT FIELD
	public void insertOrganizationName(String name) {
		
		OrgName.sendKeys(name);
	}

	
	
}
