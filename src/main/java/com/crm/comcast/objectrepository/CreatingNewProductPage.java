package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewProductPage {

	
	@FindBy(name="productname")
	private WebElement ProductNameTf;
	
	@FindBy(xpath="//input[@class=\"crmbutton small save\"]")
	private WebElement SaveBtn;
	
	
	public CreatingNewProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void giveProductName(String name) {
		
		ProductNameTf.sendKeys(name);
	}
	
	public void clickOnSaveBtn() {
		
		SaveBtn.click();
	}
	
}
