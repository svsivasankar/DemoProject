package SeleniumBasics;

import java.util.function.BooleanSupplier;

import javax.print.attribute.standard.PresentationDirection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrmsapp_permission {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		 //ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://10.240.14.20:7104/HRMS/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("UserName")).sendKeys("sivsankar");
		driver.findElement(By.id("UserName")).sendKeys("ajith.s");
		//driver.findElementById("Password").sendKeys("ibox2014");
		driver.findElementById("Password").sendKeys("ajith123");
		//driver.findElementByClassName("btn btn-primary btn-block editmode noquery").click();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		//driver.findElementByName("Leave Management").click();
		driver.findElementByXPath("/html/body/div[1]/div[2]/ul/li[2]/a/span").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[1]/a").click();
		Thread.sleep(3000);
		driver.findElementByClassName("form-check-input").click();
		driver.findElementByXPath("//*[@class='k-icon k-i-calendar']").click();
		//sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"fromdatectr\"]//following::span[7]").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("//*[@id=\"infoTemplate\"]//following::div[7]/ul/li[33]").click(); // afternoon 4.30 pm 
		driver.findElementByXPath("//*[@id=\"infoTemplate\"]//following::div[7]/ul/li[20]").click();
		Thread.sleep(2000);
		//driver.findElementByXPath("//*[@id=\"todatectr\"]//following::span[8]").click();
		driver.findElementByXPath("//*[@id=\"todatectr\"]/div/div[2]/span/span/span/span").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"popupNotification\"]//following::div[10]/ul/li[5]").click();
		//driver.findElementByXPath("//*[@id=\"popupNotification\"]//following::div[10]/ul/li[5]").click(); // afternoon 6.30 pm
		Thread.sleep(2000);
		driver.findElementById("exampleTextarea").sendKeys("Personal work");
		Thread.sleep(2000);
		driver.findElementById("cancel").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Logout").click();
		Thread.sleep(2000);
		driver.quit();
	}

}


// for applying leave on a current date 

//
