package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
		
	WebDriver ldriver;
	public Loginpage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	public void Setusername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	public void Setpassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void Loginbutton()
	{
		btnLogin.click();
	}
}
