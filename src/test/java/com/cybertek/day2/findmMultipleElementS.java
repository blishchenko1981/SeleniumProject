package com.cybertek.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class findmMultipleElementS {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //get all the links that have partial text A in it

        List<WebElement> allLink = driver.findElements(By.partialLinkText("A"));

        //get the size of this list so we know how many link with partial text "A"
        System.out.println("allLink.size() = " + allLink.size());

        // get the first item
        for (int i = 0; i < 7; i++) {
            WebElement Item = allLink.get(i);
            System.out.println( i+ "-Item.getText() = " + Item.getText());
        }

        driver.quit();
    }
}
