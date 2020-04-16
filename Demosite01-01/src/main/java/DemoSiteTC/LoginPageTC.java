package DemoSiteTC;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import DemoSiteTC.AddUserTC;
public class LoginPageTC extends BaseTestCase{

	AddUserTC Adduser = new AddUserTC();
	String username = Adduser.usernamereturn();
	String password =Adduser.passwordreturn();
	
	@Test(priority = 5)
	public void loginPageVerify()
	{
		BaseTestCase.test.log(Status.INFO, "verify loginPage");
		Assert.assertTrue(loginpage.loginPageVerify());
	}
	@Test(priority = 6)
	public void methodLoginPage()
	{
		BaseTestCase.test.log(Status.INFO, "giving credentials for Login");
		loginpage.methodLogin(username, password);
		BaseTestCase.test.log(Status.INFO, "verifing login Attempt");
		System.out.println("Login Attempt" + "=" + loginpage.methodLoginAttempt());
	}
	
}
