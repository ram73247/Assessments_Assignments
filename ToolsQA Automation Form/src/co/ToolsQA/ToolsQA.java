package co.ToolsQA;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		
		//declaration
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raju.nadimpalli\\Downloads\\zip_jar_files\\EXE file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.toolsqa.com/automation-practice-form/");
		 Scanner s = new Scanner(System.in);
		 
		 
		//giving inputs
		 System.out.println("Firstname :");
		 String firstname = s.nextLine();
		 System.out.println("Lastname :");
		 String lastname = s.nextLine();
		 System.out.println("give today date");
		 String date_form = s.nextLine();
		 System.out.println("select Gender :\n	1.male\n	2.female");
		 int gender = s.nextInt();
		 System.out.println("give expereince between \"1 - 7\"");
		 int experience = s.nextInt();
		 int e = experience - 1;
		 System.out.println("Select the profession\n	1.manual Tester\n	2.Automation Tester\n	3.Both");
		 int profession = s.nextInt();
		 System.out.println("Select the Automation Tool\n	1.QTP\n	2.Selenium IDE,QTP\n	3.All");
		 int tools = s.nextInt();
		 System.out.println("Select the continents\n	1.Asia\n	2.Europe\n	3.Africa\n	4.Australia\n	5.South America\n	6.North America\n	7.Antarctica");
		 int cont = s.nextInt();
		 System.out.println("Select the continents Multiple\n	1.Asia\n	2.Asia,Europe,Africa\n	3.Asia,Europe,Africa,Australia,South America,North America,Antarctica");
		 int cont_mul = s.nextInt();
		 System.out.println("select the file to download\n	1.Selenium Automation Hybrid Framework\n	2.Test File to Download\n	3.both");
		 int down = s.nextInt();
		 int exitVal = 3,exitVal1 = 3;
		 System.out.println("select the Selenium Commands known\n	1.Browser Commands\n	2.Browser Commands,Swtich Commands\n	3.Browser Commands,Navigation Commands,Swtich Commands,Wait Commands,WebElement Commands");
		 int sel_comm = s.nextInt();


		 

		 
		 
		 
		 //sending data for automation testing
		 driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		 if(firstname == "")
			 System.out.println("firstname given is Empty");
		 else
			 driver.findElement(By.name("firstname")).sendKeys(firstname);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 if(lastname == "")
			 System.out.println("lastname given is empty");
		 else
			 driver.findElement(By.id("lastname")).sendKeys(lastname);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebElement gender_female = driver.findElement(By.id("sex-1"));
			WebElement gender_male = driver.findElement(By.id("sex-0"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			if(gender == 1)
			{
				gender_male.click();
				
			}
			else if (gender == 2)
			{
				
				gender_female.click();
				
			}
			else
			{
				System.out.println("PLease Select the Gender as per the form");
			}
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
			String exp = "//*[@id=\"exp-" + e + "\"]";
			WebElement exep = driver.findElement(By.xpath(exp));
			exep.click();
			
			
			WebElement date_button = driver.findElement(By.id("datepicker"));
			date_button.sendKeys(date_form);
			WebElement prof_manual = driver.findElement(By.id("profession-0"));
			WebElement prof_Automation = driver.findElement(By.id("profession-1"));
			if(profession == 1)
				prof_manual.click();
			else if(profession == 2)
				prof_Automation.click();
			else if(profession == 3)
			{
				prof_manual.click();
				prof_Automation.click();

			}
			else
				System.out.println("please select the profession as per the form");
			
			Select continents = new Select(driver.findElement(By.id("continents")));
			String Cu = "t";
			if(cont == 1)
			{
				continents.selectByVisibleText("Asia");
				Cu = "Asia";
			}
			else if(cont == 2)
			{
				continents.selectByVisibleText("Europe");
				Cu = "Europe";
			}
			else if(cont == 3)
			{
				continents.selectByVisibleText("Africa");
				Cu = "Africa";
			}
			else if(cont == 4)
				
			{
				continents.selectByVisibleText("Australia");
				Cu = "Australia";
			}
			
			else if(cont == 5)
			{
				continents.selectByVisibleText("South America");
				Cu = "South America";
			}
			else if(cont == 6)
			{
				continents.selectByVisibleText("North America");
				Cu = "North America";
			}
			else if(cont == 7)
			{
				continents.selectByVisibleText("Antarctica");
				Cu = "Antarctica";
			}
			else
				System.out.println("select continents as per the form");
			
			int too = 0;
			if(tools == 1)
			{
			driver.findElement(By.id("tool-0")).click();
			too = 1;
			}
			else if(tools == 2)
			{
				driver.findElement(By.id("tool-0")).click();
				driver.findElement(By.id("tool-1")).click();
				too = 2;
			}
			else if(tools == 3)
			{
				driver.findElement(By.id("tool-1")).click();
				driver.findElement(By.id("tool-2")).click();
				too = 3;
			}
			else
				System.out.println("not selected as per the form");
			

			Select continents_multi = new Select(driver.findElement(By.id("continentsmultiple")));
			String cont_print = "";
			String cont_ver = "";
			if(cont_mul == 1)
			{
				cont_ver = "Asia,";
				continents_multi.selectByIndex(0);
				List<WebElement> W = continents_multi.getAllSelectedOptions();
				for (WebElement e1 : W)
				{
					cont_print = cont_print + e1.getText() + ",";
				}
			}
			else if(cont_mul == 2)
			{
				cont_ver = "Asia,Europe,Africa,";
				continents_multi.selectByIndex(0);
				continents_multi.selectByIndex(1);
				continents_multi.selectByIndex(2);
				List<WebElement> W = continents_multi.getAllSelectedOptions();
				for (WebElement e1 : W)
				{
					cont_print = cont_print + e1.getText() + ",";
				}
			}
				
			else if(cont_mul == 3)
			{
				cont_ver = "Asia,Europe,Africa,Australia,South America,North America,Antarctica,";
				continents_multi.selectByIndex(0);
				continents_multi.selectByIndex(1);
				continents_multi.selectByIndex(2);
				continents_multi.selectByIndex(3);
				continents_multi.selectByIndex(4);
				continents_multi.selectByIndex(5);
				continents_multi.selectByIndex(6);

				List<WebElement> W = continents_multi.getAllSelectedOptions();
				for (WebElement e1 : W)
				{
					cont_print = cont_print + e1.getText() + ",";
				}
			}
			WebElement photo_upload = driver.findElement(By.id("photo"));
			photo_upload.sendKeys("C:\\Users\\raju.nadimpalli\\Desktop\\html basics.html\\IMG_6590.jpg");
			
			 WebElement downloadButton1 = driver.findElement(By
		                .xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[25]/a"));
			 WebElement downloadButton2 = driver.findElement(By
		                .xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[26]/a"));
		                String sourceLocation1 = downloadButton1.getAttribute("href");
		                String sourceLocation2 = downloadButton2.getAttribute("href");
		                if(down == 1)
		                {
		                String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation1;

		                try {
		                Process exec = Runtime.getRuntime().exec(wget_command);
		                exitVal = exec.waitFor();
		                } catch (InterruptedException | IOException ex) {
		                System.out.println(ex.toString());
		                }
		                }
		                else if(down == 2)
		                {
		                	  
		  		                String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation2;

		  		                try {
		  		                Process exec1 = Runtime.getRuntime().exec(wget_command);
		  		                exitVal1 = exec1.waitFor();

		  		                } catch (InterruptedException | IOException ex) {
		  		                System.out.println(ex.toString());
		  		                }
		                }
		                else if(down == 3)
		                {
		                	  
		  		                String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation1;

		  		                try {
		  		                Process exec = Runtime.getRuntime().exec(wget_command);
		  		                exitVal = exec.waitFor();

		  		                } catch (InterruptedException | IOException ex) {
		  		                System.out.println(ex.toString());}
		  		                
		  		              
		  		                String wget_command1 = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation2;

		  		                try {
		  		                Process exec1 = Runtime.getRuntime().exec(wget_command1);
		  		                exitVal1 = exec1.waitFor();
		 		              

		  		                } catch (InterruptedException | IOException ex) {
		  		                System.out.println(ex.toString());
		  		                }
		                }
		                else
		                	System.out.println("Not selected anything to download");

				
				
			
			//Retrieving data from website
			 String f = driver.findElement(By.name("firstname")).getAttribute("value");
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 String n = driver.findElement(By.xpath("//*[@id=\"lastname\"]")).getAttribute("value");
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String d = date_button.getAttribute("value");
					
					
				//printing testcase	
				System.out.println("testcase 1: ");
				 if(f.equalsIgnoreCase(firstname))
					{
						System.out.println("firstname Test Case successful");
					}
					else
						System.out.println("firstname Unsuccessful \n	Expected Text : " + firstname +"\n	Actual Text : " + f );
				
				
					System.out.println("testcase 2: ");
					 if(n.equalsIgnoreCase(lastname))
						{
							System.out.println("lastname Test Case successful");
						}
						else
							System.out.println("lastname Unsuccessful \nExpected Text : " + lastname +"\nActual Text : " + n );
						System.out.println("testcase 3: ");
					 if(gender == 1)
						{
							if(gender_male.isSelected())
								System.out.println("Gender Testcase Successful");
							else
								System.out.println("Gender Testcase UnSuccessful");		
						}
					 else if(gender == 2)
					 {
						 if(gender_female.isSelected())
							 	System.out.println("Gender Testcase Successful");
						 else
								System.out.println("Gender Testcase UnSuccessful");
					 }
					 else
							System.out.println("Gender Testcase UnSuccessful  Gender Not Selected");
						System.out.println("testcase 4: ");
					 if(d.equalsIgnoreCase(date_form))
					 {
						 System.out.println("Date testcase successful");
					 }
					 else
						 System.out.println("Date testcase Unsuccessful");
					 
					 System.out.println("Testcase 5:");
					 if(profession == 1)
					 {
						 if(prof_manual.isSelected())
							 System.out.println("prof testcase successful");
						 else
							 System.out.println("prof testcase Unsuccessful");


					 }
					 else if(profession == 2)
					 {
						 if(prof_Automation.isSelected())
							 System.out.println("prof testcase successful");
						 else
							 System.out.println("prof testcase Unsuccessful");
					 }
					 else if(profession == 3)
					 {
						 if(prof_manual.isSelected() && prof_Automation.isSelected())
							 System.out.println("prof testcase successful");
						 else
							 System.out.println("prof testcase Unsuccessful");

					 }
					 else
						 System.out.println("prof not selected or something went wrong");
					 
					 System.out.println("Testcase 6:");
					 if(tools>0 && tools<4)
						 if(tools == too)
							 System.out.println("tools testcase successful");
						 else
							 System.out.println("tools testcase unsucccessful");
					 else
						 System.out.println("tools not selected or something not wrong");
					 
							 
						 
					 
					 System.out.println("Testcase 7:");
					  if(cont>0 && cont<8)
					  {
						WebElement cont_ret = continents.getFirstSelectedOption();
						if(Cu.equalsIgnoreCase(cont_ret.getText()))
							System.out.println("continent testcase successful");
						else
							System.out.println("continent testcase Unsuccessful");
					  }
					  else
						  System.out.println("Continent not selected or something went wrong");
					 
					 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					 
					 System.out.println("Testcase 8:");
					 if(cont_ver.equalsIgnoreCase(cont_print))
						 System.out.println("Continent multiple Testcase successful");
					 else
						 System.out.println("Continent multiple Testcase unsuccessful");
					 
					 System.out.println("TestCase 9:");
					 if(photo_upload.getAttribute("value").equalsIgnoreCase("C:\\fakepath\\" + "IMG_6590.jpg"))
					 {
						 System.out.println("photoupload Testcase successful");
					 }
					 else
						 System.out.println("photoupload Testcase unsuccessful");
					 
					 System.out.println("TestCase 10:");
					 
						 if(exitVal == 0)
							 System.out.println("download 1 is successful");
						 else if(exitVal == 1)
							 System.out.println("download 1 is Unsuccessful");
						 else
							 System.out.println("download 1 not downloaded or something went wrong");

					 
					 
						 if(exitVal1 == 0)
							 System.out.println("download 2 is successful");
						 else if(exitVal1 == 1)
							 System.out.println("download 2 is Unsuccessful");
						 else
							 System.out.println("download 2 not downloaded or something went wrong");
					
							 System.out.println("Testcase :11");
							 if(exep.isSelected())
								 if(Integer.toString(experience).equalsIgnoreCase(exep.getAttribute("value")))
									 System.out.println("experience testcase successful");
								 else
									 System.out.println("experience testcase unsuccessful");
							 else 
								 System.out.println("experience not selected or something went wrong");


									 
					 

	}



}
