package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	static protected WebDriver driver;

	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
//	    ChromeDriverInfo.getInstance().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");
		System.out.println("Title : " + driver.getTitle());
	}

	public static void main(String[] args) {
		Headless.setup();
	}
}




