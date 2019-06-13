package TestNGBasic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	
	  SoftAssert softAssert = new SoftAssert();
	    @Test
	    public void hardAssertion(){
	        Assert.assertEquals("pass","pass");
	        System.out.println("This line is executed because assertEquals "
	                + "passed as both the strings are same");
	        Assert.assertNull("assertion");
	        System.out.println("Since the object under assertion"
	                + " is not null, the assertion will fail. "
	                + "This line will not be executed");
	    }
	    @Test
	    public void softAssertion(){
	         
	        softAssert.assertNotNull("assertion");
	        System.out.println("We are using Soft assertion in this method,"
	                + " so this line of code will also be executed even if "
	                + "the assetion fails.Wherever we want to execute full "
	                + "testcase/method, we should use SoftAssertion");
	        softAssert.assertAll();
	    }
	/*
	 * SoftAssert softAssert = new SoftAssert(); String className = "SoftAssertion";
	 * 
	 * @Test public void test_UsingSoftAssertion() { softAssert.assertTrue(true ==
	 * true); softAssert.assertEquals("SoftAssert", "SoftAssertion");
	 * softAssert.assertEquals(className, "SoftAssertion");
	 * System.out.println("Last statement gets executed!"); softAssert.assertAll();
	 * }
	 */
	
	
	/*
	 * SoftAssert softAssert1 = new SoftAssert(); SoftAssert softAssert2 = new
	 * SoftAssert(); String className = "SoftAssertion";
	 * 
	 * @Test public void test1_UsingSoftAssertion() { softAssert1.assertTrue(true ==
	 * true); softAssert1.assertEquals("SoftAssert", "SoftAssertion");
	 * softAssert1.assertEquals(className, "SoftAssertion");
	 * softAssert1.assertAll(); }
	 * 
	 * @Test public void test2_UsingSoftAssertion() { softAssert2.assertTrue(true ==
	 * true); softAssert2.assertEquals("SoftAsertion", "SoftAssertion");
	 * softAssert2.assertEquals(className, "SoftAssertion");
	 * softAssert2.assertAll(); }
	 */
	}

