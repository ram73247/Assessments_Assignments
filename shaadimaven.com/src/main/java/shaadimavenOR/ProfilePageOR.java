package shaadimavenOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePageOR {

private WebDriver driver;
	
	public ProfilePageOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"places\"]")
	protected WebElement city;
	
	@FindBy(xpath = "//input[@id = 'focused-input']")
	protected WebElement livingcityinput;
	
	@FindBy(xpath = "//*[@id=\"livesWithFamilyOption\"]/div[2]/label/div")
	protected WebElement familystay;
	
	@FindBy(xpath = "//*[@id=\"familyplaces\"]")
	protected WebElement familyplace;
	
	@FindBy(xpath = "//*[@id=\"focused-input\"]")
	protected WebElement familycityinput;
	
	@FindBy(xpath = "//*[@id=\"focused-input\"]")
	protected WebElement 
}
