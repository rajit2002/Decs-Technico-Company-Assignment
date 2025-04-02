package TestCases;

import org.testng.annotations.Test;

import PageObject.Homepage;
import PageObject.LoginPage;
import TestBase.TestBase;

public class TC002Loginfeature extends TestBase{
	
	@Test 
	public void verifylogin_withvaliddata() {
//		... Home page....
		
		Homepage hp = new Homepage(driver);
		
		hp.SetLoginTextbtn();
//		...Login page.......
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail("rajitgautam2002@gmail.com");
		lp.setPassword("rajit@123");
		lp.setloginbtn();
	}
	
	
}
