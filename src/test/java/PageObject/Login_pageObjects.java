package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pageObjects {

	@FindBy(id = "txtUsername")
	public static WebElement username;
	
	@FindBy(name = "txtPassword")
	public static WebElement password;
	
	@FindBy (id="btnLogin")
	public static  WebElement loginbutton;
	
}
