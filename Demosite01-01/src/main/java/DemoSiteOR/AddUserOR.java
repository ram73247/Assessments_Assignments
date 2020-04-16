package DemoSiteOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserOR {

private WebDriver driver;
	
	public AddUserOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	 
	@FindBy(name = "username")
	protected WebElement usernameinput;
	
	@FindBy(name = "password")
	protected WebElement passwordinput;
	
	@FindBy(name = "FormsButton2")
	protected WebElement savebutton;
	
	
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote/b[1]")
	protected WebElement usernamesaved;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote/b[2]")
	protected WebElement passwordsaved;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/p[1]/big/strong")
	protected WebElement AddUserPage;
	
	 @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
		protected WebElement Adduserlink;
}
