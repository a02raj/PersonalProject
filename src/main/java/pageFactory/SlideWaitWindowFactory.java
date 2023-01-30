package pageFactory;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;

import static utility.Constants.*;
import static utility.ElementUtils.*;

public class SlideWaitWindowFactory {
	
	//Slide..............................
	private By sliderTitle=By.xpath("//p[text()=' Slider ']");
	private By sliderau5=By.cssSelector("[href*='/slider']");
	private By slider=By.id("generate");
	private By countries=By.xpath("//button[text()='Get Countries']");
	private By allCountry=By.cssSelector("p.has-text-primary-light");

	public void clickSlidelink()
	{
		zoom(1.0);
		scrollToElement(sliderTitle);
		javaThreadwait();
		click(sliderau5);
		javaThreadwait();
	}
	 
	public void rangeOfSlider()
	{
		String x=BY(slider).getAttribute("max");
		int z=Integer.parseInt(x);
		System.out.println("The maximum range of slider is : "+z);
	}

	public void slideto(int k)
	{
		javaThreadwait();
		slide(slider, k);javaThreadwait();
	}

	public void clickGetCountries()
	{
		click(countries);javaThreadwait();
	}

	public void getAllCountries()
	{
		String countries=BY(allCountry).getText().toString();
		String country[]=countries.split(" - ");
		int i=0;
		for(String count: country)
		{
			i++;
		System.out.println(i+". "+count);
		}
	}
//Wait............................................
	private By waitTitle=By.xpath("//p[text()=' Waits ']");
	private By timeout=By.cssSelector("[href*='/waits']");
	private By timeout2=By.linkText("Timeout");
	public void selectWait()
	{
		try {
		scrollToElement(waitTitle);
		javaThreadwait();
		click(timeout2);
		javaThreadwait();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void waitandgettext()
	{
		StopWatch s=new StopWatch();
		s.start();
		waitUntilVisiblityofAlert();
		s.stop();
		long z=s.getStartTime();
		long y=s.getStopTime();
		long k=y-z;
		System.out.println("Total time waited to alert to be present is : "+ k);
		
	}
	public void getMessage()
	{javaThreadwait();
		System.out.println(alert().getText());
	}
	public void acceptAlert()
	{javaThreadwait();
		alert().accept();
	}
//Window.......................................................
	private By windowTitle=By.xpath("//p[text()=' Window ']");
	private By tabs=By.cssSelector("[href*='/windows']");
	private By homePage=By.id("home");
	private By multiPage=By.id("multi");
private By homebtn=By.cssSelector("routerlink='/'");
	public void selectwindow()
	{
		scrollToElement(windowTitle);
		click(tabs);
	}
	public void homePagebtn()
	{
		click(homePage);javaThreadwait();
	}
	public void multiPagebtn()
	{
		click(multiPage);javaThreadwait();
	}
	public void homeBtn()
	{
		click(homebtn);javaThreadwait();
	}
	public void parentWindow()
	{
		 parentWindow=getWindow();
		 System.out.println("Title of parent window "+title());
		 System.out.println("Current url of parent window "+url());

	}
	public void newWindow()
	{
		 newWindow=getWindow();
	}
	public void AllWindows()
	{
		int i=0;
		setwindows=getWindows();
		for(String handles:setwindows)
		{
			i++;
			if (parentWindow.equals(handles))
			{
				System.out.println("\t Windows ID "+i+" :\t"+handles);
				System.out.println("\t URL : \t\t"+url());
			//	System.out.println("\t Title : \t\t"+title());
				titles.add(title());
			}
			else
			{
				switchWindow(handles);javaThreadwait();
				System.out.println("\t Windows ID "+i+" :\t"+handles);
				System.out.println("\t URL : \t\t"+url());
			//	System.out.println("\t Title : \t\t"+title());
				titles.add(title());

			}
		}
	}
	public void printTitles()
	{
		for(String str:titles)
		{
			System.out.println("The all window titles are : "+str);
		}
	}
	public void closeAll()
	{
		javaThreadwait();
		for(String handles:setwindows)
		{
			close();
		}
		
		
	}
}
