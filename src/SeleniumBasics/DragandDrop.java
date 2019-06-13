package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement swtframe = driver.findElement(By.xpath("//iFrame[@class='demo-frame']")); 
		driver.switchTo().frame(swtframe);	
		Thread.sleep(2000);
		
		WebElement srcele = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement trele =driver.findElement(By.id("droppable"));
	
		//*iFrame[@class='demo-frame']"));
	
		
		Actions action = new Actions(driver);
		action.clickAndHold(srcele).moveToElement(trele).release().build().perform();
		
	}	

}
