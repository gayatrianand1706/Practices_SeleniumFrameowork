package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_pageobjects {

//	@FindBy(id = "menu_dashboard_index")
//	public WebElement Dashboard;

	@FindBy(xpath ="//*[@id='task-list-group-panel-menu_holder']//following::td[1]")
	public static WebElement pendingleaverequest;
}
