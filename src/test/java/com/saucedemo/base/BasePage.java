package com.saucedemo.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
































//1-driver
//2-parameterized constructor take parameter driver