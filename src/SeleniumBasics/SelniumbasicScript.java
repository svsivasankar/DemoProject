package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelniumbasicScript {

	WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Page Title Is : " + driver.getTitle());
		driver.navigate().to("https://demo.guru99.com");
		System.out.println("current url of the page :" + driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle()); // used to  get the runtime generated page id 
		driver.close();
		
	}
}

// Avolothan next learn one by one concepts... Keep file name as concept name so only we can identify easy later...----ok da i will ask any doubts if i have ...---Sure welcome... 



//List <WebElement> namedisp =(List<WebElement>) driver.findElementByXPath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/input");
//for(WebElement el :namedisp);
//{
//	System.out.println(el.getAttribute);
//}



