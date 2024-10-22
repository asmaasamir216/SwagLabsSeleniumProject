package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.LogoutPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test(priority = 0)
    public void loginphase(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.OpenUrl();
            loginPage.login("standard_user","secret_sauce");
            Assert.assertEquals(loginPage.getHomePageLogo(),"Swag Labs");

    }
    @Test(priority = 1)
    public void Logout() {
        LogoutPage logoutPage= new LogoutPage(driver);
        logoutPage.logout();
        Assert.assertEquals(logoutPage.getLoginPageLogo(),"Swag Labs");

    }

}
