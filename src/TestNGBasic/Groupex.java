package TestNGBasic;

import org.testng.annotations.Test;

@Test(groups = {"Alltestcases"})
//@Test
public class Groupex {

	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("test execution 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("test execution 2");
	}
	
	@Test(groups = {"windows.regression"})
	public void test5()
	{
		System.out.println("test execution 55");
	}
	
	@Test(groups = {"linux.regression"})
	public void test6()
	{
		System.out.println("test execution 6");
	}
	
	@Test(groups = {"sanity","regression"})
	public void test3()
	{
		System.out.println("test execution 3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("test execution 4");
	}
}
