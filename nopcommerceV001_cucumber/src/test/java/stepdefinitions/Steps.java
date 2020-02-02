package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.awt.Window;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.logAndReports.LoggerTest;

import cucumber.api.java.en.*;
import pageobjects.Loginpage;
import pageobjects.*;
import pageobjects.Homepage;


public class Steps {
	
	public WebDriver driver;
	public Loginpage lp;
    public Homepage hp; 
//    Logger log = LoggerTest.getLogger();
	@Given("^User Launch Chrome Browser$")
	public void user_Launch_Chrome_Browser() {
	   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   lp= new  Loginpage(driver);
	   hp= new  Homepage(driver);
	   driver.manage().window().maximize();
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url)  {
	   driver.get(url);
	   
	}

	@When("^User enters Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_password_as(String email, String password)  {
		try {
			lp.setUserName(email);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			
		}
		lp.setPassword(password);
		
	  
	}

	@When("^Click on Login$")
	public void click_on_Login() {
		lp.clickLogin();
	  
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) {
	   if(driver.getPageSource().contains("Login was unsuccessful."))
	   {
		driver.close();
		Assert.assertTrue(false);
	   } else {
		   
		   Assert.assertEquals(title, driver.getTitle());
	   }
		   
	   
	}

	@When("^User click on Log out link$")
	public void user_click_on_Log_out_link() throws InterruptedException {
		Thread.sleep(3000);
		lp.clickLogout();
		
	   
	}
	
	@Then("^User click on Customers menu$")
	public void user_click_on_Customers_menu() throws InterruptedException {
		Thread.sleep(3000);
		hp.clickcusttab();
	    
	}

	@Then("^User click on Customers Submenu$")
	public void user_click_on_Customers_Submenu() {
		hp.clickcustsubtab();
	}
	
	@Then("^User click on Add new button$")
	public void user_click_on_Add_new_button() {
	    hp.clickaddnewbutton();
	}
	

	
	
	/*
	 * @When("^User enters customer info \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$"
	 * ) public void user_enters_customer_info(String email,String password,String
	 * fname,String lname,String gender,String dob,String compname,String
	 * value,String value2 ) {
	 * 
	 * hp.fillemail(email); hp.fillpassword(password); hp.enterflname(fname, lname);
	 * hp.selectgender(gender); hp.enterdob(dob); hp.entercompanyname(compname);
	 * hp.taxexempt(); hp.newletter(); //hp.selectcustroles(value);
	 * hp.selectmanagevendor(value2); hp.notetext(); hp.checkactive();
	 * hp.admincontent();
	 * 
	 * 
	 * }
	 */
	 
	
	@When("^User enters customers info$")
	public void user_enters_customers_info() {
		hp.fillemail("smar@gmail.com"); 
		hp.fillpassword("Super"); 
		hp.enterflname("test", "test2");
		hp.selectgender("male"); 
		hp.enterdob("2/8/2000"); 
		hp.entercompanyname("niceshot");
		hp.taxexempt(); 
		hp.newletter(); 
		//hp.selectcustroles(value);
		hp.selectmanagevendor("Vendor 1"); 
		hp.notetext(); 
		hp.checkactive();
		hp.admincontent();
	}
	
	@When("^User click on save button$")
	public void user_click_on_save_button() {
	    hp.savebutton();
	}

	
	@Then("^Page should contain \"([^\"]*)\"$")
	public void page_should_contain(String arg1) {
		if (driver.getPageSource().contains(arg1)) 
		{
			Assert.assertTrue(driver.getPageSource().contains(arg1));
			System.out.print("the customer info has been added successfully");
		} else {
			
			System.out.print("the customer has an error");
//			logger.info("the customer has an error")
//			log.error("the 	customer has an error");
			
			driver.close();
		}
		
	}
	
	@Then("^close browser$")
	public void close_browser() {
		driver.close();
		
		   
	}

}
