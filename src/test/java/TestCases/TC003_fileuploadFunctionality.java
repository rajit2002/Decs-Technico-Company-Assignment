package TestCases;

import org.testng.annotations.Test;

import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.uploadFilePage;
import TestBase.TestBase;

public class TC003_fileuploadFunctionality extends TestBase {
	

	@Test 
	public void verifylogin_withvaliddata() throws InterruptedException {
//		... Home page....
		
		Homepage hp = new Homepage(driver);
		
		hp.SetLoginTextbtn();
//		...Login page.......
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail("rajitgautam2002@gmail.com");
		lp.setPassword("rajit@123");
		lp.setloginbtn();
		
		Thread.sleep(8);
	}
	
	
//	.......upload file...........
	uploadFilePage uplP = new uploadFilePage(driver);
	  

	
	
	
	
	
	
	
	
	
	
}
