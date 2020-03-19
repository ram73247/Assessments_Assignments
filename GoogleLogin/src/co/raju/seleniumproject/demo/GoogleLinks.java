package co.raju.seleniumproject.demo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleLinks {

	public static void main(String[] args) throws  InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raju.nadimpalli\\Downloads\\zip_jar_files\\EXE file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		System.out.println("enter the username :");
		Scanner s = new Scanner(System.in);
		 String username = s.nextLine();
			System.out.println("enter the password :");
			String password = s.nextLine();
			System.out.println(" ");
		 driver.get("https://www.gmail.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.className("CwaK9")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
		Thread.sleep(1000);
		String abc =" ";
		abc = driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText();
		System.out.println(abc);
		String bcd = "Couldn't sign you in";
		String expectedURL="https://accounts.google.com/signin/v2/deniedsigninrejected?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward";
		String redirectURL=driver.getCurrentUrl();
		if(abc.equalsIgnoreCase(bcd))
		{
			System.out.println(abc);
		}
		else
			System.out.println("Wrong credentials given \n username :" + username + "\n password :" + password);
	
	
	}



}
