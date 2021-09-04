package com.cybertek.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetMethod {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
           // identify the link with text "disappearing elements";
        // identify the link with text partial link text then get the full text out

        WebElement myLink = driver.findElement(By.partialLinkText("Disappearing"));
       // System.out.println("myLink.getText() = " + myLink.getText());

        String fullLinkText = myLink.getText();
        System.out.println("fullLinkText = " + fullLinkText);

        // what if I just provide partial link as letter A

        WebElement aLink =  driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());


        driver.quit();
    }
}
