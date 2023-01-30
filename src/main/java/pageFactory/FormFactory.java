package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utility.ElementUtils.*;
import static utility.ExcelReader.excelData;

public class FormFactory {
	
	private By formTitle=By.xpath("//p[text()=' Forms ']");
	private By forms=By.cssSelector("[href='/forms']");
	private By firstName=By.id("firstname");
	private By lastName=By.id("lasttname");
	private By mail=By.id("email");
	private By countrycode=By.xpath("//label[@id=\"countrycode\"]/parent::div/div//div/select");
	private By phone=By.id("Phno");
	private By addline1=By.id("Addl1");
	private By addline2=By.id("Addl2");
	private By fillstate=By.id("state");
	private By post=By.id("postalcode");
	private By countryName=By.xpath("//label[@id=\"country\"]/parent::div/div//div/select");
	private By dob=By.id("Date");
	private By selectGender=By.name("gender");
	private By TandC=By.cssSelector(".checkbox>input");
	private By submit=By.cssSelector("input[class*='button' ]");
	public void selectformslink()
	{
//		scroll();
		scrollToElement(formTitle);
		javaThreadwait();
		click(forms);
		javaThreadwait();
	}
	public void firstName() {
		
		send(firstName, excelData("firstname"));
		javaThreadwait();
	}
	public void lastName()
	{
		send(lastName,excelData("lastName"));
		javaThreadwait();
	}
	public void email()
	{
		clear(mail);javaThreadwait();
		send(mail,excelData("email"));
		javaThreadwait();
	}
	public void countrycode()
	{
		dropDown(countrycode).selectByValue(excelData("countrycode"));javaThreadwait();
	}
	public void phone()
	{
		send(phone,excelData("phone"));javaThreadwait();
	}
	public void addline1()
	{
		send(addline1,excelData("add1"));javaThreadwait();
	}
	public void addline2()
	{
		send(addline2,excelData("add2"));javaThreadwait();
	}
	public void state()
	{
		send(fillstate,excelData("state"));javaThreadwait();
	}
	public void postCode()
	{
		send(post,excelData("postalcode"));javaThreadwait();
	}
	public void country()
	{
		dropDown(countryName).selectByVisibleText(excelData("country"));javaThreadwait();
	}
	public void dob()
	{
		send(dob,excelData("date"));javaThreadwait();
	}
	public void gender()
	{
		for(WebElement e:BYs(selectGender))
		{
			if(e.getText().contains(excelData("gender")))
			{
				click(e);javaThreadwait();
			}
		}
	}
	public void TandC()
	{
		click(TandC);javaThreadwait();
	}
	public void submit()
	{
		javaThreadwait();
		click(submit);javaThreadwait();
	}
}







