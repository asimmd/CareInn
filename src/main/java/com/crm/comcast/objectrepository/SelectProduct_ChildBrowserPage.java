package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct_ChildBrowserPage {
    
	WebDriver driver;
	@FindBy(xpath="//input[@name=\"search_text\"]")
	private WebElement SearchTf;
	
	@FindBy(xpath="//input[@name=\"search\" ]")
	private WebElement SearchBtn;

	public WebElement getSearchTf() {
		return SearchTf;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	
	public SelectProduct_ChildBrowserPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// PASS DATA INTO SEARCH TEXT FIELD 
	public void inputSearchTfData(String searchdata) {
		
		SearchTf.sendKeys(searchdata);
	}
	
	// CLICK ON SEARCH BUTTON 
	public void clickOnSearchBtn() {
		
		SearchBtn.click();
		
	}
	
	
}
