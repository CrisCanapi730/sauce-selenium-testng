package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SidebarPage extends BasePage {
    private final By menuButton = By.id("react-burger-menu-btn");
    private final By logoutButton = By.cssSelector("a[id='logout_sidebar_link']");
    private final By dynamicCatalogButton = By.id("");
    private final By aboutButton = By.cssSelector("[data-teset='logout-sidebar-link']");
    private final By resetButton = By.cssSelector("[data-test='reset-sidebar-link']");

    public SidebarPage(WebDriver driver){
        super(driver);
    }

    public void openMenu(){
        click(menuButton);
    }

    public void logout(){
        click(logoutButton);
    }

    public void resetState(){
        click(resetButton);
    }

    public void clickAbout(){
        click(aboutButton);
    }

}
