package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"container\"]/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img").click();
		
		String mainwindow = driver.getWindowHandle(); 
		List<String> tabSwitch = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabSwitch.size());
		
		for(String urlverifi : tabSwitch) {
			String loginPage = driver.switchTo().window(urlverifi).getTitle();
			if(loginPage.contains("login")) {
				driver.switchTo().window(urlverifi);
			}
		}	
		
		driver.switchTo().window(mainwindow);
		Thread.sleep(2000);
		
			
		/*
		 * //
		 * 	DesiredCapabilities cab = new DesiredCapabilities().chrome();
		cab.setAcceptInsecureCerts(true);
		cab.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cab.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ChromeOptions options = new ChromeOptions();
		options.merge(cab);
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		 * 
		 * }
		 * 
		 */
		
	}

}

