package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrmsleavecurrdate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://10.240.14.20:7104/HRMS/");
		driver.manage().window().maximize();

		// driver.findElement(By.id("UserName")).sendKeys("ajith.s");
		// driver.findElementById("Password").sendKeys("ajith123");
		driver.findElement(By.id("UserName")).sendKeys("sivsankar");
		driver.findElementById("Password").sendKeys("ibox2014");
		driver.findElement(By.id("submit")).click();

		driver.findElementByXPath("/html/body/div[1]/div[2]/ul/li[2]/a/span").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[1]/a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"typebutton\"]/label[1]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"fromdatectr\"]/div/div[1]/span/span/span/span").click();
		driver.findElementById("exampleTextarea").sendKeys("head ache");
		driver.findElementById("cancel").click();
		driver.navigate().refresh();
		// driver.navigate().back(); backward
		driver.quit();

	}
}

// webtable concept
// WebElement table =
// driver.findElementByXPath("//*[@id=\"48c59d87-f4ae-4272-8433-e347c407d13e\"]/table/tbody");
// // Table
// List<WebElement> rows =
// table.findElements(By.xpath(("//*[@id='2ed510f1-db4e-463f-a35f-948739eaf689']/table/tbody/tr")));//Select
// the rows and their sizes
// System.out.println(rows.size());
// List<WebElement> TotalColumns =
// table.findElements(By.xpath("//*[@id=\"48c59d87-f4ae-4272-8433-e347c407d13e\"]/table/tbody/tr[1]/td[1]"));//columns
// in rows
// System.out.println(TotalColumns.size());
// WebElement columns = rows.get(0);// selecting the columns
// List<WebElement> cols = columns.findElements(By.tagName("td"));
// System.out.println(columns.getText());
// for (WebElement cells : cols)//taking the choosen date
// {
// if(cells.getText().equalsIgnoreCase("24"));
// {
// System.out.println(cells.getText());
// cells.findElement(By.xpath("//*[@id=\"dce5d10b-c863-4a97-ba0b-49f60652dd01\"]/table/tbody/tr[4]/td[6]/a")).click();
// }
// }

// driver.findElementByClassName("k-link k-nav-next").click();
// WebElement nextclick = (driver.findElementByClassName("k-link k-nav-next"));

// for leave select
// driver.findElementById("fromhalfday").click();
// driver.findElementByXPath("//*[@id=\"halffrom\"]/label[2]").click();
// *[@id="typebutton"]/label[2]
// driver.findElementById("exampleTextarea").sendKeys("Headache");
// Thread.sleep(3000);
// driver.findElementById("cancel").click();

// driver.findElementByClassName("form-check-input").click();// permissoin check
// box
// driver.findElementByXPath("//*[@class='k-icon k-i-calendar']").click();
// sendKeys(Keys.ENTER);
// Thread.sleep(2000);
// driver.findElementByXPath("*[@id=\"typebutton\"]/label[2]").click();
