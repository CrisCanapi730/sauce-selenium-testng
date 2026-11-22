package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("[data-test='error']");


    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void open(String url){
        goTo(url);
        waitForTitle("Swag Labs");
        waitForUrl("https://www.saucedemo.com/");
        urlContains("sauce");
    }

    public void login(String username, String password){
        type(this.username, username);
        type(this.password, password);
        click(loginButton);
        waitForTitleContains("Labs");
    }

    public String getErrorMessage(){
        return getText(errorMessage);
    }

    public boolean isLoginFormDisplayed(){
        return isDisplayed(username) && isDisplayed(password) && isDisplayed(loginButton);
    }

}
