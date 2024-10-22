package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test(priority = 0)
    public void loginphase() {
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
    public void shoppingcart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.OpenShoppingCart();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(cartPage.getProductsPageTitle(), "Your Cart");
    }
    @Test(priority = 3)
    public void checkout() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkout();
        Assert.assertEquals(checkoutPage.getOrderConfirmTitle(), "Thank you for your order!");
        checkoutPage.BacktoProducts();
    }
    @Test(priority = 4)
    public void backtohome() {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getProductsPageTitle(), "Products");
    }
}
