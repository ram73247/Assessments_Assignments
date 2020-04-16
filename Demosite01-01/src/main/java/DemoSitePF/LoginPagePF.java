package DemoSitePF;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import CommonFunctions.DriverFunc;
import DemoSiteOR.LoginPageOR;
import DemoSiteTC.BaseTestCase;

public class LoginPagePF extends LoginPageOR{
	WebDriver driver = null;
	DriverFunc driverfunc;
	String title;
	public LoginPagePF(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		driverfunc = BaseTestCase.getDriverFunc();
		
	}
	
	public boolean loginPageVerify()
	{
		driverfunc.click(LoginButton);
		if(loginpagetitle.getAttribute("innerHTML").equalsIgnoreCase("Login example page to test the PHP MySQL online system"))
		{
			BaseTestCase.test.log(Status.PASS, "LoginPage redirection successful");
			return true;
		}
		else
		{
			System.out.println(loginpagetitle.getAttribute("innerHTML"));
			BaseTestCase.test.log(Status.FAIL, "LoginPagw redirection unsuccessful");

			return false;
		}
	}

	public void methodLogin(String username, String password)
	{
		driverfunc.enterValues(usernameinput, username);
		
		driverfunc.enterValues(passwordinput, password);
		
		driverfunc.click(Testloginbutton);
	}
	
	public String methodLoginAttempt()
	{
		if(LoginAttempt.getText().equalsIgnoreCase("**Failed Login**"))
		{
			BaseTestCase.test.log(Status.FAIL, "Login Failed");
				return "Fail";
		}
		else if(LoginAttempt.getText().equalsIgnoreCase("**No login attempted**"))
		{
			BaseTestCase.test.log(Status.INFO, "No Login Attempt");
			return "No login attempted";
		}
		else
		{
			BaseTestCase.test.log(Status.PASS, "Login Passed");
		return "Pass";
		}
		
	}
	
	
}
