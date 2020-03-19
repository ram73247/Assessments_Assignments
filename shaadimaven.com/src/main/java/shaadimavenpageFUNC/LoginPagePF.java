package shaadimavenpageFUNC;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonfunctions.ConfigManager;
import commonfunctions.DriverFunc;
import shaadimavenOR.LoginPageOR;
import shaadimavenTC.BaseTestCase;

import org.testng.Reporter;
import org.testng.SkipException;

import com.aventstack.extentreports.Status;


public class LoginPagePF extends LoginPageOR{

	WebDriver driver = null;
	DriverFunc driverfunc;
	public LoginPagePF(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		driverfunc = BaseTestCase.getDriverFunc();
		if(!driver.getTitle().equalsIgnoreCase("The No.1 Matchmaking, Matrimony & Matrimonial Site")) {
			
			throw new SkipException("this is not Shaadi page");
		}	
	}
	
	public boolean isTitleMatched()
	{
		BaseTestCase.test.log(Status.INFO, "inside isTitleMatched method");
		if(title.getAttribute("innerHTML").equalsIgnoreCase("The No.1 Matchmaking, Matrimony &amp; Matrimonial Site"))
		{
			BaseTestCase.test.log(Status.PASS, "title of the page matched as Shaadi");
			return true;
		
		}
		else
		{
			System.out.println(title.getAttribute("innerHTML"));
			return false;
		}
	}
	
	
	public void methodLoginPage(String username, String password) throws InterruptedException
	{
		driverfunc.click(loginbt);
		
		System.out.println("redirected successfully to the sign for free pop up with header -->" + signfreepopup.getText());

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(signforfreebt);
		System.out.println("redirected successfully to the new user details pop up with header -->" + usernamepopup.getText());

		driverfunc.enterValues(usernameinput, username);
		if(usernameinput.getAttribute("value").equalsIgnoreCase(username))
		{
			System.out.println("username verified successfully = " + username);
		}
		else
			System.out.println("username verified unsuccessful" + username + "," + usernameinput.getAttribute("value"));
		driverfunc.enterValues(passwordinput, password);
		if(passwordinput.getAttribute("value").equalsIgnoreCase(password))
		{
			System.out.println("password verified successfully = " + password);
		}
		else
			System.out.println("password verified unsuccessful = " + password + "," + passwordinput.getAttribute("value"));
		driverfunc.click(select);
		driverfunc.click(relation);
		if(select.getText().equalsIgnoreCase("Brother"))
		{
			System.out.println("relation verified successfully = " + select.getText());
		}
		else
			System.out.println("realtion verified unsuccessful = " + select.getText() + ", Brother");
		

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(nextbt);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		if(detailspopup.getText().equalsIgnoreCase("Great! Now some basic details"))
		{
			System.out.println("redirected successfully to the Details Filling Page popup with header -->" + detailspopup.getText());
		}
		else
			System.out.println(detailspopup.getText());
		
	}
	
	public void methodMoreDetails(String firstname, String lastname) throws InterruptedException
	{
		driverfunc.enterValues(firstnameinput, firstname);
		driverfunc.enterValues(lastnameinput, lastname);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(day);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(dayno);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(month);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(monthno);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(year);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(yearno);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(religion);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(religionname);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(tongue);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(tonguelang);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(country);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(countryname);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driverfunc.click(signupbt);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(3000);
		if(profilepage.getText().equalsIgnoreCase("Let�s create his Profile now"))
		{
			System.out.println("Successfully redirected to profile page -->" + profilepage.getText());
		}
		
	}
	
	 
	
}
