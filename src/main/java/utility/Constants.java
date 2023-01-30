package utility;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.*;


public class Constants{
	public static String homepageTitle ;
	public static String workspaceTitle ;
	public static String expectedtitle="Practice and become pro in test automation";
	
	public static Duration seconds=Duration.ofSeconds(12);
	public static Duration polling=Duration.ofSeconds(3);
	public static int threadWait=3000;

	public static int Default_Time_Seconds=5;
	public static WebDriver driver;
	
	//************Webelement variables********************
	public static WebElement element;
	public static List<WebElement> elements;
	public static WebDriver frames;
//*****************************map**********************************
	public static Map<String, Integer> map;
//******************variables************************
	public static String parentWindow;
	public static String newWindow;
	public static ArrayList<String> windowhandles;
	public static Set<String> setwindows;
	public static List<String> titles;
	
//*******************Dimension of Screen*********************
	public static Dimension dimension= new Dimension(1800, 800);
	
	
//******************form data and all***************************
	private static ConfigReader configReader=new ConfigReader();
	static Properties prop=configReader.init_Prop();
	public static String fName=prop.getProperty("firstName");
	public static String lName=prop.getProperty("lastName");
	public static String email=prop.getProperty("email");
	public static String pasword=prop.getProperty("password");
	public static String countryCode=prop.getProperty("countryCode");
	public static String phNO=prop.getProperty("phoneNo");
	public static String address1=prop.getProperty("add1");
	public static String address2=prop.getProperty("add2");
	public static String state=prop.getProperty("state");
	public static String postCode=prop.getProperty("postCode");
	public static String country=prop.getProperty("country");
	public static String DOB=prop.getProperty("dob");
	public static String gender=prop.getProperty("gender");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
