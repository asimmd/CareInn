package Practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic_Utility.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseInformation_ActivitiesHistory {
	
	public static void main(String[] args) throws Throwable {
		
		File_Utility fu = new File_Utility();
		String browser = fu.getPropertyKeyValue("Browser");
		String Url = fu.getPropertyKeyValue("Url");
		String username = fu.getPropertyKeyValue("Username");
		String password = fu.getPropertyKeyValue("pwd");
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else {
			
			driver = new ChromeDriver();
		}
		
		
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		
		
		
		
	}

}
