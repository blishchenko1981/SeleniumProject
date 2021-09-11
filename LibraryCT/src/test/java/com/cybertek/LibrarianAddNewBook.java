package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class LibrarianAddNewBook {
    public static void main(String[] args) throws InterruptedException {
        //Credentials:
        //     librarian43@library
        //     librarian18@library
        String password = "Sdet2022*";


        ArrayList<String> librarians = new ArrayList<>();
        librarians.add("librarian43@library");
        librarians.add("librarian18@library");


        for (String librarian : librarians) {

//        Given librarian is on the homePage

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://library2.cybertekschool.com/login.html");

            driver.findElement(By.cssSelector("input[type='email']")).sendKeys(librarian);
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(2000);




//        When librarian click Books module

            driver.findElement(By.cssSelector("a[href='#books']")).click();
            Thread.sleep(2000);
//        And librarian click “+Add Book” button
            driver.findElement(By.cssSelector("a[data-target='#ajax']")).click();
            Thread.sleep(2000);
//        When librarian enter BookName, ISBN, Year, Author, and Description
            driver.findElement(By.cssSelector("input[placeholder='Book Name']")).sendKeys("The oldman " +
                    "and the Sea");
            driver.findElement(By.cssSelector("input[placeholder='ISBN']")).sendKeys("12345");
            driver.findElement(By.cssSelector("input[placeholder='Year']")).sendKeys("1952");
            driver.findElement(By.cssSelector("input[placeholder='Author']")).sendKeys("Ernest Hemingway");
            driver.findElement(By.xpath("//*[@id=\"book_group_id\"]/option[3]")).click();
            driver.findElement(By.cssSelector("textarea[id='description']")).sendKeys("Its a short " +
                    "novel written by american author Ernest Hemingway");

            Thread.sleep(2000);
            //        And librarian click save changes
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(2000);



//        Then verify a new book is added
            driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Ernest Hemingway");
            Thread.sleep(3000);
            if(driver.findElement(By.xpath("//*[@id=\"tbl_books\"]/tbody/tr[1]/td[2]")).getText().equals("12345")){
                System.out.println("New book with ISBN:  " + 12345 + " has been created successfully by librarian: "+ librarian );

            }else {
                System.out.println("Creating a new book failed");
            }


           // driver.quit();
        }


    }
}
