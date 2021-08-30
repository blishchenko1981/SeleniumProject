package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {
    public static void main(String[] args) {

        // 1. set up chrome driver using webdriver manager
        // so selenium can send interaction request
        WebDriverManager.chromedriver().setup();
        //2. create webdriver ivstavce using Chrome Driver object
        WebDriver driver = new ChromeDriver();

        // 3. Navigate to the page

        driver.get("https://google.com");
        driver.get("https://odnoklassniki.ru");
        driver.get("https://ok.ru/video/2593722927845");

    }
}
