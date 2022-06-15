package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	
	
	@FindBy(xpath="(//input[@name=\"Edit\"])[1]")
	private WebElement EditBtn;
	
	@FindBy(name="Delete")
	private WebElement DeleteBtn;
	
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement SuccessMessage;

	@FindBy(id="mouseArea_Last Name")
	private WebElement LastNameTf;
	
	public ContactInformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//CLICK ON EDIT BUTTON
	public void clickOnEditBtn() {
		
		EditBtn.click();
		
	}
	
	// CLICK ON DELETE BUTTON
	public void clickOnDeleteBtn() {
		
		DeleteBtn.click();
	}
	// SUCCESS MESSAGE VERIFICATION
	public String successMessageVerification() {
		
		return SuccessMessage.getText();
		
	}

	public WebElement getLastNameTf() {
		return LastNameTf;
	}
	
	
	
	

}
