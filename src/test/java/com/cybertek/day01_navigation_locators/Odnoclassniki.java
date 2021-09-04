package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odnoclassniki {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://ok.ru");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement namefield = driver.findElement(By.name("st.email"));
        namefield.sendKeys("zar84var");

        WebElement passwordField = driver.findElement(By.id("field_password"));
        passwordField.sendKeys("intel0305");










    }
}
