package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		
		
		Actions action= new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a")).click();
		action.moveToElement(driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Courses']"))).build().perform();
		
		
		// //*[@id="headermenudesktop"]/ul/li/ul/li[2]/a
		
		
	}
	

}
