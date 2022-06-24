package Practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossPlatform {
	
	
	@Test()
	public void m1() throws Throwable
	{
		
		URL url = new URL(" http://192.168.60.1:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		RemoteWebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://www.amazon.in/");
		
		
		
	}

}
