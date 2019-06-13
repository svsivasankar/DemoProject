package ReportsExtent;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Newreports {

	ExtentHtmlReporter htmlReports;
	ExtentReports extent;
	ExtentTest test;
	ITestResult result;

	@BeforeSuite
	public void setupReport() {

		System.out.println("Report Started to Generate.!");
		htmlReports = new ExtentHtmlReporter("./Reports\\news.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReports);

		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Host Name", "INCHN-WS-485");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Prakash Rajaram");

		htmlReports.config().setReportName("Test Report");
		htmlReports.config().setDocumentTitle("Sample Report");
		htmlReports.config().setTheme(Theme.DARK);
		htmlReports.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReports.config().setChartVisibilityOnOpen(true);
	}

	@Test(priority = 1)
	public void PassTestCase() {
		test = extent.createTest("Login With Valid User Name & Password");
		test.assignCategory("Smoke");
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void FailTestCase() {
		// test = extent.createTest("Fail Test Cases");
		// test = extent.createTest("Login With Invalid User Name & Password");
		test.assignCategory("Sanity");
		Assert.assertTrue(false);
		test.log(Status.PASS, "Test Case (failTest) Status is passed");
	}

	@Test(priority = 3)
	public void SkipTestCase() {
		// test = extent.createTest("Skip Test Cases");
		test = extent.createTest("Skip User Name & Password Test");
		test.assignCategory("Regression");
		throw new SkipException("Skipping - This is not ready for testing");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
		}
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
		System.out.println("Report Generated Succssfully.!");
	}
}


// https://github.com/svsivasankar/DemoProject.git

// cmd line 
// GUI - 


