package com.cybertek.testHome.junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;


public class YahooSearchPageTest {
    // write 2 tests: navigate  https://search.yahoo.com and verify the title
    //                navigate to yahoo and search for Selenium, the title should start with "Selenium".

    WebDriver driver;

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void testYahooSearchHomePageTitle() {
        driver.navigate().to("https://search.yahoo.com");

        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void testYahooSearchTitle() {
        driver.navigate().to("https://search.yahoo.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name = 'p']"));
        searchBox.sendKeys("Selenium" + Keys.ENTER);

        String expectedTitleStartWith = "Selenium";
        String actual = driver.getTitle();
        assertTrue(actual.startsWith(expectedTitleStartWith));
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
