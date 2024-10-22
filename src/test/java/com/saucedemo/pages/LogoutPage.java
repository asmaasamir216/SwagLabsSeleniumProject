package com.saucedemo.pages;

import com.saucedemo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id="logout_sidebar_link")
    private WebElement logoutButton;
    @FindBy(className = "login_logo")
    private WebElement LoginLogo;
    public void logout(){
        menu.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logoutButton.click();
    }
    public String getLoginPageLogo(){
        return LoginLogo.getText();
    }
}
