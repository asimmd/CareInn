package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	
	WebDriver driver;
	@FindBy(xpath="//img[@title=\"Create Organization...\"]")
	private WebElement CreateOrgBtn;
	
	public OrganizationsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	// CLICK ONN CREATE ORGANIZATION BUTTON
	public void clickOnCreateOrganizationBtn() {
		
		CreateOrgBtn.click();
	}

}
