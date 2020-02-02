package pageobjects;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	public WebDriver ldriver;
	
	/* constructor for every elements */

	public Homepage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//@FindBy(linkText="Customers")
	@FindBy(xpath="//child::i[@class='fa fa-user']")
	@CacheLookup
	WebElement lnkcustomer;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/List']")
	@CacheLookup
	WebElement lnksubcustomer;
	
	@FindBy(xpath="//i[@class='fa fa-plus-square']")
	@CacheLookup
	WebElement btnaddnew;
	
	// Email in add new customer
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtemail;
	
	// Password in add new customer
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassword;
	
	// First Name
	@FindBy(id="FirstName")
	@CacheLookup
	WebElement txtfirstname;
	
	// Last name
	@FindBy(id="LastName")
	@CacheLookup
	WebElement txtlastname;
	
	// Gender Male
	@FindBy(id="Gender_Male")
	@CacheLookup
	WebElement rdmale;
	
	// Gender Female
	@FindBy(id="Gender_Female")
	@CacheLookup
	WebElement rdfemale;
	
	// DOB
	@FindBy(id="DateOfBirth")
	@CacheLookup
	WebElement txtdob;
	
	// Company Name
	@FindBy(id="Company")
	@CacheLookup
	WebElement txtcompany;
	
	// Tax Exempt
	@FindBy(id="IsTaxExempt")
	@CacheLookup
	WebElement chktaxexempt;
	
	// News Letter
	@FindBy(xpath="//*[text()[contains(.,'(Your store name)')]]")
	@CacheLookup
	WebElement chckstorename;
	
	// Newsletter
	@FindBy(xpath="//*[text()[contains(.,'(Test store 2)')]]")
	@CacheLookup
	WebElement chckteststore2;
	
	// Customer roles
	@FindBy(xpath="//select[@id='SelectedCustomerRoleIds']")
	@CacheLookup
	By drproles;
		
	// Manager of vendor
	@FindBy(id="VendorId")
	@CacheLookup
	By drpvendor;
		
	// Note section
	@FindBy(xpath="//*[contains(text(),'Note: if you have a vendor associated ')]")
	@CacheLookup
	WebElement labelnote;
	
	// Active checkbox
	@FindBy(id="Active")
	@CacheLookup
	WebElement chkactive;
	
	// Admin comment
	@FindBy(id="AdminComment")
	@CacheLookup
	WebElement txtboxadmin;
	
	
	// Save Button
	@FindBy(name="save")
	@CacheLookup
	WebElement btnsave;


	
	public void clickcusttab()
	{
		lnkcustomer.click();
	}
	
	public void clickcustsubtab()
	{
		lnksubcustomer.click();
	}
	
	public void clickaddnewbutton()
	{
		btnaddnew.click();
	}
	
	public void fillemail(String hemail)
	{
		txtemail.clear();
		txtemail.sendKeys(hemail);
		
		/*
		 * txtemail.clear(); txtemail.sendKeys(hemail);
		 */
	}
	
	public void fillpassword(String hpassword)
	{
		txtpassword.clear();
		txtpassword.sendKeys(hpassword);
	}
	
	public void enterflname(String hfname,String hlname)
	{
		txtfirstname.sendKeys(hfname);
		txtlastname.sendKeys(hlname);
	}
	
	
	public void selectgender(String gender) 
	{ 	
		 
		if (gender.equals("male")) { 
			rdmale.click(); 
		} 
		else { 
			rdfemale.click(); 
		}
	  
	}
	 
	public void enterdob(String dob)
	{
		txtdob.sendKeys(dob);
	}
	
	public void entercompanyname(String compname)
	{
		txtcompany.sendKeys(compname);
	}
	
	public void taxexempt()
	{
		chktaxexempt.click();
	}
	
	public void newletter() 
	{
		chckstorename.click();
		chckteststore2.click();
		
	}
	
	public void selectcustroles(String value)
	
	{
		
		
		Select drp = new Select(ldriver.findElement(drproles));
		List <WebElement> elementcount = drp.getOptions();
		System.out.print(elementcount.size());
		
		for(int i=0;i<elementcount.size();i++) {
			String sValue = elementcount.get(i).getText();
			System.out.print(sValue);
			if (sValue == value) {
				drp.selectByValue(sValue);
			}
				
		}
			
		//drp.selectByValue(value);
	}
	
	public void selectmanagevendor(String value2)
	{
		Select drp = new Select (ldriver.findElement(By.id("VendorId")));
		//Select drp = new Select(ldriver.findElement(drpvendor));
		//drp.selectByValue(value2);
		drp.selectByVisibleText(value2);
		//drp.selectByValue(value2);
		// new Select(ldriver.findElement(drpvendor)).selectByVisibleText(value2);
	}
	
	public void notetext()
	{
		
		Assert.assertTrue(labelnote.isDisplayed());
		//labelnote.isDisplayed();
	}
	
	public void checkactive()
	{
		chkactive.click();
	}
	
	public void admincontent()
	{
		txtboxadmin.sendKeys("this is for testing");
	}
	
	public void savebutton()
	{
		btnsave.click();
	}
	
}
