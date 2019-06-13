package TestNGBasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeponMethod {

	ChromeDriver driver = null;
	String url = "http://10.240.14.20:7104/HRMS/";

	@Test(dependsOnMethods = { "OpenBrowser" })
	public void SignIn() 
	{
		driver.findElementById("UserName").sendKeys("sivsankar");
		driver.findElementById("Password").sendKeys("ibox2014");
		driver.findElementById("submit").click();
		System.out.println("This will execute second (SignIn)" + driver.getCurrentUrl());
	}

	@Test
	public void OpenBrowser() 
	
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("This will execute first (Open Browser)");
	}
	

	@Test(dependsOnMethods = { "SignIn" })
	
	public void LogOut() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("This will execute third (Log Out)");
	}

}


