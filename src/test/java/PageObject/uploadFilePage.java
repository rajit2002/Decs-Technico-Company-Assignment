package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class uploadFilePage extends BasePage{
public uploadFilePage(WebDriver driver) {
		
		super(driver);
	}

@FindBy(xpath ="//input[@type='file']")
WebElement fileUploadInput;


@FindBy(xpath ="//span[@class='chakra-checkbox__control css-1yld03o']")
WebElement PwdCheckbox;



@FindBy(xpath ="//input[@placeholder='Set Password']")
WebElement pwdinput;


@FindBy(xpath ="//button[normalize-space()='Upload File']")
WebElement uploadfilebtn ;




public void setFileupload() {
	fileUploadInput.sendKeys("C:\\Users\\rajit\\Downloads\\summary report.pdf");
}


public void setpwdCheckbox() {
	
	PwdCheckbox.click();
	
}


public void setpw() {
	
	pwdinput.click();
	
}

public void setuploadfilebtn() {
	
	uploadfilebtn.click();
	
}







}
