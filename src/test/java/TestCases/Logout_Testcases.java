package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import CommonFunctions.CommonFunction;
import PageObject.Logout_pageobject;

public class Logout_Testcases extends CommonFunction{

	static Logger logger=Logger.getLogger("Logout_Testcases.class");
	
	@Test
	public void Logouttestcase()
	{
		logger.info("User logout the application ");
		PageFactory.initElements(driver, Logout_pageobject.class);
		Logout_pageobject.welcomeadmin.click();
		Logout_pageobject.logout.click();
		
	}
}
