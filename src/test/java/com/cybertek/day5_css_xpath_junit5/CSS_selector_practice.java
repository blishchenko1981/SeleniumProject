package com.cybertek.day5_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector_practice {


    public static void main(String[] arg) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        // todo: Identify searchbox using CSS selector

        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        //WebElement searchbox = driver.findElement(By.cssSelector("input[name='p']"));
        //  WebElement searchbox = driver.findElement(By.cssSelector("input[id='yschsp']"));
        WebElement searchbox = driver.findElement(By.cssSelector("input[name= 'p'][type='text']"));
        searchbox.sendKeys("CSS selector");

        WebElement clearIcon = driver.findElement(By.cssSelector("button[type='button'][class='sbq-x']"));
        WebElement clearX = driver.findElement(By.cssSelector("button#sbq-clear>span"));

        //clearIcon.click();
        clearX.click();

        searchbox.sendKeys("xPath");

        WebElement search = driver.findElement(By.cssSelector("span[title='Search']"));
        search.click();



        //driver.quit();


    }
}
