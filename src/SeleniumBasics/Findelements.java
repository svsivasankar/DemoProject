package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://demo.guru99.com/test/ajax.html");
		    List<WebElement> elements = driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("id"));

		  }}
	}

// Find the radio button for �No� using its ID and click on it
//driver.findElement(By.id("no")).click();
	
//Click on Check Button
//driver.findElement(By.id("buttoncheck")).click();