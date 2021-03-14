package HaloSuit.Halo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public WebDriver driver;
	
	By burger=By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div[3]/a");
	By logout=By.xpath("//div[@class='burger-menu show dropdown nav-item']/div/a[2]");
    By feature=By.xpath("//div[@class='sub_Header']/div/div[3]");
    By featuree=By.xpath("//*[@id='nav-dropdown']");
    By lang=By.xpath("//div[@class='language_dropdown show dropdown nav-item']");
		





	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement burger()
	{
		return driver.findElement(burger);		
	}
	
	public WebElement logout()
	{
		return driver.findElement(logout);		
	}
	
	/*public void newsfeed()
	{
		List<WebElement> news= driver.findElements(By.xpath("//div[@class='newsFeedCard']"));
		for(int i=0;i<news.size();i++)
		{
			driver.findElement(By.xpath("")).click();
				
		}
		
	}*/
	
	public void newsf()
	{
		
	}
  /*public WebElement feature()
  {
	 return driver.findElement(feature);
	  
  }*/
	
	public void land()
	{
		Select lll=new Select(driver.findElement(lang));
		
	}
  
}
