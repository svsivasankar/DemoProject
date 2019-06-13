package SeleniumBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Untrustedsite {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		 
		// Set ACCEPT_SSL_CERTS variable to true
		 
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		 
		// Set the driver path

		System.setProperty("webdriver.chrome.driver", "./drivers./Chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers./IEDriverServer.exe");
		
		
		WebDriver driver1 = new ChromeDriver(cap);
		WebDriver driver2 = new InternetExplorerDriver(cap);
	
		driver1.get("https://cacert.org/");
		driver2.get("https://cacert.org/");
		
			
		

	}

}
