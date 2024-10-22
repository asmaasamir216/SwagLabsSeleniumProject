package com.saucedemo.pages;

import com.saucedemo.base.BasePage;
import io.cucumber.core.filter.Filters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FilterPage extends BasePage {
    public FilterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-test=\"product-sort-container\"]")
    private WebElement FilterList;
    @FindBy(css = "[value=\"az\"]")
    private WebElement NameAtoZ;
    @FindBy(xpath = "//option[@value=\"za\"]")
    private WebElement NameztoA;
    @FindBy(xpath = "//option[@value=\"lohi\"]")
    private WebElement PriceLowToHigh;
    @FindBy(xpath = "//option[@value=\"hilo\"]")
    private WebElement PriceHighToLow;
    @FindBy(css = "[data-test=\"inventory-item-sauce-labs-backpack-img\"]")
    private WebElement FirstProduct;
    @FindBy (css="[data-test=\"inventory-item-test.allthethings()-t-shirt-(red)-img\"]")
    private WebElement LastProduct;
    @FindBy(css="[data-test=\"inventory-item-sauce-labs-onesie-img\"]")
    private WebElement LowestPriceProduct;
    @FindBy(css = "[data-test=\"inventory-item-sauce-labs-fleece-jacket-img\"]")
    private WebElement HighestPriceProduct;
    Select options = new Select(FilterList);
    public void FilterByNameAtoZ() {
        FilterList.click();
        options.selectByVisibleText("Name (A to Z)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void FilterByNameZtoA() {
        FilterList.click();
        options.selectByVisibleText("Name (Z to A)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void FilterByPriceLowToHigh(){
        FilterList.click();
        options.selectByVisibleText("Price (low to high)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void FilterByPriceHighToLow(){
        FilterList.click();
        options.selectByVisibleText("Price (high to low)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean getFirstProduct(){
        return FirstProduct.isDisplayed();
    }
    public boolean getLastProduct(){
        return LastProduct.isDisplayed();
    }
    public boolean getLowestPriceProduct(){
        return LowestPriceProduct.isDisplayed();
    }
    public boolean getHighestPriceProduct(){
    return HighestPriceProduct.isDisplayed();
    }

}


