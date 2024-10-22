package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test(priority = 0)
    public void LoginPhase() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.OpenUrl();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(loginPage.getHomePageLogo(), "Swag Labs");
    }

    @Test(priority = 1)
    public void openshoppingcart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.OpenShoppingCart();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(cartPage.getProductsPageTitle(), "Your Cart");
        cartPage.ContinueShopping();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(cartPage.getProductsPageTitle(), "Products");

    }
}
