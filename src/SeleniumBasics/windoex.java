package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class windoex {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://demo.stqatools.com/Windows.php";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Brwser launched successfully");

		String mainWindowName = driver.getWindowHandle();

		int max = 5;
		for (int i = 0; i < max; i++) {
			driver.findElementByXPath("//button[text() = ' Click to open new Tab ']").click();
			driver.switchTo().window(mainWindowName);
		}

		List<String> totalTabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Total Tabs : " + totalTabs.size());

		for (int j = 0; j < totalTabs.size(); j++) {

			if (j == 2) {
				driver.switchTo().window(totalTabs.get(j));
				driver.close();
				break;
			}
		}
	}
}   
