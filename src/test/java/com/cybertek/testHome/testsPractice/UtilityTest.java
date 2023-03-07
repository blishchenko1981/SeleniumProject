package com.cybertek.testHome.testsPractice;

import com.cybertek.testHome.utilityPractice.TestBasePractice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityTest extends TestBasePractice {

    @Test
    public void testYahooSearchHomePage() {

        driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testyahooSearchResultPage() {
        driver.get("https://search.yahoo.com");
        driver.findElement(By.name("p")).sendKeys("selenium" + Keys.ENTER);
        assertTrue(driver.getTitle().startsWith("selenium"));

    }
}
