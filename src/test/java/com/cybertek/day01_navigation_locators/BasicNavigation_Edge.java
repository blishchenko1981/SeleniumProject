package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation_Edge {
    public static void main(String[] args) {

        // 1. set up firefox driver

        WebDriverManager.edgedriver().setup();
        // 2. create webdriver instance using FirefoxDriver object
        WebDriver driver = new EdgeDriver();

        System.out.println("About to start Edge Browser");
        // 3. navigate. https://cybertekschool.com
        driver.get("https://cybertekschool.com");
        System.out.println("About to quit");
        driver.quit();


    }
}
