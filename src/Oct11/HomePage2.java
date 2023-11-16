package Oct11;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage2 {
	@BeforeMethod
	public void setUp() {
		System.out.println("Browser started");
		System.out.println("App lunched");
	}
	@AfterMethod
	public void Close(){
		System.out.println("browser closed");	
	}
	@Test(priority=1)
	public void  loginTest()
	{
		Assert.assertTrue(true);
		System.out.println("Login successful");	
	}
	@Test(priority=0)
	public void  registrationTest()
	{
		System.out.println("registration successful");
	}
	
	@Test(priority=2,dependsOnMethods="loginTest")
	public void  forgetPassword()
	{
		System.out.println("forget  successful");	
	}

}
