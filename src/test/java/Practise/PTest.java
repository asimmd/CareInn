package Practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PTest {
	
	@Parameters({"browser"})
	
	@Test
	public void openApp(String browser) throws MalformedURLException {
		
		URL url = new URL("http:localhost:4444/wd/hub");
		DesiredCapabilities cap = DesiredCapabilities.chrome(); // advanced selenium class 
		cap.setBrowserName(browser);
		
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("http://flipkart.com");
		
	}

}
