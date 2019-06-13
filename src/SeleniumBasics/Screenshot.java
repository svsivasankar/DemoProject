package SeleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://www.google.com";
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		/*
		 * Date d = new Date(); System.out.println(d.toString()); SimpleDateFormat sdf =
		 * new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		 */

		int maxLimit = 10;// 
			for (int i = 0; i < maxLimit; i++) {
			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr, new File("./Screenshots\\" + System.currentTimeMillis() + ".png"));
			int Count = i + 1;
			System.out.println(Count + " Screenshot Is Taken");
		}
		driver.quit(); // neria window irukkua mathiri ethum site theriyuma// theriuyala ya try in google.. i will check share the link  
		// okay fine carrry on ya ok 
	}//--any other issues..? no now il check and tell you il stop sharing  
	
}