package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver browser() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\VictorArunJoseph\\eclipse-workspace\\Halo\\src\\main\\java\\Resources\\properties");
		prop.load(fis);
		
		//String browser=System.getProperty("browser");
		String browser=prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VictorArunJoseph\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\VictorArunJoseph\\Automation\\chromedriver_win32\\chromedriver.exe");	
		driver=new InternetExplorerDriver();
		}
		
		else if(browser.equals("firefix"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\VictorArunJoseph\\Automation\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		

	}
	
	

	
}
