package SeleniumBasics;



	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
	 
	public class MultipleDropdown {
	  
	 
	 
	    public static void main (String args[]) {
	    	  WebDriver driver;
	        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        WebElement selectList = driver.findElement(By.xpath("//select[@name='cars']"));
	        Select ss = new Select(selectList);
	        ss.selectByVisibleText("Maruti");
	        ss.selectByVisibleText("Toyota");
	        driver.quit();
	    }
	}
	
