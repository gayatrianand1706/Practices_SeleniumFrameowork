package TestCases;



import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunction;
import PageObject.Userrole_pageObjects;

public class Test_user_role extends CommonFunction{
	
	static Logger logger=Logger.getLogger("Test_user_role.class");
	
	public void ClickAdmin()  
	{	PageFactory.initElements(driver , Userrole_pageObjects.class);
	logger.info("Clicked  Users link");
		Actions action=new Actions(driver);
		action.moveToElement(Userrole_pageObjects.Admin);
		action.moveToElement(Userrole_pageObjects.UserManagement);
		action.moveToElement(Userrole_pageObjects.Users);
		action.click().build().perform();
		
	}
	

	public void selectuserrole()
	{
		logger.info("Selected Userroledropdown");
		Select select=new Select(Userrole_pageObjects.userroledropdown);
		select.selectByVisibleText("Admin");
		logger.info("Selected Userstatusdropdown");
		Select select1=new Select(Userrole_pageObjects.userstausdropdown);
		select1.selectByIndex(0);
	}
	
	@Test
	public void checkuserrole()
	{
		logger.info("Verifying the Userrole and staus text");
		PageFactory.initElements(driver , Userrole_pageObjects.class);
		ClickAdmin();
		selectuserrole();
		Userrole_pageObjects.searchbutton.click();
		String actualroletext=Userrole_pageObjects.UserRole.getText();
		String statustext=Userrole_pageObjects.UserStatus.getText();
		Assert.assertEquals(actualroletext, "Admin");
		Assert.assertEquals(statustext, "Enabled");
		
	}
}
