package applicationHooks;

import java.util.Properties;
import static utility.Constants.*;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ConfigReader;
import utility.Constants;
import utility.Constants.*;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	
	
	@Before(order=0)
	public void getProperty()
	{
		configReader=new ConfigReader();
		prop = configReader.init_Prop();
	}
	@Before(order=1)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		System.out.println("Browser Launched");
	}
	@Before(order = 2)
	public void restartDriver()
	{
			Constants.driver=driverFactory.getDriver();
	}
	
	@After(order=0)
	public void quitBrowser()
	{
		if(driver!=null) 
		{
			try
			{
				driver.close();
				//driver.quit();// fails in current geckodriver! TODO: Fixme
			} catch (NoSuchMethodError nsme) { // in case quit fails
			} catch (NoSuchSessionException nsse) { // in case close fails
			} catch (SessionNotCreatedException snce) {} // in case close fails
			
		}
		
	}
	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//take screenshot: 
			
			String screenShotName=scenario.getName().replaceAll(" ", "_");
			
			byte [] sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}
	
}
