package com.cybertek.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * this class is meant to be super class
 * to provide driver set up and close browser
 * for its subclasses
 */
public abstract class TestBase {
   protected   WebDriver driver;



    @BeforeEach
    public void setUpWebDriver() {
        //driver = new ChromeDriver();
        driver = Driver.getDriver(); //WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterEach
    public void closeBrowser(){
       // driver.quit();
    Driver.closeBrowser();

    }




}
