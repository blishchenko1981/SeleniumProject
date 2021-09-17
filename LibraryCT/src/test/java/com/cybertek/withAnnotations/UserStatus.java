package com.cybertek.withAnnotations;

import com.cybertek.Utility.TestBase;
import com.cybertek.Utility.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserStatus extends TestBase
{

    ArrayList<String> librarians;
    public static String password = "Sdet2022*";


    @BeforeEach
    public void setUpList() {

        librarians = new ArrayList<>();
        librarians.add("librarian43@library");
        librarians.add("librarian18@library");

    }

    @Test

    public void testUserStatus() {

        for (int i = 0; i < librarians.size()-1; i++) {



            driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.id("inputEmail")).sendKeys(librarians.get(i));
            driver.findElement(By.id("inputPassword")).sendKeys(password);
            driver.findElement(By.cssSelector("button[type='submit']")).click();


            driver.findElement(By.xpath("//li[2]/a")).click();


            //And librarian click Status dropdown
            driver.findElement(By.xpath("//select[@id='user_status']")).click();

            // Then verify there are 2 status options


            List<WebElement> status = driver.findElements(By.xpath("//select[@id='user_status']/option"));
            System.out.println("status.size() = " + status.size() + " "+(i+1) +"- case ");

            Assertions.assertTrue(status.size() == 2);

            //    And user click Log Out

            WebElement usernameLink = driver.findElement(By.cssSelector("li>a[href='#']"));
            usernameLink.click();



            WebElement logOutLink = driver.findElement(By.cssSelector("div>a[href='#']"));
            logOutLink.click();
        }

    }
}