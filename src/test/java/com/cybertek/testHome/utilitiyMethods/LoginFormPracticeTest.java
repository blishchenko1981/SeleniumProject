package com.cybertek.testHome.utilitiyMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class LoginFormPracticeTest {

    WebDriver driver;

    @BeforeEach
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/login");

        WebElement header = driver.findElement(By.xpath("//h2[.='Login Page']"));
        System.out.println("header = " + header.getText());

        driver.findElement(By.cssSelector("input[name= 'username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name= 'password']")).sendKeys("SuperSecretPassword");

        // # wooden_spoon
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(1000);

        WebElement successMessage = driver.findElement(By.xpath("//div[@id = 'flash']"));
        String expectedResult = "You logged into a secure area!";

        assertTrue(successMessage.getText().startsWith(expectedResult));

        System.out.println("successMessage.isDisplayed() = " + successMessage.isDisplayed());

        WebElement successMessage2 = driver.findElement(By.xpath("//div[contains(text(), 'You')]"));
        assertTrue(successMessage2.isDisplayed());

    }


}
