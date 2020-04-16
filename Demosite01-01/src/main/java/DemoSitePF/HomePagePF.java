package DemoSitePF;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;

import com.aventstack.extentreports.Status;

import CommonFunctions.DriverFunc;
import DemoSiteOR.HomePageOR;
import DemoSiteTC.BaseTestCase;

public class HomePagePF extends HomePageOR{

	WebDriver driver = null;
	DriverFunc driverfunc;
	String titlestring;
	public HomePagePF(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		driverfunc = BaseTestCase.getDriverFunc();
		System.out.println(driver.getTitle());
		titlestring = driver.getTitle();
		if(!driver.getCurrentUrl().equalsIgnoreCase("http://thedemosite.co.uk/"))
		{
			
			throw new SkipException("this is not DemoSite page");
		}	
	}
	
	public boolean isTitleMatched()
	{
		System.out.println("inside isTitlematched method");
		if(title.getAttribute("innerHTML").equalsIgnoreCase(titlestring))
		{
			BaseTestCase.test.log(Status.PASS, "title of the page matched as DemoSite");
			return true;
		
		}
		else
		{
			System.out.println(title.getAttribute("innerHTML"));
			BaseTestCase.test.log(Status.FAIL, "title of the page not matched as DemoSite");

			return false;
		}
	}
	
	public void methodHomePage()
	{
		BaseTestCase.test.log(Status.INFO, "inside Homepage method");
		if(Homepage.getText().equalsIgnoreCase("1. Home"))
		{
			BaseTestCase.test.log(Status.PASS, "Home Page verified successfully");
			
		
		}
		else
		{
			System.out.println(Homepage.getText());
			BaseTestCase.test.log(Status.FAIL, "Home page not redirected");
		}

	}
}
