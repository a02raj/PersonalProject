package pageFactory;

import static org.junit.Assume.assumeNoException;
import static utility.Constants.*;
import static utility.ElementUtils.*;
import org.junit.ComparisonFailure;
import org.openqa.selenium.By;

public class WorkspaceFactory {
	//Workspace link
		private By  workSpace=By.id("testing");
		//WorkSpace title
		private By WorkSpacetitle2  =By.cssSelector("h1[class*='title']");
		private By title1 = By.cssSelector("h1[class=\"title is-title is-size-1-desktop is-size-3-mobile is-size-2-tablet has-text-weight-bold has-text-primary\"]");
		private By title2= By.xpath("//h1[@class=\"title is-title is-size-1-desktop is-size-3-mobile is-size-2-tablet has-text-weight-bold has-text-primary\"]");
		private By allTitle= By.xpath("//div/child::h1");
		//div[@_ngcontent-serverapp-c76]/h1
		//Feature input
		private By inputTitle =By.xpath("//p[text()=' Input ']");
//  Given user is on home page
	public void goToHomepage()
	{
		
		driver.get("https://www.letcode.in");
		javaThreadwait();
	}
	//	    And user click on workspace link
	public void clickWorkSpace() {
			
	click(workSpace);
		javaThreadwait();
	}
	//	And get the title and print
	public String getHeading()
	{
		
			return BY(allTitle).getText();
	}
	//Given user verifies work space page
	public void verifyWorkspacepage()
	{
		try{
			verify(workspaceTitle,expectedtitle);
			System.out.println("The user is on workspace page");
		}
		catch (ComparisonFailure e)
		{
			System.out.println("The user didn't went to workspace page");
		}

	}
}
