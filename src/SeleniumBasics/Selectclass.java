package SeleniumBasics;
		

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		/*
		 * Select drpCountry = new Select(driver.findElement(By.name("country")));
		 * drpCountry.selectByVisibleText("ANTARCTICA"); Thread.sleep(2000);
		 * drpCountry.selectByIndex(7); Thread.sleep(2000);
		 * drpCountry.selectByValue("ARUBA");
		 */
		 
		
		// using  Weblement case
		
		  WebElement dp = driver.findElementByName("country");
		  Select con = new  Select(dp);
		  con.selectByVisibleText("ANTARCTICA");
		  
		  Thread.sleep(2000);
		  con.selectByIndex(7); 
		  Thread.sleep(2000);
		  con.selectByValue("ARUBA");
		  driver.close();		
	}

}


























//driver.get("https://www.toolsqa.com/automation-practice-form");
//driver.manage().window().maximize();
//driver.findElementByName("firstname").sendKeys("Siva S");
//driver.findElementByName("lastname").sendKeys("sankar");
//driver.findElementById("sex-0").click();
//driver.findElementById("exp-5").click();
//driver.findElementById("datepicker").sendKeys("29-apr-1992");
//driver.findElementByXPath("//*[@id=\"profession-1\"]").click();
//driver.findElementById("tool-2").click();
//driver.findElementById("continents").click();
//Select drp00 = new Select(driver.findElementById("continents"));
//drp00.deselectAll();
//Thread.sleep(2000);
//Select drp01 = new Select(driver.findElementById("continents"));
//drp00.selectByVisibleText("Australia");
//driver.findElementById("selenium_commands").click();
//Select SC = new Select(driver.findElementById("selenium_commands"));
	//SC.selectByIndex(3);
	//Thread.sleep(2000);
	//System.out.println("Page Title Is : " + driver.getTitle());
//	driver.quit()
