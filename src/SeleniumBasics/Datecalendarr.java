package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datecalendarr {
	WebDriver driver ;
		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]").sendKeys("MAA");
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]").sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElementByClassName("custom_date_pic required picker-first home-date-pick valid");
		driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[3]/a").click();
		
		//WebElement src =  driver.findElementByXPath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
		//Select source = new Select(src);
		//source.selectByValue("MAA");		


	}

}
