package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunction {
	
	
	public static Properties properties;
	public static WebDriver driver;
	
	static Logger logger=Logger.getLogger("CommonFunction.class");
	
	public Properties loadpropertiesfiles() throws IOException
	{
		FileInputStream fis=new FileInputStream("Config.properties");
		properties=new Properties();
		properties.load(fis);
		return properties;
	}
	
	@BeforeSuite
	public  void LaunchBrowser() throws IOException
	{
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Browser Organge HRM Test Begins");
		logger.info("Loading the property file");
		loadpropertiesfiles();
		String browser=properties.getProperty("Browser");
		String driverlocation=properties.getProperty("Browserlocation");
		String url=properties.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{	logger.info("Chrome browser is lauching");
			System.setProperty("webdriver.chrome.driver",driverlocation);
			driver=new ChromeDriver();
		}
		else
			if(browser.equalsIgnoreCase("Firefox"))
		{
				logger.info("Firefox browser is lauching");
				System.setProperty("webdriver.gecko.driver",driverlocation);
				driver=new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		logger.info("Navigating to URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		logger.info("Application browser is closed");
	driver.quit();	
	}
}
