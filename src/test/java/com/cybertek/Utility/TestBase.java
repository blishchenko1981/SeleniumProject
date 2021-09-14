package com.cybertek.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * this class is meant to be super class
 * to provide driver set up and close browser
 * for its subclasses
 */
public abstract class TestBase {
   protected   WebDriver driver;

    @BeforeAll
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpWebDriver() {
        //driver = new ChromeDriver();
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }




}
