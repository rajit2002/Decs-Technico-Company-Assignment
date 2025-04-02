package TestBase;


import java.time.Duration;

import java.util.Properties;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.Logger;



public class TestBase {

    public static WebDriver driver;
    public Logger logger;
    public Properties p;

    @BeforeClass()
    public void setup() {
       

        // Initialize Chrome WebDriver
        driver = new ChromeDriver();
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://file-sharing-application.netlify.app/signup");
        driver.manage().window().maximize();
       
    }

    @AfterClass()
    public void tearDown() {
        if (driver != null) {
            driver.quit();
          
        }
    }
}
   