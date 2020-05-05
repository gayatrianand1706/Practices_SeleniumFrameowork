package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_pageobject {

	@FindBy(id ="welcome" )
	public static WebElement welcomeadmin;
	
	@FindBy(linkText = "Logout")
	public static WebElement logout;
	
}
