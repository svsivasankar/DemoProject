package TestNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationsex {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void befclasss() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void befmeth() {
		System.out.println("before method");
	}

	@Test
	public void test1() {
		System.out.println("TestNg concepts 1 it wil");
	}

	@Test
	public void test2() {
		System.out.println("Learning testng concepts 2");
	}

	@AfterMethod
	public void aftmeth() {
		System.out.println("after method");
	}

	@AfterClass
	public void afterclassh() {
		System.out.println("after class");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("Aftersuite Methods Executed Atlast");
	}
}
