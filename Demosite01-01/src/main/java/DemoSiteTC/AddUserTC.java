package DemoSiteTC;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Random;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import CommonFunctions.ConfigManager;
import CommonFunctions.DriverFunc;
import CommonFunctions.StartDriver;
import DemoSitePF.AddUserPF;
import DemoSitePF.HomePagePF;


public class AddUserTC extends BaseTestCase{

	Random user = new Random();
	Random pass = new Random();
	
	int usernameint = user.nextInt(100);
	int passwordint = pass.nextInt(100);
	
	String username = "Raghu" + usernameint;
	String password = "Raghu" + passwordint;
	
	@Test(priority = 3)
	public void verifyAddUserPage()
	{
		BaseTestCase.test.log(Status.INFO, "verify AddUserPage");
		Assert.assertTrue(AddUser.isAddUserPageMatched());
	}
	
	@Test(priority = 4)
	public void verifyAddUser()
	{
		System.out.println(username);
		System.out.println(password);
		BaseTestCase.test.log(Status.INFO, "verify Add user process");
		AddUser.methodAddUser(username, password);
	}
	
	public String usernamereturn()
	{
	return username;
	}
	
	public String passwordreturn()
	{
		return password;
	}
}
