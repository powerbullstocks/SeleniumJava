package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Loginpage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends Baseclass
{
	
	@Test
	public void logintest()
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		Loginpage lp = new Loginpage(driver);
		lp.Setusername(username);
		logger.info("entered username");
		lp.Setpassword(password);
		logger.info("Entered password");
		lp.Loginbutton();
//		Syst.out.println("hi");
		try
		{
			if(driver.getTitle().equals("guru99 manager home"))
			{
				Assert.assertTrue(true);
				logger.info("login passed");
				
			}	
			else
			{
				Assert.assertTrue(false);
				driver.switchTo().alert().accept();
				logger.info("login failed");
			}
		}
		catch(Throwable t)
		{
			driver.switchTo().alert().accept();
			System.out.println("Pop triggered and catched");
		}
		finally
		{
			driver.close();
		}
		
		
		
		
	}
	
			

}
