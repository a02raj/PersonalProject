package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

import static utility.Constants.elements;
import static utility.ElementUtils.*;
public class AlertFrameWindowFactory {
	//Alert
	private By alertDialog=By.cssSelector("a[href*='/alert']");
	private By simple=By.id("accept");
	private By confirm=By.id("confirm");
	private By prompt=By.id("prompt");
	private By alertMessage=By.id("myName");
	private By modern=By.id("modern");
	public void selectAlert()
	{
		click(alertDialog);
	
	}
	public void simpleAlert()
	{
		click(simple);
	}
	public void acceptAlert()
	{
		try {
		alert().accept();
		}
		catch(NoAlertPresentException e) 
		{System.out.println("NoAlertPresentException is handled");}
		
		}
	public String sentMessage;
	public void sendAlertMessage(String text)
	{
		String sentMessage=text;
		try {
		alert().sendKeys(text);
		}
		catch(NoAlertPresentException e) 
		{System.out.println("NoAlertPresentException is handled");}
		
	}
	public void getMessage()
	{
		try {
		System.out.println("The alert message is "+alert().getText());
		}
		catch(NoAlertPresentException e) 
		{System.out.println("NoAlertPresentException is handled");}
		}
	public void dismissAlert()
	{
		try {		
		alert().dismiss();
		}
		catch(NoAlertPresentException e) 
		{System.out.println("NoAlertPresentException is handled");}
		
	}
	public void outputMessage()
	{
		String message=getText(alertMessage);
		//Assert.assertFalse("Entered message is not present", message.contains(sentMessage));
		System.out.println("Entered message is present" +message);
	}
	public void confirmAlert()
	{
		click(confirm);;
	}
	public void promptAlert()
	{
		click(prompt);
	}
	public void modernAlert()
	{
		click(modern);
	}
	
	//Frame
	//outer frame name,id firstFr
	private By frame=By.cssSelector("a[href*='/frame']");
	private By noOfFrames=By.tagName("iframe");
	private By firstName=By.name("fname");
	private By lastName=By.name("lname");
	private By output =By.cssSelector("p[class*='title has-text-info']");
	//innerFrame class :=has-background-white
		private By email=By.name("email");
		private By frametitle=By.xpath("//p[text()=' Frame ']");
		private By innerFrame=By.cssSelector("[src='innerFrame']");
	public void clickFrame()
	{
		scrollToElement(frametitle);
		javaThreadwait();
		click(frame);
	}
	public void getFrames()
	{
		elements=BYs(noOfFrames);
		System.out.println("Number of frames are "+elements.size());
	}
	public void movetoframe(String name )
	{
		
		switchToFrame(name);
	}
	public void movetoinnerframe(String name )
	{
		System.out.println("Moed to "+name+ " frame.");
		switchToFrame(innerFrame);
	}
	public void enterData(String fname,String lname)
	{
		send(firstName, fname);
		send(lastName, lname);
	}
	public void getOutput()
	{
		System.out.println(getText(output));
	}
	public void enterEmail(String mail)
	{
		send(email, mail);
	}
	public void goTomainFrame()
	{
		switchToParentFrame();
		System.out.println("Switched to main frame ");
	}
	public void goToHome()
	{
		back();
	}
}
