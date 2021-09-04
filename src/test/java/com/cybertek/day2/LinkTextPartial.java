package com.cybertek.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartial {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        // click on first link
        // WebElement firstLink = driver.findElement(By.linkText("A/B Testing");
        // firstLink.click();
        driver.findElement(By.linkText("A/B Testing")).click();


        //navigate back to home
        driver.navigate().back();
        // maximize the screen
        driver.manage().window().maximize();

        // click on second link
       // driver.findElement(By.partialLinkText("Add/Remove Elements")).click();

        WebElement addOrremove = driver.findElement(By.partialLinkText("Add/Remove"));
        addOrremove.click();
        // click on home link
        driver.findElement(By.linkText("Home")).click();

        Thread.sleep(2000);
        //click redirect link
        driver.findElement(By.linkText("Redirect Link")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
