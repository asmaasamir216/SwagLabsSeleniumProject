package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.FilterPage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest {
    @Test(priority = 0)
    public void loginphase() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.OpenUrl();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(loginPage.getHomePageLogo(), "Swag Labs");
    }

    @Test(priority = 1)
    public void filterbyAtoZ() {
        FilterPage filterPage = new FilterPage(driver);
        filterPage.FilterByNameAtoZ();
        Assert.assertTrue(filterPage.getFirstProduct());
    }

    @Test(priority = 2)
    public void filterbZtoA() {
        FilterPage filterPage = new FilterPage(driver);
        filterPage.FilterByNameZtoA();
        Assert.assertTrue(filterPage.getLastProduct());

    }

    @Test(priority = 3)
    public void filterbylowtohigh() {
        FilterPage filterPage = new FilterPage(driver);
        filterPage.FilterByPriceLowToHigh();
        Assert.assertTrue(filterPage.getLowestPriceProduct());
    }

    @Test(priority = 4)
    public void filterbyhightolow() {
        FilterPage filterPage = new FilterPage(driver);
        filterPage.FilterByPriceHighToLow();
        Assert.assertTrue(filterPage.getHighestPriceProduct());
    }
}




