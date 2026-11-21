package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccessfully(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(loginPage.getUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void loginFail(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open("https://www.saucedemo.com/");
        loginPage.login("standard_user", "incorrect");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }
}
