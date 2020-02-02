package PowerBull_cucumber.PowerBull_cucumber;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class firstTestNG {

	@Test(priority=1,description="This test cases verify login functionality")
	public void loginappliction()
	{
	
		System.out.println("Login Hello world");
		Assert.assertEquals(12, 13);
	}
	

	@Test(priority=2,description="This test cases verify select functionality")
	public void selectitem()
	{
	
		System.out.println("Select the application world");
	}
	
	@Test(priority=-3,description="This test cases verify checkout functionality")
	public void Checkout()
	{
	
		System.out.println("checkout the application world");
	}
	
	}

