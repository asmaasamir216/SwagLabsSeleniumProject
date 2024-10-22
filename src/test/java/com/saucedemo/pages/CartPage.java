package com.saucedemo.pages;

import com.saucedemo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[data-test=\"shopping-cart-link\"]")
    private WebElement ShoppingCart;
    @FindBy(id = "continue-shopping")
    private WebElement ContinueShoppingButton;
    @FindBy(css="[data-test=\"title\"]")
    private WebElement ProductTitle;
    @FindBy(css="[data-test=\"shopping-cart-link\"]")
    private WebElement CartItemsNumber;
    public void OpenShoppingCart(){
        ShoppingCart.click();
    }
    public void ContinueShopping(){
        ContinueShoppingButton.click();
    }
    public String getProductsPageTitle(){

        return ProductTitle.getText();
    }
    public boolean getCartItemsNumber(){
        return CartItemsNumber.isDisplayed();
    }

}
