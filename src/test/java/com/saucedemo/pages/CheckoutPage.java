package com.saucedemo.pages;

import com.saucedemo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "checkout")
    private WebElement CheckoutButton;
    @FindBy(css = "[data-test=\"firstName\"]")
    private WebElement FirstName;
    @FindBy(css = "[data-test=\"lastName\"]")
    private WebElement LastName;
    @FindBy(css = "[data-test=\"postalCode\"]")
    private WebElement PostalCode;
    @FindBy(css = "[data-test=\"continue\"]")
    private WebElement ContinueButton;
    @FindBy(id = "cancel")
    private WebElement CancelButton;
    @FindBy(css = "[data-test=\"finish\"]")
    private WebElement FinishCheckoutButton;
    @FindBy(id = "back-to-products")
    private WebElement BackHomeButton;
    @FindBy(css = "[data-test=\"complete-header\"]")
    private WebElement CheckoutConfirmMsg;
    public void checkout(){
        CheckoutButton.click();
        FirstName.sendKeys("standard");
        LastName.sendKeys("user");
        PostalCode.sendKeys("11223");
        ContinueButton.click();
        FinishCheckoutButton.click();
    }
    public String getOrderConfirmTitle(){
        return CheckoutConfirmMsg.getText();
    }
    public void BacktoProducts(){
        BackHomeButton.click();
    }



}
