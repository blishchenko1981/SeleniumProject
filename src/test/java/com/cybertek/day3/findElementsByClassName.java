package com.cybertek.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementsByClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        WebElement elm1 = driver.findElement(By.className("h1y"));


        System.out.println("elm1.getText() = " + elm1.getText());


        //<li class= "list-group-item"> ...</li>
        // identify first element

        WebElement firstLiItem = driver.findElement(By.className("list-group-item"));
        //System.out.println("firstLiItem = " + firstLiItem);

        System.out.println("firstLiItem.getText() = " + firstLiItem.getText());

        // identyfy all li elements with the class name list-group-item
        List<WebElement> allElem = driver.findElements(By.className("list-group-item"));
        System.out.println("allElem.size() = " + allElem.size());

        for (WebElement webElement : allElem) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }


    }
}
