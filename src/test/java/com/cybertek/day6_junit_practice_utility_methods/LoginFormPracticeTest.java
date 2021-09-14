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

public class LoginFormPracticeTest {
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
        driver.quit();
    }



@Test
    public void testLogin() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/login");


    WebElement header = driver.findElement(By.xpath("//h2[.='Login Page']"));
    System.out.println("header.getText() = " + header.getText());

    driver.findElement(By.cssSelector("input[name = 'username']")).sendKeys("tomsmith");
    driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("SuperSecretPassword");

    //
    driver.findElement(By.id("wooden_spoon")).click();

    Thread.sleep(3000);
    WebElement successMes = driver.findElement(By.xpath("//div[@id = 'flash']"));
    String expectedResult = "You logged into a secure area!";

    assertTrue(successMes.getText().startsWith(expectedResult));
           //div[contains(text(), 'You logged into a secure area!')]  way to find location by using CONTAINS XPATH;


    //use isDisplay() method to check an element is displayed on the screen
    // its onlyused for an element that you have
    System.out.println("successMes.isDisplayed() = " + successMes.isDisplayed());
    String xpath = "//div[contains(text(), 'You logged into a secure area!')]";
    WebElement successMsg2  = driver.findElement(By.xpath(xpath));
    assertTrue(successMsg2.isDisplayed());

}




}
