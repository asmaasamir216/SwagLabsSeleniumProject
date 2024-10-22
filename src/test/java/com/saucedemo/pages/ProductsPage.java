package com.saucedemo.pages;

import com.saucedemo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement AddtocartButton;
    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElement RemoveFromCartButton;
    @FindBy(css = "[data-test=\"shopping-cart-badge\"]")
    private WebElement CartNumber;
    @FindBy(css="[data-test=\"shopping-cart-link\"]")
    private WebElement EmptyCart;
    public void AddItemToCart(){
        AddtocartButton.click();
    }
    public void RemoveItemFromCart(){
        RemoveFromCartButton.click();

    }
    public boolean getCartNumber(){
        return CartNumber.isDisplayed();
    }
    public boolean getEmptyCart(){
        return EmptyCart.isDisplayed();
    }
}
