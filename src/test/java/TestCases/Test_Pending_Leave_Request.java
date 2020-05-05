package TestCases;




import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import CommonFunctions.CommonFunction;
import CommonFunctions.ExcelUtil;
import PageObject.Dashboard_pageobjects;
import PageObject.Login_pageObjects;

public class Test_Pending_Leave_Request extends CommonFunction {

	static Logger logger=Logger.getLogger("Test_Pending_Leave_Request.class");

	@Test(priority = 1,dataProvider = "getATTestData" )
	public void login(String Username,String Password)
	{
		PageFactory.initElements(driver, Login_pageObjects.class);
		logger.info("Logging using username and password from excel ");
		//below code  is to take value from properties 
		//		Login_pageObjects.username.sendKeys(properties.getProperty("username"));
		//		Login_pageObjects.password.sendKeys(properties.getProperty("password"));
		Login_pageObjects.username.sendKeys(Username);
		Login_pageObjects.password.sendKeys(Password);
		Login_pageObjects.loginbutton.click();

	}

	@Test(priority = 2)
	public void verifyleavependingtext()
	{
		logger.info("Fetching the value of Leave Request and checking it");
		PageFactory.initElements(driver, Dashboard_pageobjects.class);
		String requestvalue=Dashboard_pageobjects.pendingleaverequest.getText();
		Assert.assertEquals(requestvalue,"No Records are Available");
		
	}


	@DataProvider()
	public Object[][] getATTestData()
	{
		Object data[][]=ExcelUtil.getTestData("Login");
		return data;
	}
}
