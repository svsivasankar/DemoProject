package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		WebElement rgt = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rgt).perform();// right click the right click button 
		
		WebElement paste = driver.findElement(By.cssSelector(".context-menu-icon-paste"));
		paste.click(); //selet the paste option 
		// handling alerts 
		Alert alert= driver.switchTo().alert(); // switch to alert 
		String st = driver.switchTo().alert().getText(); // get the text from the alert 
		System.out.println("alert is " + st); // displays the alert 
		Thread.sleep(2000);
		alert.accept(); //accept it
		
		WebElement dbclck = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		action.doubleClick(dbclck).build().perform();
		Alert al = driver.switchTo().alert();
		String st1 = driver.switchTo().alert().getText();
		System.out.println("double click: " + st1);
		Thread.sleep(2000);
		al.accept();
		
		driver.close();
		
		
		
		
	}

}
