package SeleniumBasics;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class HRSMSusingmethods {

		static WebDriver driver;
		static String hrmsUrl = "http://10.240.14.20:7104/HRMS/";
		static Actions action;
		static String Month_Year = "May 2019";

		public static void launchBrowser() {
			System.out.println("The Test Case Executing Browser Name is : Chrome");
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(hrmsUrl);
			System.out.println("Browser Has Been Launched Successfully.!");
		}

		public static void loginHRMS() {
			driver.findElement(By.id("UserName")).sendKeys("prakash.r");
			driver.findElement(By.id("Password")).sendKeys("prakash@1992");
			driver.findElement(By.xpath("//input[@name='signin']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			System.out.println("HRMS is logged in Successfully.!");
		}

		public static void LeaveManagement() throws Exception {
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a")).click();
			System.out.println("Leave Managment Is Selected");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//ul[@class='nav-flyout']/li)[1]")).click();
			System.out.println("Leave Request Is Selected");
			Thread.sleep(3000);
		}

		@SuppressWarnings("unused")
		public static void casualLeave() throws Exception {
			driver.findElement(By.xpath("(//div[@id='typebutton']/label)[2]")).click();
			System.out.println("Casual Leave Is Selected");
			System.out.println();

			// From DateGet Calendar
			driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
			System.out.println("From DateGet Is Selected");

			// Get Month & Year
			String getMonthYear = driver.findElement(By.xpath("//*[@aria-live='assertive']")).getAttribute("innerHTML");
			System.out.println("Current Month & Year : " + getMonthYear);
			action = new Actions(driver);
			
			WebElement NextButton = driver.findElement(By.xpath("//a[@class='k-link k-nav-next']"));
			action.moveToElement(NextButton).build().perform();
			action.click(NextButton);
			
			if (!getMonthYear.equalsIgnoreCase(Month_Year)) {
				do {
					driver.findElement(By.xpath("//a[@class='k-link k-nav-next']")).click();
				} while (!driver.findElement(By.xpath("//*[@class='k-link k-nav-fast")).getText().equals(Month_Year));
				System.out.println("Next Month Is Selected");
			}

			// From DateGet Selection
			WebElement FromTable = driver.findElement(By.tagName("table"));
			List<WebElement> FromRows = FromTable.findElements(By.tagName("tr"));
			System.out.println("Total No of rows in From DateGet : " + FromRows.size());
			List<WebElement> FromColumns = FromTable.findElements(By.tagName("td"));
			System.out.println("Total No of columns in From DateGet : " + FromColumns.size());
			for (WebElement cellValues : FromColumns) {
				if (cellValues.getText().equals("15")) {
					cellValues.click();
				}
			}

			// To DateGet Calendar
			driver.findElement(By.xpath("(//span[@role='button'])[3]")).click();
			System.out.println("To DateGet Is Selected");
			System.out.println();

			// Get Month & Year
			String MonthYear = driver.findElement(By.xpath("//*[@aria-live='assertive']")).getAttribute("innerHTML");
			System.out.println("Current Month & Year : " + getMonthYear);
			action = new Actions(driver);
			WebElement ToDateNextButton = driver.findElement(By.xpath("//a[@class='k-link k-nav-next']"));
			action.moveToElement(ToDateNextButton).build().perform();
			action.click(ToDateNextButton);
			
			if (!getMonthYear.equalsIgnoreCase(Month_Year)) {
			do {
					driver.findElement(By.xpath("//a[@class='k-link k-nav-next']")).click();
			} 
			while (!driver.findElement(By.xpath("//*[@class='k-link k-nav-fast")).getText().equals(Month_Year));
				System.out.println("Next Month Is Selected");
			}

			// To DateGet Selection
			WebElement ToTable = driver.findElement(By.tagName("table"));
			List<WebElement> ToRows = ToTable.findElements(By.tagName("tr"));
					//findElements(By.xpath("//*[@id=\"950636a3-9289-421a-805d-364d79197a12\"]/table/tbody/tr[1]"));
					
			System.out.println("Total No of rows in To DateGet : " + ToRows.size());
			List<WebElement> ToColumns = ToTable.findElements(By.tagName("td"));	
			//findElements(By.xpath("//*[@id=\"950636a3-9289-421a-805d-364d79197a12\"]/table/tbody/tr[4]")); 
			System.out.println("Total No of columns in To DateGet : " + ToColumns.size());
			for (WebElement cellValues : ToColumns) {
				String Dates = cellValues.findElement(By.tagName("a")).getAttribute("innerHTML");
				System.out.println(Dates);
				if (cellValues.getText().equals("25")) {
					cellValues.click();
				}
			}

			// Calculate total No of days
			String totalDays = driver.findElement(By.id("totaldays")).getText();
			System.out.println("Total No Of Days Of Leave Is : " + totalDays);
		}

		public static void main(String[] args) throws Exception {

			launchBrowser();
			loginHRMS();
			LeaveManagement();
			casualLeave();

		}
	}


