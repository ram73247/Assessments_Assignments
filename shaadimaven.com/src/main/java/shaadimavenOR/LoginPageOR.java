package shaadimavenOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOR {

	private WebDriver driver;
	
	public LoginPageOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath ="//title")
	  protected WebElement title;
	 
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[1]/div[1]/div[2]/a[1]")
	protected WebElement loginbt;
	
	@FindBy(xpath = "//*[@id=\"frmLogin\"]/div[2]/p/a")
	protected WebElement signforfreebt;
	
	@FindBy(name = "email")
	protected WebElement usernameinput;
	
	@FindBy(name = "password1")
	protected WebElement passwordinput;
	
	@FindBy(xpath = "//div[contains(@class,'postedby')]")
	protected WebElement select;

	@FindBy(xpath = "//div[contains(text(),'Brother')]")
	protected WebElement relation;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/button")
	protected WebElement nextbt;
	
	@FindBy(xpath = "//h2[contains(@class,'form-module--form-title--Ltrmj form-module--loginFormTitle--2kBWR')]")
	protected WebElement signfreepopup;
	
	@FindBy(xpath = "//h2[contains(@class,'form-module--form-title--Ltrmj')]")
	protected WebElement usernamepopup;
	
	@FindBy(xpath = "//h2[contains(@class,'form-module--form-title--Ltrmj')]")
	protected WebElement detailspopup;
	
	@FindBy(name = "first_name")
	protected WebElement firstnameinput;
	
	@FindBy(name = "last_name")
	protected WebElement lastnameinput;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[1]/div/div")
	protected WebElement day;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[1]/div/div[2]/div[6]")
	protected WebElement dayno;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[2]/div/div")
	protected WebElement month;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[2]/div/div[2]/div[5]")
	protected WebElement monthno;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[3]/div/div[1]")
	protected WebElement year;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[3]/div[3]/div/div[2]/div[5]")
	protected WebElement yearno;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[4]/div/div/div")
	protected WebElement religion;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[4]/div/div/div[2]/div[1]")
	protected WebElement religionname;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div")
	protected WebElement tongue;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div[2]/div[1]/div[16]")
	protected WebElement tonguelang;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[6]/div/div/div")
	protected WebElement country;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[6]/div/div/div[2]/div[1]/div[4]")
	protected WebElement countryname;
	
	@FindBy(xpath = "//*[@id=\"___gatsby\"]/div/div[6]/form/div[7]/button")
	protected WebElement signupbt;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/h1")
	protected WebElement profilepage;


	
	
}
