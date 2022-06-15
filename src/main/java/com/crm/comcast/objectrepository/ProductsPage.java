package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	@FindBy(xpath="//img[@alt=\"Create Product...\"]")
	private WebElement CreateProductBtn;
	
	public ProductsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickOnCreateProductBtn() {
		
		CreateProductBtn.click();
		
		
	}

}
