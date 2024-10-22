package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
    @Test(priority = 0)
    public void Login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.OpenUrl();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(loginPage.getHomePageLogo(), "Swag Labs");
    }

    @Test(priority = 1)
    public void additems() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.AddItemToCart();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(productsPage.getCartNumber());
    }
    @Test(priority = 2)
    public void removeitems() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.RemoveItemFromCart();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(productsPage.getEmptyCart());
    }
}
