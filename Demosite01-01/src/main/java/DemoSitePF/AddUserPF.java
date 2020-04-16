package DemoSitePF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;

import com.aventstack.extentreports.Status;

import CommonFunctions.DriverFunc;
import DemoSiteOR.AddUserOR;
import DemoSiteTC.BaseTestCase;

public class AddUserPF extends AddUserOR {

	WebDriver driver = null;
	DriverFunc driverfunc;
	String title;
	public AddUserPF(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		driverfunc = BaseTestCase.getDriverFunc();
		
	}
	
	public boolean isAddUserPageMatched()
	{
		driverfunc.click(Adduserlink);
		BaseTestCase.test.log(Status.INFO, "inside isTitleMatched method");
		if(AddUserPage.getText().equalsIgnoreCase("3. Add a User"))
		{
			BaseTestCase.test.log(Status.PASS, "redirected to AddUser Successfully");
			return true;
		}
		else
		{
			System.out.println(AddUserPage.getText());
			BaseTestCase.test.log(Status.FAIL, "Not redirected to AddUser");
			return false;
		}
	}
	
	public void methodAddUser(String username,String password)
	{
		

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driverfunc.enterValues(usernameinput, username);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driverfunc.enterValues(passwordinput, password);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driverfunc.click(savebutton);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		

		if(usernamesaved.getText().equalsIgnoreCase("The username:"))
		{
			BaseTestCase.test.log(Status.PASS, "Username Verifed Succesful");
		}
		else
		{
			BaseTestCase.test.log(Status.FAIL, "Username Verifed UnSuccesful");
		}
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		if(passwordsaved.getText().equalsIgnoreCase("The password:"))
		{
			BaseTestCase.test.log(Status.PASS, "Password Verifed Succesful");
		}
		else
		{
			BaseTestCase.test.log(Status.FAIL, "Password Verifed UnSuccesful");
		}
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
}
