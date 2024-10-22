package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest {
    @Test (priority = 0)
    public void login(){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.OpenUrl();
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(loginPage.getHomePageLogo(),"Swag Labs");
    }
    @Test (priority = 1)
    public void buyItems(){
        ProductsPage productsPage= new ProductsPage(driver);
        productsPage.AddItemToCart();
        Assert.assertTrue(productsPage.getCartNumber());
    }
    @Test(priority = 2)
    public void shoppingCart(){
        CartPage cartPage= new CartPage(driver);
        cartPage.OpenShoppingCart();
        Assert.assertEquals(cartPage.getProductsPageTitle(),"Your Cart");
    }
    @Test(priority = 3)
    public void checkoutProcess(){
        CheckoutPage checkoutPage= new CheckoutPage(driver);
        checkoutPage.checkout();
        Assert.assertEquals(checkoutPage.getOrderConfirmTitle(), "Thank you for your order!");
        checkoutPage.BacktoProducts();
    }
    @Test(priority =4 )
    public void backtoproducts(){
        CartPage cartPage= new CartPage(driver);
        Assert.assertEquals(cartPage.getProductsPageTitle(), "Products");
    }
    @Test(priority = 4)
    public void logout(){
        LogoutPage logoutPage= new LogoutPage(driver);
        logoutPage.logout();
        Assert.assertEquals(logoutPage.getLoginPageLogo(),"Swag Labs");
    }
}
