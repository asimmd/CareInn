package com.crm.comcast.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name ="user_name")
	private WebElement userNameTf;
	
	@FindBy(name = "user_password")
	private WebElement passwordTf;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this); 
		
	}

	public WebElement getUserNameTf() {
		return userNameTf;
	}


	public WebElement getPasswordTf() {
		return passwordTf;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//lOG IN TO APPLICATION 
	public void openApp(String username, String password) {
		
		userNameTf.sendKeys(username);
	    passwordTf.sendKeys(password);
	    loginBtn.click(); 
	
	}

	
	
	
	

}
