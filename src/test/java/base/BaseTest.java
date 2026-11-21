package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/cristiancanapi/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
