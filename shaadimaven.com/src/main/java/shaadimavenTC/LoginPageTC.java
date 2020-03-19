package shaadimavenTC;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonfunctions.ConfigManager;
import shaadimavenpageFUNC.LoginPagePF;
import shaadimavenOR.LoginPageOR;


public class LoginPageTC extends BaseTestCase{

	@Test(priority=1)
	public void verifytitle()
	{
		BaseTestCase.test.log(Status.INFO, "verify title");
		Assert.assertTrue(loginpage.isTitleMatched());
		
	}
	@Test(priority=2)
	public void verifyLoginPage() throws InterruptedException
	{
		loginpage.methodLoginPage(ConfigManager.getProp().getProperty("username"), ConfigManager.getProp().getProperty("password"));
		loginpage.methodMoreDetails(ConfigManager.getProp().getProperty("firstname"), ConfigManager.getProp().getProperty("lastname"));
	}
	
	
}
