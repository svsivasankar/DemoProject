package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanAlerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		Alert alert0 = driver.switchTo().alert(); // String te =
		driver.switchTo().alert().getText();
		System.out.println("simplert alert press ok  :" + alert0.getText());
		alert0.dismiss();

		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Alert alert1 = driver.switchTo().alert();// handling the simple alert dismiss
		String tex = driver.switchTo().alert().getText();// get the text from the alert
		System.out.println("confirmation alert press ok and get text from the alert :" + tex);
		// print the alert
		Thread.sleep(2000);
		alert1.accept();

		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		String text = "India ";
		alert.sendKeys(text);

		// driver.switchTo().alert().sendKeys("India");
		// driver.switchTo().alert().sendKeys("Test");
		// System.out.println("sendkeys using :" + alert2.getText());
		// alert2.accept();

		// Ne ella java class files package vitu veliya eduthu vachu irukka atha run agala.. elamae package kulla irukanum... apo tha run agum...
		////  athu ellam folder kulla irukku so access modifer ku complie panu pothu enga iruku nu theriyathu.. so atha epdi correct pandrathu ?
		// atha yen veliya eduthu pottu irukka ?? etha soldra enaku puriyala -- na select panni irukken paru left side la 5 folder atha na pathen na atha enna pannaenu enaku therila 
		// apadi pana koodathu epavuthumae oru package kulla vachu tha run pannum... like default package kulla java lcass files irukku paru aatha ya soldra ?
	}

}



// Now am going to create new project and add the testNG framework ok va
// Now Project is create with structure, don't delete or change anything
// Nowe have to crreate a pakcage... athu src folder kulla tha create pannanum --- itha right veliya create panna koodathu -- now going create one package ? -- ok
// angayae click pani kodukalam no proble... ethu ella frequent ne use pandriyoo athu anga list add agidum... 
// Pcakge created -- ipo nee entha class file create pannalum antha package kulla tha create pannum... apo tha execute agum... got it anydoubt..? ok wait 
