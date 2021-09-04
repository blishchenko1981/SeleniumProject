package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_File {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/Vitalii/Desktop/HTML_Class/myFirstPage2.html");


   //     http://localhost:63342/HTML_Class/myFirstPage2.html?_ijt=1ht8qtpkhn2r7qvn899k43m8ri&_ij_reload



    }
}
