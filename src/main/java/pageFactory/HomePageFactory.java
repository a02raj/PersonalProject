package pageFactory;
import static utility.ElementUtils.*;

import org.junit.Assert;
import org.openqa.selenium.By;



public class HomePageFactory {
	private By signupLink=By.cssSelector("a[href*='/signup']");
	private By loginLink=By.cssSelector("a[href*='/signin']");
	private By username=By.id("name");
	private By password=By.name("password");
	private By email=By.name("email");
	private By agree=By.id("agree");
	private By signUpbutton=By.tagName("button");
	private By loginButton=By.xpath("//button[text()='LOGIN']");
	private By logoutlink=By.xpath("//a[text()='Sign out']");
public void signin()
{
	click(signupLink);javaThreadwait();
}
public void login()
{
	click(loginLink);javaThreadwait();
}
public void enterUserName(String  name)
{
	send(username,name);javaThreadwait();
}
public void enterEmail(String mailId)
{
	send(email,mailId);javaThreadwait();
}
public void enterPassword(String pass)
{
	send(password,pass);javaThreadwait();
}
public void TandC()
{
	click(agree);javaThreadwait();
}
public void signup()
{
	click(signUpbutton);javaThreadwait();
}
public void loginButton()
{
	click(loginButton);javaThreadwait();
}
public void signout()
{
	click(logoutlink);
	javaThreadwait();
}
public void verifysignin() {
	if(BY(loginLink).isSelected())
	{
		System.out.println("The user is not loggedin");
	}
	else
	{
		System.out.println("The user is loggedin");
	
	}
	javaThreadwait();
}
public void logout()
{
	click(logoutlink);
	javaThreadwait();
}
}
