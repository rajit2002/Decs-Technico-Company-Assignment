package TestCases;


import org.testng.annotations.Test;

import PageObject.SignupPage;
import TestBase.TestBase;

public class TC001_Signuppagefeature extends TestBase {
	
	@Test
	public void verify_signupfeature_withvalidData() throws InterruptedException {
		// TODO Auto-generated method stub
		 
		// Login Page
        SignupPage Sp = new SignupPage(driver);
        
       Sp.setFullname("rajit");
       Sp.setEmail("rajitgautam2222@gmail.com");
       Sp.setPassword("rajit@123");
       Sp.clickSingup();
       Thread.sleep(5);
       
       
        
	}
	
	
	@Test
	public void verify_signupfeature_withinvalidemail() throws InterruptedException {
		// TODO Auto-generated method stub
		 
		// Login Page
        SignupPage Sp = new SignupPage(driver);
        
       Sp.setFullname("rajit");
       Sp.setEmail("rajitga7648465#utam2222@gmail.com");
       Sp.setPassword("rajit@123");
       Sp.clickSingup();
       Thread.sleep(5);
       
         
        
	}

	
	

	@Test
	public void verify_signupfeature_withWeekPassword() throws InterruptedException {
		// TODO Auto-generated method stub
		 
		// Login Page
        SignupPage Sp = new SignupPage(driver);
        
       Sp.setFullname("rajit");
       Sp.setEmail("rajitga7648465#utam2222@gmail.com");
       Sp.setPassword("123456789");
       Sp.clickSingup();
       
       Thread.sleep(5);
       
       
       
        
	}
	
	@Test
	public void verify_signupfeature_withblankemail_inputfield() throws InterruptedException {
		// TODO Auto-generated method stub
		 
		// Login Page
        SignupPage Sp = new SignupPage(driver);
        
       Sp.setFullname("rajit");
       Sp.setEmail(" ");
       Sp.setPassword("123456789");
       Sp.clickSingup();   
       
       
       Thread.sleep(5);
	}

	@Test
	public void verify_signupfeature_withblankpasswordfield() throws InterruptedException {
		// TODO Auto-generated method stub
		 
		// Login Page
        SignupPage Sp = new SignupPage(driver);
        
       Sp.setFullname("rajit");
       Sp.setEmail(" ");
       Sp.setPassword("123456789");
       Sp.clickSingup();
       
       Thread.sleep(5);
            
        
	}

}
