package com.saucedemo.pages;

import com.saucedemo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[data-test=\"username\"]")
    private WebElement usernameInput;
    @FindBy(css = "[data-test=\"password\"]")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(className = "app_logo")
    private WebElement logo;
    public void OpenUrl(){
        driver.get("https://www.saucedemo.com/");
    }
    public void login(String username,String pasword){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(pasword);
        loginButton.click();
    }
    public String getHomePageLogo(){
        return logo.getText();
    }

}









//calling the parent instructor BasePage instructor
//3-define elements using @findBy
//4- define methods that do the actions we need in the test case the method take parameters the sendkeys values we want to type it on the text inputs
//the webelement we define in @FindBy
//WebElement.action