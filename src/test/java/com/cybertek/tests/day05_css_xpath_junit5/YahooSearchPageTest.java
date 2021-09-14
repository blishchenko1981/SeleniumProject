package com.cybertek.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPageTest {

    WebDriver driver;

    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpWebDriver(){
        driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void doneTesting (){
        System.out.println("Done testing , we can go home now");
    }


    // navigate to https://search.yahoo.com
    // test when u navigate to yahoo search page the title should be
    // "Yahoo Search - Web Search"

    @Test
    public void testYahooSearchHomePageTitle(){

        String expectedTitle = "Yahoo Search - Web Search";
        String actualResult = driver.getTitle();

        assertEquals(expectedTitle, actualResult);

    }

    // test navigate to yahoo page
    // and search for Selenium
    // the page title start with selenium

    @Test
public  void YahooSearchResultPageTitle(){


    // identify search box , enter seleniumand hit ENTER key on keyboard;

    WebElement searchBox = driver.findElement(By.xpath("//input[@name='p']"));
    searchBox.sendKeys("Selenium" + Keys.ENTER);

    String expectedTitleStartWith = "Selenium";
    String actualTitle = driver.getTitle();

    assertTrue(expectedTitleStartWith.startsWith("Selenium"));




}
}
