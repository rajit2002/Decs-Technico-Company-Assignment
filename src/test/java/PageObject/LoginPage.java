package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

public LoginPage(WebDriver driver) {
		
		super(driver);
	}


@FindBy(xpath ="//input[@placeholder=\"example@gmail.com\"][@class=\"chakra-input css-1edpeuw\"]")
WebElement Email;

@FindBy(xpath="//input[@id='field-:r8:']")
WebElement Password;
	

@FindBy(xpath="//button[normalize-space()='Login']")
WebElement loginbtn;
	




public void setEmail(String emai) {
	Email.sendKeys(emai);
		
}

public void setPassword(String pwd) {
	Email.sendKeys(pwd);
		
}


public void setloginbtn() {
	loginbtn.click();
		
}



}
