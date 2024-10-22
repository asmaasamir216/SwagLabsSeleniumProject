package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.factory.DriverFactory;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void validlogin(){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.OpenUrl();
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(loginPage.getHomePageLogo(),"Swag Labs");

    }
}
