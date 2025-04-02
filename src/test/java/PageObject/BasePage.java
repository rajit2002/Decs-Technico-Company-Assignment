package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;  // Change from 'WebDriver driver;' to 'protected WebDriver driver;'

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);     
        
    
        
    }
}
