package TestNGBasic;

import org.testng.annotations.Test;

public class Attributesexampls {
	
	
	/*
	 * @Test(invocationCount=5) public void test1() throws InterruptedException {
	 * System.out.println("Thread ID: "+Thread.currentThread().getId()); }
	 */

	   

	   @Test(invocationCount = 5,invocationTimeOut = 2000)
	      public void test1() throws InterruptedException
	      {
		   System.out.println("invoationyime out");
	   System.out.println("Thread ID");  
	      }

}



