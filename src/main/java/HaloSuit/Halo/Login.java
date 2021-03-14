package HaloSuit.Halo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
	
	public WebDriver driver;
	By username=By.id("lEmail");
	By password=By.id("lPass");
	By Login=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/button/span[1]");
	By language=By.id("basic-nav-dropdown");
	By error=By.id("lPass-helper-text");
	By burger=By.id("basic-nav-dropdown");
	By forget=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/button/span[1]");
	By forgetemail=By.id("reset_lEmail");
	By emailtxt=By.xpath("//input[@id='reset_lEmail']");
	By reset=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div[1]/button");
	
	
    public Login( WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}

	public WebElement username()
    {
		return driver.findElement(username);
    	
    }
    
    public WebElement password()
    {
		return driver.findElement(password);
    	
    }
    public WebElement login()
    {
		return driver.findElement(Login);
    	
    }
    public WebElement language()
    {
		return driver.findElement(language);
    	
    }
    
    public WebElement error()
    {
    	return driver.findElement(error);
    }
    public WebElement forget()
    {
    	return driver.findElement(forget);
    }

    public WebElement forgemail()
    {
    	return driver.findElement(forgetemail);
    }
	
    public WebElement emailtxt()
    {
    	return driver.findElement(emailtxt);
    }
    
    public WebElement reset()
    {
    	return driver.findElement(reset);
    	
    }
	}
    

