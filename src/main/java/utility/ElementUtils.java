package utility;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utility.Constants.*;


public class ElementUtils {
	private static Actions act=new Actions(driver);
	private static JavascriptExecutor js = (JavascriptExecutor) driver;
	private static WebDriverWait wait=new WebDriverWait(driver,seconds);
	private static WebElement elem;
	private static Select se;
	
	public static WebElement BY(By ele)
	{
		try 
		{
			elem=driver.findElement(ele);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found Exception");
		}
		return elem;
	}
	public static List<WebElement> BYs(By ele)
	{
		List<WebElement> elements=driver.findElements(ele);
		
		try 
		{
			elem=driver.findElement(ele);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found Exception");
		}
		return elements;
	}
	//*********************************Click********************************************
	public static void click(By elem)
	{
		BY(elem).click();
	}
	public static void click(WebElement elem)
	{
		elem.click();
	}
	public static void clear(By elem)
	{
		BY(elem).clear();
	}
	public static void clickBymoveTo(By elem)
	{
		javaThreadwait();
		act.moveToElement(BY(elem)).click().perform();
	}
	public static void clickBymoveTo(WebElement elem)
	{
		javaThreadwait();
		act.moveToElement(elem).click().build().perform();
	}
	public static void clickByclickAndHold(By elem)
	{
		javaThreadwait();
		act.clickAndHold(BY(elem)).pause(polling).perform();
	}
	//*******************************Send Key***********************************************
	public static void send(By elem,String text){
		try {
			BY(elem).sendKeys(text);
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
//	*************************Keyboard Keys*********************************
	//zoom feature in browser
	public static void zoom(double ratio)
	{
		js.executeScript("document.body.style.zoom = "+"'"+ratio+"'");	
		
	}
	public static void zoomIn( )
	{		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.ADD).keyUp(Keys.CONTROL).build().perform();
	}
	public static void zoomOut()
	{		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).build().perform();
	}
	//*******************get text method*************************************
public static String title()
{
	return driver.getTitle();
}
public static String url()
{
	return driver.getCurrentUrl();
}

	public static String getText(By elem)
		{
			return BY(elem).getText();
		}
	//*****************************element Dimension************************************************************************
		public static Dimension dimension(By by)
		{
			WebElement elem=BY(by);
			Dimension dim= elem.getSize();
			
			return dim;
		}
		public static Point coordinate(By ele)
		{
			Point p=BY(ele).getLocation();
			return p;
		}
	//*********************************************************************************
	public static void dragAndDrop(By sourcr,By target)
	{
		try {
		javaThreadwait();
		act.clickAndHold(BY(sourcr)).
		moveToElement(BY(target)).build();
		act.perform();
		javaThreadwait();
		}catch(Exception e)
		{
			System.out.println("The Exception is : -"+e.getMessage());
		}
	}
	public static void dragAndDropBycoordinates(By sourcr,int x,int y)
	{
		try {
		javaThreadwait();
		act.dragAndDropBy(BY(sourcr), x, y).build().perform();
		javaThreadwait();
		}catch(Exception e)
		{
			System.out.println("The Exception is : -"+e.getMessage());
		}
	}
	public static void dragAndDropByMethod(By sourcr,By target)
	{
		try {
		act.dragAndDrop(BY(sourcr),BY(target)).build().perform();
		javaThreadwait();
		}catch(Exception e)
		{
			System.out.println("The Exception is : -"+e.getMessage());
		}
	}
	public static void continuousClick(By ele)
	{
		act.keyDown(Keys.CONTROL);
		
		for(WebElement e:BYs(ele))
		{
			javaThreadwait();
			act.moveToElement(e).click().build();
			System.out.println("The selected elements is " +e.getText());
		}	
		act.keyUp(Keys.CONTROL).build().perform();
	}
//**********Slide***************************	
	public static void slide(By ele,int z)
	{
		Assert.assertTrue(BY(ele).isDisplayed());
		int percent=dimension(ele).getWidth()*z/100;
		act.moveToElement(BY(ele))
			   .click()
			   .dragAndDropBy
			     (BY(ele),coordinate(ele).getX() + percent, 0)
			   .build()
			   .perform();
		
	}
//*************************verify*************************	

	public static void verify(String str1,String str2)
	{
		Assert.assertEquals(str1 , str2);

		}
	public static Select select(WebElement element)
	{
		try 
		{
			se=new Select(element);
		}catch(NoSuchElementException e)
		{
			
		}
		return se;
	}

	public static Select  dropDown(By elem)
	{
		
		try 
		{
			se=new Select(BY(elem));
		}catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		return se;
			
		

	}
//***********************Navigation***********************************
public static void back()
{
	driver.navigate().back();
}
public static void forward()
{
	driver.navigate().forward();
}
public static void refresh()
{
	driver.navigate().refresh();
}

//******************Alert********************************	
	public static Alert alert()
	{		
			return driver.switchTo().alert();
	}
//***********************Frame Handling ****************************
	public static WebDriver switchToFrame(String NameOrID)
	{	try {
		frames=driver.switchTo().frame(NameOrID);
	}catch(NoSuchFrameException e)
	{
		System.out.println("Exception "+e.getMessage());
	}
	return frames;
	}
	public static WebDriver switchToFrame(By elem)
	{	
		try {
			frames=driver.switchTo().frame(BY(elem));
		}catch(NoSuchFrameException e)
		{
			System.out.println("Exception "+e.getMessage());
		}
		return frames;
	
	}
	public static WebDriver switchToFrame(int i)
	{	
		try {
			frames=driver.switchTo().frame(i);
		}catch(NoSuchFrameException e)
		{
			System.out.println("Exception "+e.getMessage());
		}
		return frames;
	}
	public static WebDriver switchToParentFrame()
	{	
		try {
			frames=driver.switchTo().parentFrame();
		}catch(NoSuchFrameException e)
		{
			System.out.println("Exception "+e.getMessage());
		}
		return frames;
	}
//***********************Window handling*****************************************************
	public static String tb = Keys.chord(Keys.CONTROL,Keys.ENTER);

	public static String getWindow()
	{
		 return driver.getWindowHandle();
	}
	public static Set<String> getWindows()
	{
		return driver.getWindowHandles();
	}
	public static void switchWindow(String windowhandle)
	{
		driver.switchTo().window(windowhandle);
	}
	public static void SwitchToNewWindow()
	{
		
	}

//*************************Waits****************************************************************
	//thread.sleep its not a selenium provided wait it is provided by java which suspends all the execution of the threads to for further 
	public static void javaThreadwait()
	{
		try
		{
			Thread.sleep(threadWait);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	/**wait are of two types
	 * 1.implicit wait
	 * *****>.timeout()------>driver.manage().timeout()...
	 * 2.Explicit Wait
	 * ********>WebdriverWait()
	 * ********>FluentWait
	 * @return
	 */
	//**********************************Implicit Wait
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Default_Time_Seconds));
	}
	//***********************************Explicit Wait*****************************************
	/////////////////////////WebdriverWait
	
	public static WebElement waitUntilVisiblity(WebElement element) {

		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static Alert waitUntilVisiblityofAlert() {

		return wait.until(ExpectedConditions.alertIsPresent());
	}
	///////////////////////////Fluent Wait
	public static WebElement fluentWait(int seconds,int polingDuration,By element )
	{
		//Declare and initialise a fluent wait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				//Specify the timout of the wait
				.withTimeout(Duration.ofSeconds(seconds))
				//Sepcify polling time
				.pollingEvery(Duration.ofSeconds(polingDuration))
				//Specify what exceptions to ignore
				.ignoring(Exception.class);
				//This is how we specify the condition to wait on.
		return	wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
	}
	
	// ********************************************Move to visible workspace*****************************************
	public static void scrollToElement(By ele)
	{
		try {
			js.executeScript("arguments[0].scrollIntoView(true);", BY(ele));
		}catch(NoSuchSessionException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void scroll()
	{
		js.executeScript("javascript:window.scrollBy(250,350)");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// *****************************************Broken LinkVerification******************************************
	public static void verifyLink(String url) {
		// Sometimes we may face exception "java.net.MalformedURLException". Keep the
		// code in try catch block to continue the broken link analysis
		try {
			// Use URL Class - Create object of the URL Class and pass the urlLink as
			// parameter
			URL link = new URL(url);
			// Create a connection using URL object (i.e., link)
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			// Set the timeout for 2 seconds
			httpConn.setConnectTimeout(2000);
			// connect using connect method
			httpConn.connect();
			// use getResponseCode() to get the response code.
			if (httpConn.getResponseCode() > 400) {
				System.out.println(url + " - " + httpConn.getResponseMessage());
			} else {
				System.out.println(url + " - " + httpConn.getResponseMessage());
			}
		}
		// getResponseCode method returns = IOException - if an error occurred
		// connecting to the server.
		catch (Exception e) {
			// e.printStackTrace();
		}
	}

	// **************************Broken Image Verification***************************************************
	public static void verifyImage(WebElement image) {
		Boolean ImagePresent = (Boolean) js.executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				image);
		if (ImagePresent) {
			System.out.println("The image is present");

		} else {
			System.out.println("The image is broken");
		}
	}	
	
	public static void close()
	{
		driver.close();
	}
}
