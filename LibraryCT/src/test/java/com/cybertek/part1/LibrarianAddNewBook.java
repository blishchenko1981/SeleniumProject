package com.cybertek.part1;

import com.cybertek.Utility.TestBase;
import com.cybertek.Utility.WebOrderUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class LibrarianAddNewBook extends TestBase  {


    @Test
            public void testAddNewBook() throws InterruptedException {
        //     librarian43@library
        //     librarian18@library
        String password = "Sdet2022*";
        ArrayList<String> users = new ArrayList<>();
        users.add("librarian43@library");
        users.add("librarian18@library");


        for (String user : users) {

      // Given librarian is on the homePage

            WebOrderUtility.loginFunction(driver, user, password );

      // When librarian click Books module

            driver.findElement(By.cssSelector("a[href='#books']")).click();

      // And librarian click “+Add Book” button
            driver.findElement(By.cssSelector("a[data-target='#ajax']")).click();

      // When librarian enter BookName, ISBN, Year, Author, and Description
            driver.findElement(By.cssSelector("input[placeholder='Book Name']")).sendKeys("The oldman " +
                    "and the Sea");
            driver.findElement(By.cssSelector("input[placeholder='ISBN']")).sendKeys("12345");
            driver.findElement(By.cssSelector("input[placeholder='Year']")).sendKeys("1952");
            driver.findElement(By.cssSelector("input[placeholder='Author']")).sendKeys("Ernest Hemingway");
            driver.findElement(By.xpath("//*[@id=\"book_group_id\"]/option[3]")).click();
            driver.findElement(By.cssSelector("textarea[id='description']")).sendKeys("Its a short " +
                    "novel written by american author Ernest Hemingway");
            Thread.sleep(2000);
      // And librarian click save changes
            driver.findElement(By.cssSelector("button[type='submit']")).click();




      // Then verify a new book is added ( by check text from green pup up window , that appears for 5 second)

            WebElement confirmMessage = driver.findElement(By.xpath("//div/div[@class= 'toast-message']"));

            Thread.sleep(4000);
            String expectedResult = "The book has been created.";
            String actualResult = confirmMessage.getText();

            Assertions.assertEquals(expectedResult, actualResult);
            Thread.sleep(7000);

            // method to logout from page (extended from TestBase) ;)

            WebOrderUtility.logoutFunction(driver);

        }


    }
}
