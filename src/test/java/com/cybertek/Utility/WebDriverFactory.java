package com.cybertek.Utility;

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
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new  FirefoxDriver();
                break;

            case "edge":
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
