package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sessionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers./Chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/testng-dependencies/");
		System.out.println("launched successfully "+ driver.getWindowHandle());
		System.out.println("launched successfully "+ driver.getCurrentUrl());
		
		ChromeDriver driver2 = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/testng-dependencies/");
		System.out.println("launched successfully "+ driver.getWindowHandle());
		System.out.println("launched successfully "+ driver.getCurrentUrl());
	}

}
