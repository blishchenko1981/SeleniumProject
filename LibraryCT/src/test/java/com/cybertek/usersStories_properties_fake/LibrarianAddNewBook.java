package com.cybertek.usersStories_properties_fake;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.LibraryUtility;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class LibrarianAddNewBook extends TestBase {



        @Test
        public void testAddNewBook() {
            //     librarian43@library
            //     librarian18@library
            String password = "Sdet2022*";


            ArrayList<String> librarians = new ArrayList<>();
            librarians.add(ConfigReader.read("librarian1"));
            librarians.add(ConfigReader.read("librarian2"));


            for (String librarian : librarians) {

                // Given librarian is on the homePage

                LibraryUtility.goToLoginPage();
                LibraryUtility.loginFunction(librarian);

                // When librarian click Books module

                driver.findElement(By.cssSelector("a[href='#books']")).click();

                // And librarian click “+Add Book” button
                driver.findElement(By.cssSelector("a[data-target='#ajax']")).click();

                Faker faker = new Faker();

                // When librarian enter BookName, ISBN, Year, Author, and Description
                driver.findElement(By.cssSelector("input[placeholder='Book Name']")).sendKeys(faker.book().title());
                driver.findElement(By.cssSelector("input[placeholder='ISBN']")).sendKeys(faker.numerify("33333"));
                driver.findElement(By.cssSelector("input[placeholder='Year']")).sendKeys(faker.numerify("####"));
                driver.findElement(By.cssSelector("input[placeholder='Author']")).sendKeys(faker.book().author());
                driver.findElement(By.xpath("//*[@id=\"book_group_id\"]/option[3]")).click();
                driver.findElement(By.cssSelector("textarea[id='description']")).sendKeys(faker.book().publisher());

                BrowserUtil.waitFor(3);
                // And librarian click save changes
                driver.findElement(By.cssSelector("button[type='submit']")).click();

                // Then verify a new book is added ( by check text from green pup up window , that appears for 5 second)

                WebElement confirmMessage = driver.findElement(By.xpath("//div/div[@class= 'toast-message']"));

                String expectedResult = "The book has been created.";
                String actualResult = confirmMessage.getText();

                Assertions.assertEquals(expectedResult, actualResult);
                BrowserUtil.waitFor(6);

                // method to logout from page (extended from TestBase) ;)
                LibraryUtility.logoutFunction();

            }


        }
    }


