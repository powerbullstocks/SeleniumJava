package com.inetbanking.testCases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class Baseclass {
	
	public String baseURL = "http://demo.guru99.com/v4/";
	public String username = "mngr164225";
	public String password = "jahetAP";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		logger = logger.getLogger("Ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
	
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
			

}