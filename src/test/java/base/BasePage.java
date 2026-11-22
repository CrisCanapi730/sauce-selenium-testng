package base;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goTo(String url){
        driver.get(url);
    }
    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void type(By locator, String text){
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        el.clear();
        el.sendKeys(text);
    }

    public void waitForTitle(String title){
        wait.until(ExpectedConditions.titleIs(title));
    }

    public void waitForTitleContains(String title){
        wait.until(ExpectedConditions.titleContains(title));
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getText(By locator){
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return el.getText();
    }

    public void waitForUrl(String url){
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void urlContains(String url){
        wait.until(ExpectedConditions.urlContains(url));
    }

    public boolean isDisplayed(By locator){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        }catch(TimeoutException e){
            return false;
        }
    }
}

