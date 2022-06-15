package Generic_Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener{

	public void onTestFailure(ITestResult result) {
		
		EventFiringWebDriver EFW = new EventFiringWebDriver(BaseClass.sdriver);
		File src = EFW.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+result.getName()+".png");
		try {
			
		FileUtils.copyFile(src, dest);
		
		    }
		catch(Exception e){
			
			e.toString();}		
		
	}

	public void onStart(ITestContext context) {
	
		Reporter.log(context.getName()+" Class running", true);
	}

	public void onFinish(ITestContext context) {
		
		Reporter.log(context.getName()+" Class ended", true);
	}
		
	}
	
	
	
	
	


