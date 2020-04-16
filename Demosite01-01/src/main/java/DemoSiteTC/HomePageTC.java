package DemoSiteTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HomePageTC extends BaseTestCase{

	@Test(priority = 1)
	public void verifyTitle()
	{
		BaseTestCase.test.log(Status.INFO, "verify title");
		Assert.assertTrue(Homepage.isTitleMatched());
	}
	@Test(priority = 2)
	public void verifyHomepage()
	{
		BaseTestCase.test.log(Status.INFO, "verify HomePage");
		Homepage.methodHomePage();

	}
}

