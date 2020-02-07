package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Popalert {

	public String URL = "http://demo.guru99.com/v4/";
	public String uname = "ramroy07";
	public String pwd = "test";
	
	public static WebDriver driver;
	public static Logger logger;
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		
		driver = new ChromeDriver();
		logger.getLogger("initiating chrome driver");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	
	public void test(String URL) throws InterruptedException 
	{
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("uname");
		driver.findElement(By.name("password")).sendKeys("pwd");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		try {
		Alert alert = driver.switchTo().alert();
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.alertIsPresent());
		logger.info(alert.getText());
		alert.dismiss();
		}
		catch(Exception e)
		{
			logger.info("no alert present");
		}
		finally
		{
			logger.info("no alert present");
			driver.close();
		}
		
		
	}
	
	public void tear()
	{
		driver.close();
	}
	
	public static void main(String[] args)
	{
		Popalert p1 = new Popalert();
		
		p1.setup();
		try {
			p1.test(p1.URL);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.tear();
	}
}
