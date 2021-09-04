package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com/");

        // locate searchbox and enter selenium
        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));
        //enter text inside inputbox element
        searchBox.sendKeys("Selenium");

        // locate searchbotton and click submit

        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        searchBtn.click();
        searchBox.submit();// work with button with a form


        Thread.sleep(5000);


        //driver.quit();

    }
}
