package com.inetbanking.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import junit.framework.Assert;


public class pophandle  {
	public String URL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
	public String Username = "ramroy007";
	public String password = "test";
	public static WebDriver driver;

	public static Logger logger;

		
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	logger = logger.getLogger("initiating the chrome driver");
	PropertyConfigurator.configure("log4j.properties");
	
	
	}
	
	public void test(String URL)
	{
		driver.get(URL);
		String pagetext = driver.findElement(By.cssSelector("p")).getText();
		System.out.println("The value of the text"+pagetext);
		logger.info(pagetext);
		
		
	}
	
	public void tear()
	{
		driver.close();
	}
	
	public static void main(String[] a)
	{
		pophandle p1 = new pophandle();
		
		p1.setup();
		p1.test(p1.URL);
		p1.tear();
	}
			

}
