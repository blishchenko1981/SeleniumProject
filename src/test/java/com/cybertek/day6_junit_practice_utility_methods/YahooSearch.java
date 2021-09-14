package com.cybertek.day6_junit_practice_utility_methods;

import static org.junit.jupiter.api.Assertions.*;

import com.cybertek.Utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class YahooSearch extends TestBase {

    @Test
    public void testYahooSearchHomePage() {
        driver.get("https://search.yahoo.com/");
        String expectedTitle = "Yahoo Search - Web Search";
        String actTitle = driver.getTitle();
        assertEquals(expectedTitle, actTitle);

    }

    @Test
    public void testYahooSearchResultPage() throws InterruptedException {
        driver.get("https://search.yahoo.com/");
        driver.findElement(By.name("p")).sendKeys("selenium" + Keys.ENTER);
        Thread.sleep(2000);
        assertTrue(driver.getTitle().startsWith("selenium"));

        System.out.println("driver.getTitle() = " + driver.getTitle());

    }

}
