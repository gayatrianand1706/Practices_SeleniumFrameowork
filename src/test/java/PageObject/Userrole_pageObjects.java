package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Userrole_pageObjects {

	/*
	 * @FindBy(id="menu_admin_viewAdminModule") public WebElement
	 */
	
//	@FindBy(how = How.ID,using="menu_admin_viewAdminModule")
//	public static WebElement Admin;
//	
//	@FindBy(how = How.LINK_TEXT,using="User Management")
//	public static  WebElement UserManagement;
//	
//	//linktext=Users
//	
//	@FindBy(id = "menu_admin_viewSystemUsers" )
//	public static WebElement Users;
	
//	@FindBy(how = How.LINK_TEXT,using="Admin")
//	public static WebElement Admin;
//	
//	@FindBy(how = How.LINK_TEXT,using="User Management")
//	public static  WebElement UserManagement;
//	
//	@FindBy(linkText = "Users")
//	public static WebElement Users;
		
	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']/b")
	public static WebElement Admin;
	
	@FindBy(xpath="//*[@id='menu_admin_UserManagement']")
	public static  WebElement UserManagement;

	@FindBy(xpath = "//*[@id='menu_admin_viewSystemUsers']" )
	public static WebElement Users;
	@FindBy(id = "searchSystemUser_userType")
	public static WebElement userroledropdown;
	
	@FindBy(id = "searchSystemUser_status")
	public static WebElement userstausdropdown;
	
	@FindBy(id = "searchBtn")
	public static WebElement searchbutton;
	
	//tr/td[3]
	@FindBy(xpath = "//*[@id='resultTable']/tbody/tr/td[3]")
	public static WebElement UserRole;
	
	@FindBy(xpath = "//*[@id='resultTable']/tbody/tr/td[5]")
	public static WebElement UserStatus;
	
	
}
