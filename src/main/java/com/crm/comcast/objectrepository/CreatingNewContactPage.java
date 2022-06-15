package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement LastNameTf;
	
	@FindBy(xpath="(//input[@name=\"button\"])[3]")
	private WebElement SaveBtn;

	public WebElement getLastNameTf() {
		return LastNameTf;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	
	public CreatingNewContactPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	// PASS DATA IN LAST NAME TEXT FIELD 
	public void inputLastNameData(String name) {
		
		LastNameTf.sendKeys(name);
		
	}
	
	// CLICK ON SAVE BUTTON
	public void clickOnSaveBtn() {
		
		SaveBtn.click();
		
	}
	

}
