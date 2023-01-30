package factory;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OptionsAndCapabilities {
	
public static ChromeOptions option(ChromeOptions options)
{
	
	options.merge(desiredcapabilities());
	options.addArguments( 
//			"--verbose",
//			   "--headless"
//			   "--disable-web-security",
//			   "--ignore-certificate-errors",
//			   "--allow-running-insecure-content",
//			   "--allow-insecure-localhost",
//			   "--no-sandbox",
//			   "--disable-gpu"
			"disable-blink-features=AutomationControlled"
			   );
	
	return options;
}
public static FirefoxOptions option(FirefoxOptions options)
{
	
	options.merge(desiredcapabilities());
	options.addArguments( "--verbose",
			   "--headless",
			   "--disable-web-security",
			   "--ignore-certificate-errors",
			   "--allow-running-insecure-content",
			   "--allow-insecure-localhost",
			   "--no-sandbox",
			   "--disable-gpu",
			   "disable-blink-features=AutomationControlled"   
			);
	
	return options;
}
	
public static DesiredCapabilities desiredcapabilities()
{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.acceptInsecureCerts();
return capabilities;
}


}
