package Oct11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage {
	
	@Test(priority=1)
	public void  loginTest()
	{
		System.out.println("Browser started");
		System.out.println("App lunched");
		Assert.assertTrue(false);
		System.out.println("Login successful");
		System.out.println("browser closed");
		
	}
	
	@Test(priority=0)
	public void  registrationTest()
	{
		System.out.println("Browser started");
		System.out.println("App lunched");
		System.out.println("registration successful");
		System.out.println("browser closed");
		
	}
	
	@Test(priority=2,dependsOnMethods="loginTest")
	public void  forgetPassword()
	{
		System.out.println("Browser started");
		System.out.println("App lunched");
		System.out.println("forget  successful");
		System.out.println("browser closed");
		
	}

}
