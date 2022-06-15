package Practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic_Utility.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImportingFile_Data {

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
