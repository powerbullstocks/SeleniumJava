package pageobjects;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 



public class Quiktest {
	public static void main(String[] args) {  

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// tries to open chercher.tech page
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	Select drpdwncont = new Select (driver.findElement(By.id("continents")));
	//drpdwncont.selectByValue("AN");
	//drpdwncont.selectByVisibleText("North America");
	//drpdwncont.selectByIndex(4);
	
	
	}
	
}
