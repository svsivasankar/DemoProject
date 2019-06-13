package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class Winexample {

		
		static ChromeDriver driver = new ChromeDriver();
		static String url ="https://demo.stqatools.com/Windows.php";
		
		
		public static void login()
		
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("Brwser launched successfully");
	    }
		public static void click()
		{
			int max= 5;
			for (int i=0 ;i<max; i++)
			{			
			driver.findElementByXPath("//*[@class='container']/div/div[2]/a/button").click();
			String mainw = driver.getWindowHandle();
			List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(tabs.size());
			int Count =i+1;
			}
		
		}
		
		public static void main(String args[])
		{
			login();
			click();
			
		}
		
	
}
