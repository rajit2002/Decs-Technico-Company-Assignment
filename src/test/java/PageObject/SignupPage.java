package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

	public SignupPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath ="//input[@placeholder=\'Enter Your Full Name\']")
	WebElement fullname;
	
	@FindBy(xpath="//input[@placeholder='example@gmail.com']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder=\'Enter Your Password\']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement signupbtn;
	
	
	
	public void setFullname(String name) {
		fullname.sendKeys(name);
			
	}
	
public void setEmail(String emai) {
	email.sendKeys(emai);
	
	}

public void setPassword(String pwd) {
	password.sendKeys(pwd);
	
	}


public void clickSingup() {
	signupbtn.click();
	
}

}
