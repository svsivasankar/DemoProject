package SeleniumBasics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findalllinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		List<WebElement> allitems = driver.findElements(By.xpath("//a"));
		System.out.println(allitems.size());
		for (int i = 0; i <= allitems.size(); i = i + 1)
		{
			String urlList = allitems.get(i).getAttribute("href");
			URL myURL = new URL(urlList);
			HttpURLConnection connect = (HttpURLConnection) myURL.openConnection();
			connect.setConnectTimeout(2000);
			connect.connect();
			
			int statusCode = connect.getResponseCode();
			
			
			System.out.println(myURL + " : " + statusCode);
			
			switch (statusCode) 
			{
			case 200:
				System.out.println(myURL + " : " + statusCode);
				break;

			case 201:
				System.out.println(myURL + " : " + statusCode);
				break;

			default:
				break;
			}

		}
	}
}
