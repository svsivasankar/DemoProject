package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		String mainwindow = driver.getWindowHandle(); // see here we are getting string of 1st Main Tab --mainwindow 
		System.out.println("Main Window Name : " + mainwindow);

		List<String> wins = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Total Windows : " + wins.size());

		for (String neww : wins) {
			driver.switchTo().frame("_mN_main_224278574_0_n");
			driver.findElement(By.id("dk1")).click();
			String page = driver.switchTo().window(neww).getTitle();
			if (page.contains("login")) {
				//driver.switchTo().window(neww);
			}
		}

		//Now i run the program.. see this u r scenario ? ok ? 
		WebElement dwn = driver.findElement(By.xpath("//*[@id='rt-mainbody']/div/article/h3[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dwn);
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a/img")).click();

		List<String> TABS = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Total Windows Now : " + TABS.size());

		for (String neww1 : TABS) {
			String page = driver.switchTo().window(neww1).getTitle();
			System.out.println(page);
			if (page.equals("Guru99.com")) {
//				Thread.sleep(3000);
				driver.close();
				Thread.sleep(2000);
			}
		}
		
		driver.switchTo().window(mainwindow) ;
		Thread.sleep(200);
		//driver.quit();
	}
}





// TestNG installed ? yes  // Now wat u have to ? i need to create  separate folder for testNG concepts...like  selenium basics  
// ok its not folder that is package 



