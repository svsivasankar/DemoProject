package TestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelexec {

	
	  @Test    
	    public void executSessionOne(){
	            //First session of WebDriver
	        System.setProperty("webdriver.chrome.driver","./Drivers\\Chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	            driver.get("http://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            
	        }
	        
	    @Test    
	        public void executeSessionTwo(){
	            //Second session of WebDriver
	        System.setProperty("webdriver.chrome.driver","./Drivers\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("http://10.240.14.20:7104/HRMS/");
	        //find user name text box and fill it
	        //driver.findElement(By.name("uid")).sendKeys("Driver 2");
	        
	        }
	        
	    @Test    
	        public void executSessionThree(){
	            //Third session of WebDriver
	        System.setProperty("webdriver.chrome.driver","./Drivers\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("https://netbanking.hdfcbank.com/netbanking/");
	        //find user name text box and fill it
	        //driver.findElement(By.name("uid")).sendKeys("Driver 3");
	        
	        }  
}
