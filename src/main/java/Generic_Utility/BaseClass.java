package Generic_Utility;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.crm.comcast.objectrepository.HomePage;
import com.crm.comcast.objectrepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
// Base updated again
public class BaseClass {

	WebDriver_Utility wu = new WebDriver_Utility();
	File_Utility fu = new File_Utility();
	public WebDriver driver = null;
	public static WebDriver sdriver = null;
	
	
	@BeforeSuite(groups={"smoke","Regression"})
	public void beforesuite() {
		
		System.out.println("Application database connection");
		
	}
	
	// type of execution
	@BeforeTest(groups={"smoke","Regression"})
	public void bt() {
		
		
		System.out.println("execute script in parallel mode");
	} 
	
	@Parameters("Browser")
	@BeforeClass(groups={"smoke","Regression"})
	public void bc(String Browser) throws IOException {
		
		Reporter.log(Browser,true);
		//String browser = fu.getPropertyKeyValue("Browser");
		
		if(Browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			else if(Browser.equalsIgnoreCase("firefox")) {
				
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(); 
				
			}
			
			else {
				
			Reporter.log("No browser selected", true);
				
			}
		sdriver = driver;
		driver.manage().window().maximize();
		String url = fu.getPropertyKeyValue("Url");
		driver.get(url);
		wu.implictlywait(driver);
		
	
	}
	
	@BeforeMethod(groups={"smoke","Regression"})
	public void bm() throws Throwable {
		
		String username = fu.getPropertyKeyValue("Username");
		String password = fu.getPropertyKeyValue("pwd");
		
		LoginPage lp = new LoginPage(driver);
		lp.openApp(username, password);
		
	} 
	
	@AfterMethod(groups={"smoke","Regression"})
	public void am() {
		
		HomePage hp = new HomePage(driver);
		hp.signOut();
		
	}
	
	@AfterClass(groups={"smoke","Regression"})
	public void ac() {
		
		driver.close(); //quit()
	} 
	
	@AfterTest(groups={"smoke","Regression"})
	public void at() {
		
		
		System.out.println("parallel execution is completed");
	}
	
	@AfterSuite(groups={"smoke","Regression"})
	public void as() {
		
		
	System.out.println("close the database connection");
		
	}
	
	

}
