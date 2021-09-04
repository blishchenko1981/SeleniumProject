package com.cybertek.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementBytagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
/*
Purple tagname
Orange attribute name
blue attribute value
black it is the text
 */
// open chrome and navigate to practice sit

// identify first element withtag name a
        WebElement firstLink = driver.findElement(By.tagName("a"));
        // get the text
        System.out.println("firstLink.getText() = " + firstLink.getText());

// find and store all elementsss with <a> tag

        List<WebElement> allATagElements = driver.findElements(By.tagName("a"));
        System.out.println("allATagElements.size() = " + allATagElements.size());

        // iterate over this list, get the text of the link and get attribute and print them out

        for (WebElement allATagElement : allATagElements) {
            System.out.println("allATagElement.getAttribute(\"href\") = " + allATagElement.getAttribute("href"));
            System.out.println("allATagElement.getText() = " + allATagElement.getText());

        }
        //get first element with<h1> tag and get the text out of it

        WebElement firstH1TagElm = driver.findElement(By.tagName("h1"));
        System.out.println("firstH1TagElm.getText() = " + firstH1TagElm.getText());


    }
}
