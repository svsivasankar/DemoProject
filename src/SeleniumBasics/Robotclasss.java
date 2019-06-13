package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class Robotclasss {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver();
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
		driver.manage().window().maximize();
		Thread.sleep(3000);
        driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
        Robot robot = new Robot();  // Robot class throws AWT Exception	
        robot.mouseMove(630, 420); // move mouse point to specific location	
        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step	
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click	
        robot.delay(1500);	
        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
        
  }	 


}
