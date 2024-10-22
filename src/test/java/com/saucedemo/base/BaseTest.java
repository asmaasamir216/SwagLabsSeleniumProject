package com.saucedemo.base;

import com.saucedemo.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    @BeforeTest
    public void setup(){
        driver=new DriverFactory().InitializeDriver();
    }
    @AfterTest
    public void End(){
        driver.quit();
    }
}
