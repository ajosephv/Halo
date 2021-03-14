package RegressionSuit;



import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HaloSuit.Halo.HomePage;
import HaloSuit.Halo.Login;
import Resources.Base;

public class testcase2 extends Base {
	
	@BeforeTest
	public void login() throws IOException
	{
		driver=browser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@Test
	public void newlog() throws InterruptedException
	{
		Login a=new Login(driver);
		a.username().sendKeys("julyskill02");
		a.password().sendKeys("Airtel@123");
		a.login().click();
	}
		@Test
		public void newsfeed()
		{
			HomePage c=new HomePage(driver);
			c.newsf();
			System.out.println("nothig");
		}
	
	
	
	
	
	@AfterTest
	public void shut()
	{
		//driver.close();
	}
}
