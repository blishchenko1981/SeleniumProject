package com.cybertek.withAnnotations;

import com.cybertek.Utility.TestBase;
import com.cybertek.Utility.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserStatus extends TestBase {

    ArrayList<String> librarians;
    public static String password = "Sdet2022*";


    @Test

    public void testUserStatus() {
        librarians = new ArrayList<>(Arrays.asList("librarian43@library", "librarian18@library"));
        //driver.get("http://library2.cybertekschool.com/login.html");
        for (int i = 0; i < librarians.size()-1; i++) {
           driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.id("inputEmail")).sendKeys(librarians.get(i));
            driver.findElement(By.id("inputPassword")).sendKeys(password);
            driver.findElement(By.cssSelector("button[type='submit']")).click();


           WebElement users =  driver.findElement(By.xpath("//li[2]/a"));
           users.click();


            //And librarian click Status dropdown
            WebElement userStatus = driver.findElement(By.xpath("//select[@id='user_status']"));
            userStatus.click();
            Select statusOption  = new Select(userStatus);
            List<WebElement> options = statusOption.getOptions();


            // Then verify there are 2 status options


            Assertions.assertTrue(options.size() == 2);

            //    And user click Log Out

            logoutFunction();
        }

    }
}