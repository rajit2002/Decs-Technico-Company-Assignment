package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	
public Homepage(WebDriver driver) {
		
		super(driver);
	}

@FindBy(xpath ="//span[normalize-space()='Login']")
WebElement logintextbtn;


public void SetLoginTextbtn() {
	logintextbtn.click();
	
	
	
}


}
