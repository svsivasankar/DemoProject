package TestNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Counttimeout
{
String url ="https://stqatools.com/selenium/";

	
//@Test
//(invocationCount = 2,invocationTimeOut =30000)
@Test(invocationCount = 3,invocationTimeOut = 30000)
public void launch()
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	
}}

//