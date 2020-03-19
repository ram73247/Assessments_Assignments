package com.Shaadi;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShaadiAssessment {
	static WebDriver driver;

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raju.nadimpalli\\Downloads\\zip_jar_files\\EXE file\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://www.shaadi.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("Sign Up Free")).click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		email.sendKeys("ram" + randomInt + "@gmail.com");
		System.out.println("email entered is --> " + email.getAttribute("value"));

		WebElement create_pass = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		create_pass.sendKeys("raghuram13");

		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'postedby')]"))).click();
		List<WebElement> myList = new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[2]/div[3]/div/div[2]")));
		for (WebElement element : myList)
			if (element.getText().contains("Brother")) {
				element.click();
			}

		clicking(driver, By.xpath("//button[contains(text(),'Next')]"));
		System.out.println("Button next");

		WebDriverWait wait = new WebDriverWait(driver, 80);

		WebElement fn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'first_name')]")));
		fn.sendKeys("Raghu");
		System.out.println("first name entered is --> " + fn.getAttribute("value"));

		WebElement ln = driver.findElement(By.xpath("//input[contains(@name,'last_name')]"));
		ln.sendKeys("Raju");
		System.out.println("last name entered is --> " + ln.getAttribute("value"));

		ln.clear();

		WebElement days= new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Day')]")));
		days.click();
		clicking(driver, By.xpath("//div[contains(text(),'10')]"));
		String dayval= days.getText();
		

		WebElement month = new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Month')]")));
		month.click();
		clicking(driver, By.xpath("//div[contains(text(),'May')]"));	
		String monthval= month.getText();
		
		WebElement year = new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Year')]")));
		year.click();
		clicking(driver, By.xpath("//div[contains(text(),'1999')]"));
		String yearval= year.getText();
		
		System.out.println("date entered dd-mm-yyyy is -->" +" " + dayval + " " + monthval+ " "+ yearval);
		

		WebElement religion = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[4]/div/div/div"));
		religion.click();
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[4]/div/div/div[2]/div[8]")).click();
		String rel = religion.getText();
		System.out.println("Religion is selected--> " + rel);

		WebElement lang = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div[1]"));
		lang.click();
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[5]/div/div/div[2]/div[2]/div[18]"))
				.click();
		String lan = lang.getText();
		System.out.println("Language is selected --> " + lan);

		WebElement country = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[6]/div/div/div"));
		country.click();
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[6]/form/div[6]/div/div/div[2]/div[2]/div[91]"))
				.click();
		String cou = country.getText();
		System.out.println("country is selected --> " + cou);

		clicking(driver, By.xpath("//button[contains(text(),'Sign Up')]"));


		WebElement city = driver.findElement(By.xpath("//input[@id='places']"));
		city.click();
		Thread.sleep(2000);
		city.sendKeys("Delhi, India");
		String liv = city.getAttribute("value");
		Thread.sleep(2000);
		city.sendKeys(Keys.CONTROL + "\t");
		Thread.sleep(2000);
		System.out.println("Lives in---> " + liv);


		driver.findElement(By.xpath("//div[contains(text(), 'Yes')]")).click();

		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='maritalStatus']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Never Married')]"))).click();
	
		clicking(driver, By.xpath("//div[contains(text(),'Veg')]"));
		System.out.println("Vegetarian");

		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='height']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'4ft 7in - 139cm')]"))).click();
		 
		
		clicking(driver, By.xpath("//span[contains(text(),'Continue')]"));
	
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='educationLevel']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Doctorate')]"))).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='educationField']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Commerce')]"))).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='highestCollege']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Acharya')]"))).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='workingWith']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Private Company')]"))).click(); 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='workingAs']"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Banking Professional')]"))).click();
		 
		 WebElement company = driver.findElement(By.xpath("//input[@id='employer']"));
			company.click();
			Thread.sleep(2000);
			company.sendKeys("A  PJ  Project");
			Thread.sleep(2000);
			company.sendKeys(Keys.CONTROL + "\t");
			Thread.sleep(2000);
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Monthly')]"))).click();
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='income']")));
			 Element.click();

			 js.executeScript("arguments[0].scrollIntoView();", Element);
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),' 60 to 80K monthly')]"))).click();
				 
			 clicking(driver, By.xpath("//span[contains(text(),'Continue')]"));
			
			 Thread.sleep(2000);
			 WebElement textarea= driver.findElement(By.xpath("//textarea"));
			 Thread.sleep(2000);

			 textarea.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
			 textarea.sendKeys(Keys.CONTROL + "\t");
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.id("mobileNumber"))).sendKeys("9911223344");
			 
			 clicking(driver, By.xpath("//span[contains(text(),'Create Profile')]"));

			 
				
			 
			 driver.quit();

        

	}
	public static void clicking(WebDriver driver, By by) {

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();

	}

}
