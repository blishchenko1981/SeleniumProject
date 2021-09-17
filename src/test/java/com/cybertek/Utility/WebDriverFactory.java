package com.cybertek.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

/**
 * method for using different browsers
 *
 */
public class WebDriverFactory {

    public static WebDriver getDriver(String browserName){
        WebDriver driver;

        switch (browserName.toLowerCase().trim()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new  FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                driver = null;
                System.out.println("UNNOWN BROWSER TYPE!!!");



        }

driver.manage().window().maximize();

        return driver;
    }



}
