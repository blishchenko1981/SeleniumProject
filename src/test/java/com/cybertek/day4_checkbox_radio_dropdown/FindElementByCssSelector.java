package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        //todo: identiry searchbox using CSS selector


        WebElement searchbox = driver.findElement(By.cssSelector("#yschsp"));
     //   WebElement searchbox2 = driver.findElement(By.cssSelector("input[name='p']"));
     //   WebElement searchbox3 = driver.findElement(By.cssSelector("input[id='yschsp']"));
     //   WebElement searchbox4 = driver.findElement(By.cssSelector("input[name = 'p'][type = 'text']"));

        searchbox.sendKeys("css selector");


        // clear search box
        Thread.sleep(2000);
        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();

        searchbox.sendKeys("Xpath");
        WebElement searchIcon = driver.findElement(By.cssSelector("span[title='Search']"));
        searchIcon.click();







    }
}
