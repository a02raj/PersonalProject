package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.Color;
import java.util.ArrayList;
import java.util.List;

import static utility.ElementUtils.*;
import static utility.Constants.*;

public class InputButtonSelectRadioFactory {

	
	//link of title.............
	private By featureLinks =By.xpath("//footer/a[text()='Edit']");
	private By inputEdit =By.cssSelector("a[href*='/edit']");
	private By allTitleLink=By.xpath("//header/p[text()=' Input ']/parent::header/following-sibling::footer/a");
	//	 Background: Common Steps of all scenarios
	

	//Scenario: Work space input features
		private By fullName=By.id("fullName");
		private By append =By.id("join");
		private By insideText =By.id("getMe");
		private By clearMe =By.id("clearMe");	
		private By noEdit =By.id("noEdit");
		private By dontwrite =By.id("dontwrite");

//		And get the input element title and print

	public void selecteditLink()
	{
		BY(allTitleLink).click();
		implicitwait();
	}
//		And enter full name
	public void enterFullName(String text)
	{
		send(fullName, text);
		implicitwait();
	}
//		And enter the text inside append text
	public void apendText(String text)
	{
		send(append, text);
		implicitwait();

	}
//		And get the text inside the text box
	public void gettext()
	{
		System.out.println("Text inside text box is : "+getText(insideText));
		implicitwait();
	}
//		And clear the text from clear the text
	public void cleartext()
	{
		String str=getText(clearMe);
		BY(clearMe).clear();
		implicitwait();
		System.out.println("Text inside text box is : "+str);
		javaThreadwait();
	}
//		And confirm edit field is disabled
	public boolean confirmDisable()
	{
		return BY(noEdit).isEnabled();
	}
//		And confirm text is read only
	public void readonly()
	{
		System.out.println("Text inside the text box is \""+getText(dontwrite)+"\"");
		System.out.println("Text area is enabled :"+BY(dontwrite).isEnabled());

		try {
			send(dontwrite,"New text");
			javaThreadwait();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}


	}
		
//		Scenario: Workspace Button feature
private By buttonClick =By.cssSelector("a[href*='/buttons']");
	private By goToHome=By.id("home");
		private By findLocation=By.id("position");
		private By whatsColor=By.id("color");
		private By property=By.id("property");
		private By isDisabled=By.xpath("//button[@class='button is-info']");
		private By holdButton=By.xpath("//h2/ancestor::button");
//		#And select the button title element click
	public void selectButtons()
	{
		//click button
		BY(buttonClick).click();
		javaThreadwait();

	}
//		#And click on goto home and navigate back to current page
	public void goToHome()
	{
		//go  to home
		BY(goToHome).click();
		javaThreadwait();
		driver.navigate().back();
	}
//		#And get the x and y co-ordinates of the button
	public void getCoOrdinates()
	{
		System.out.println("The x co-ordinate of button is : "+coordinate(findLocation).getX());
		System.out.println("The y co-ordinate of button is : "+coordinate(findLocation).getY());
	}
//		#And Find the color of the button
	public void buttonColor()
	{
		WebElement t = BY(whatsColor);
		//obtain color in rgba
		String s = t.getCssValue("color");
		// convert rgba to hex
		String c = Color.fromString(s).asHex();
		String z = String.valueOf(Color.fromString(s).getColor());
		System.out.println("Color is :" + z);
		System.out.println("Hex code for color:" + c);

	}
//		#And Find the height & width of the button
	public void buttonDimension()
	{
		System.out.println("The height of Webelement is :"+dimension(property).height);
		System.out.println("The width of Webelement is :"+dimension(property).width);
	}
//		#And Confirm button is disabled
	public void buttonDisabled()
	{
		try {
			Assert.assertTrue(BY(isDisabled).isEnabled());
			System.out.println("The button is Enabled");
		}catch(AssertionError e)
		{
			System.out.println(e.getMessage());
			System.out.println("The button is Disabled");
		}


	}

//		#And Click and Hold Button and get the button output
	public void clickAndHold()
	{
		System.out.println("Before clicking button :"+BY(holdButton).getText());
		clickByclickAndHold(holdButton);
		System.out.println("After clicking button :"+BY(holdButton).getText());
	}
		
//		#Scenario: Workspace dropdown feature
private By selectDropdown =By.cssSelector("a[href*='/dropdowns']");
		 private By fruits =By.id("fruits");
		// private By successNotification=By.
		 private By superHero=By.id("superheros");
		 private By languages=By.id("lang");
		 private By country=By.id("country");
//		#And select the Select title element click drop-down
	public void selectDropdown()
	{

		BY(selectDropdown).click();
		javaThreadwait();
	}
//		#And Select the apple using visible text and print the output
	public void selectfruit(int value)
	{
		dropDown(fruits).selectByIndex(value);
		String fruit=dropDown(fruits).getFirstSelectedOption().getText();
		System.out.println("The selected option is : "+fruit);
		javaThreadwait();
	}
//		#And Select your super heros and prints the output
	public void selectSuperHeros(String values)
	{
		System.out.println("Th dropdown is multiple select :"+dropDown(superHero).isMultiple());
		dropDown(superHero).selectByValue(values);
		String hero=dropDown(superHero).getFirstSelectedOption().getText();
		System.out.println("The selected option is : "+hero);
		javaThreadwait();
	}
//		#And Select the last programming language and print all the options
	public void selectLanguages(String value)
	{
		dropDown(languages).selectByValue(value);
		List<WebElement> options=dropDown(languages).getOptions();
		System.out.println("The all programming languages are: ");
		for(WebElement ele:options)
		{
			System.out.println(ele.getText()+",");
		}
	}
//		#And Select India using value & print the selected value
	public void selectCountry(String value)
	{
		dropDown(country).selectByValue(value);
		String count=dropDown(country).getFirstSelectedOption().getText();
		System.out.println("The selected option is : "+count);
	}
		
//		#Scenario: Workspace radio feature
private By radioToggle =By.cssSelector("a[href*='/radio']");
private By selectAny=By.name("answer");
private By confRadio=By.name("one");
private By bugRadio=By.name("bug");
private By noBugfRadio=By.name("nobug");
private By selectedRadio=By.name("foobar");
private By disabledRadio=By.name("plan");

		 private By label=By.xpath("//div[@class=\"field\"]/label");
		 private By radioButton=By.xpath("//label[contains(text(),'Select')]/parent::div/div/label/input");
		 
//		#And select the radio title element click toggle
		 public void selectToggle()
		 {
			click(radioToggle);
		 }		 
//		#And select any one from yes or no
		 public void selectNo()
		 {
			 for(WebElement ele:BYs(selectAny))
			 {
				 if(ele.getText()==" No ")
					 ele.click();
			 }
		 }
//		#And Cofirm you can select only one radio button
		 public void verifyRadio()
		 {
			 for(WebElement ele:BYs(confRadio))
			 {
				 if(ele.getText()==" Yes ")
				 {
					 ele.click();
					 Assert.assertEquals(ele.isSelected(), true);
				 }
				 else  if(ele.getText()==" No ")
				 {
					 Assert.assertEquals(ele.isSelected(), false);				 
				 }
			 }
			 
		 }
//		#And Find the bug
		 public void findBug()
		 {
			 List<WebElement> elements=new ArrayList<>();
			 elements.add(BY(bugRadio));
			 elements.add(BY(noBugfRadio));
			 for(WebElement ele:elements)
			 {
				ele.click();
			 }
			 int i=0;
			 for(WebElement ele:elements)
			 {
				 if(ele.getText()==" Yes "| ele.getText()==" No " )
				 {
					 Assert.assertEquals(ele.isSelected(), true);
					 i++;
				 }
				 if(i>1)
				 {
					 System.out.println("The both Radio buttons ars selected");
				 }
			 }
		 }
//		#And Find which one is selected
		 public void selectedRadio() {
			 for(WebElement ele:BYs(selectedRadio))
			 {
				 if(ele.isSelected())
				 {
					 System.out.println("The selected radio button is :"+ele.getText());
				 }
				 else
				 {
					 System.out.println("The un-selected radio button is :"+ele.getText());
				 }
			 }
		 }
//		#And Confirm last field is disabled
		 public void confirmRadioDisabled()
		 {
			 for(WebElement ele:BYs(disabledRadio))
			 {
				 if(ele.isEnabled()!=true)
				 {
					 System.out.println("The disabled radio button is  :"+ele.getText());
				 }
				 else
				 {
					 ele.click();
					 System.out.println("The "+ele.getText()+" radio button is selected.");
				 }
			 }
		 }
//		#And Find if the checkbox is selected?
		 private By checkboxselected=By.xpath("//input[@type=\"checkbox\"]");
		 public void confirmSelectedCheckbox()
		 {
			 if(BY(checkboxselected).isSelected())
			 {
				 System.out.println("The checkbox is selected previously");
				 
			 }
			 else
			 {
				 System.out.println("The checkbox is not selected previously");
			 }
		 }
//		#Then Accept the T&C
		 private By acceptTC=By.xpath("//input[@type=\"checkbox\"]");
		 public void acceptTandC()
		 {
			 click(acceptTC);
		 }
	//

//				

}
