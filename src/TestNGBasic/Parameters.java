package TestNGBasic;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameters {
	
	@org.testng.annotations.Parameters({ "browser" }) // here i need to launch hrms site
	@Test
	public void testCaseOne(@Optional String browser) {
		System.out.println("browser passed as :- " + browser);
	}
 
	@org.testng.annotations.Parameters({ "username", "password" }) // myuser name and ur username and my pswd and ur pswd isntead of values ----username is username // wait
	@Test
	public void testCaseTwo(@Optional String username,  @Optional String password) {
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + password);
	}
}


// // ipo namma values la browser irukkula athula hrms website koduthuttu 
// username password la unnoda username pswd and ennod username pswd kodu tha check panna mudiuma ? u mean negative case..? no 




//<!-- <parameter name="browser" value="Chrome" /> -->
//<parameter name="username" value="siva" />
//<parameter name="password" value="sankar" />

//<!-- all the vlaues commented --> itha than comment pannitela aprom antha @optional irukke atha base panni run agutha ? - Yes ipo comment pannitu @Optional kodukalaena error raise agum code change 
// what doubts ? -- Note :
// Point 1 - if we passed the values in Parameter we can't run the program, here
// directly, we have mentione parameter as optional -
// Ithu oru concept - ok va ? inga run panna mudiyathu panna error adikum.. ok
// ipo inga iruthae epadi run pandrathu...atha 2nd scenario
// we have one attributs name as @Optional
// @Optional mentuon panna first value irukka nu testnG.xml file check pannum,- so values irutha eduthukum illena athu null nu assing pannikum /
// first value means ni etha soldra  value="siva" ithaya - yes 1 st preference for xml file if not available then it is null shown
// got it ? --
/*
 * String url="http://10.240.14.20:7104/HRMS/";
 * 
 * 
 * @Test public void launch() {
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\Bootloader\\Projects\\Drivers\\Chromedriver.exe");
 * WebDriver driver = new ChromeDriver(); driver.get(url); }
 * 
 * @org.testng.annotations.Parameters({ "username","password" })
 * 
 * @Test public void login(String username,String password) {
 * 
 * 
 * }
 */
