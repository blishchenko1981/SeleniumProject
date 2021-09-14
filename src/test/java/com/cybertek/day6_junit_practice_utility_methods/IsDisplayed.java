package com.cybertek.day6_junit_practice_utility_methods;
import static org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    WebDriver driver;

    @BeforeAll
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpWebDriver() {
        driver = new ChromeDriver();
    }
    @AfterEach
    public void closeBrowser(){
        // driver.quit();
    }

//identify error message exist but not displayed

//   small[data-bv-for='firstname'][data-bv-validator='stringLength]
//   //small[.='first name must be more than 2 and less than 64 characters long']

@Test

    public  void testErrorMessage(){
        driver.get("http://practice.cybertekschool.com/registration_form");
        String xpth = "//small[.='first name must be more than 2 and less than 64 characters long']";
        // this element exist in html but its hidden not displayed on the screen
   // it will only displayed when there is an input validation error like less 2 or more than 64 chars in this case




    WebElement strLengthErrorElement = driver.findElement(By.xpath(xpth));
    System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());

    assertTrue( ! strLengthErrorElement.isDisplayed());
    assertFalse(strLengthErrorElement.isDisplayed());


    WebElement firstNameField = driver.findElement(By.name("firstname"));
    firstNameField.sendKeys("a");
    System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());

    assertTrue( strLengthErrorElement.isDisplayed());
}




}
