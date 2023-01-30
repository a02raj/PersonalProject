package factory;
import static factory.OptionsAndCapabilities.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

//	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser value is: "+ browser);
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			option(options);			
			tldriver.set(new ChromeDriver(options));
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new  FirefoxOptions();
			option(options);
			tldriver.set(new FirefoxDriver());
		}
		else if(browser.equals("internetexplorer"))
		{
			WebDriverManager.iedriver().setup();
			tldriver.set(new InternetExplorerDriver());
		}
		else
		{
			System.out.println("Plese pass the correct browser value : "+browser);
		}
	
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
//	getDriver().manage().window().setSize(dimension);
	return getDriver();
	
	}
	public static synchronized WebDriver getDriver()
	{
		return tldriver.get();
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
