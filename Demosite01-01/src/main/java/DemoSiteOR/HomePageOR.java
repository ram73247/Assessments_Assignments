package DemoSiteOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOR {

	public HomePageOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath ="//title")
	  protected WebElement title;
	 
	 @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/center/big/strong")
	 protected WebElement Homepage;
	 
	
}

	