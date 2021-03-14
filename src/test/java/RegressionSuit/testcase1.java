package RegressionSuit;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HaloSuit.Halo.HomePage;
import HaloSuit.Halo.Login;
import Resources.Base;

public class testcase1 extends Base{


    @BeforeMethod
	public void launch() throws IOException
	{
		driver=browser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
    @Test
    //user login with valid user
	public void ValidLogin() throws InterruptedException
	{
		Login a=new Login(driver);
		System.out.println(driver.getTitle());
		//a.username().sendKeys("julyskill02");
		a.username().sendKeys("spcoach001");
		a.password().sendKeys("Airtel@123");
		a.login().click();
		Thread.sleep(5000);
		
	}
    
    @Test
    //user login with invalid user password
	public void InvalidLogin() throws InterruptedException
	{
		Login a=new Login(driver);
		a.username().sendKeys("spcoach001");
		a.password().sendKeys("Airtel@000");
		a.login().click();	
		Assert.assertTrue(a.error().isDisplayed());
	}
    
    
    @Test
    //login with SSO user. feature bit
	public void ssouserlogin() throws InterruptedException
	{
		Login a=new Login(driver);
		a.username().sendKeys("arun.joseph@learnship.com");
		a.password().sendKeys("Thinkpad@123");
		a.login().click();
		Assert.assertTrue(a.error().isDisplayed());
		String cap= a.error().getText();
		if(cap.equals("You must log in from your company's learning portal."))
		{
			System.out.println(cap);
		}
		else {
			System.out.println( "cap is not available");
		}
	}
    
    @Test
      //user login with deactivated user
	public void DeactivateUser() throws InterruptedException
	{
		Login a=new Login(driver);
		a.username().sendKeys("testuser10@learnship.com");
		a.password().sendKeys("Pravin@123");
		a.login().click();	
		Assert.assertTrue(a.error().isDisplayed());
		String deactivate= a.error().getText();
		if(deactivate.equals("Your account is not active. Contact your administrator."))
		{
			System.out.println(deactivate);
		}
		else {
			System.out.println( "message is not available");
		}
	}
    
    
    @Test()
    //forgetpassword-validation1-make sure the continue button enables for valid and invalid emailId
    public void passwordreset() throws InterruptedException
    {
    	Login a=new Login(driver);
    	a.forget().click();
    	//Negative scenario
    	a.emailtxt().sendKeys("aarun.josh@gmail");
    	Thread.sleep(5000);
    	Assert.assertFalse(a.reset().isEnabled());
    	a.emailtxt().clear();
    	//Positive Scenario
    	Thread.sleep(5000);
    	a.emailtxt().sendKeys("aarun.josh@gmail.com");
    	Assert.assertTrue(a.reset().isEnabled());
    	a.reset().click();
    	Thread.sleep(9000);   	
    }
		
		
    
    @AfterMethod
		public void shut()
		{
			driver.close();
        }
	
    
	}


