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

public class IsDisplayedPractice {
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
    public void testErrorMessage() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/registration_form");

        WebElement strLengthErrorElement = driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']"));

        assertFalse(strLengthErrorElement.isDisplayed());
        System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());
        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("a");
        System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());
        assertTrue(strLengthErrorElement.isDisplayed());

    }
}