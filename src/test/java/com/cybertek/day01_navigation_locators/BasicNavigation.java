package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        //set up chrome driver
        WebDriverManager.chromedriver().setup();
        // create chrome driver object
        WebDriver driver = new ChromeDriver();
        // navigate using get() method or navigate().to()  to https:yahoo.com
        driver.get("https:amazon.com");

// navigate().to()
        driver.navigate().to("http:google.com");
       // driver.navigate().to("http:amazon.com");
        driver.navigate().back();
        driver.navigate().to("http:amazon.com");
        driver.get("http:ok.ru");
        driver.navigate().refresh();


        //closing browser
        /*
        close() , will close current tab
        quit(), will close all tabs if there is more than one
         */


        driver.quit();


    }
}
