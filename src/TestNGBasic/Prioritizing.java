package TestNGBasic;

import org.testng.annotations.Test;

public class Prioritizing {
	
	 @Test(priority = 2)
	 
	  public void One() {
	 
	      System.out.println("This is the Test Case number 11");
	 
	  }
	 
	  @Test(priority = 1,enabled = false)
	 
	  public void Two() {
	 
	   System.out.println("This is the Test Case number 22");
	 
	  }
	 
	  @Test(priority = 0)
	 
	  public void Three() {
	 
	   System.out.println("This is the Test Case number 33");
	 
	  }
	 
	  @Test(priority = 3)
	 
	  public void Four() {
	 
	   System.out.println("This is the Test Case number 44");
	 
	  }

}
