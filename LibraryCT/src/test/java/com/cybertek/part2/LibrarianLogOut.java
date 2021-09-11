package com.cybertek.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class LibrarianLogOut {

//     Environment:
//     http://library2.cybertekschool.com/login.html
//
//    Users:
//    student54@library
//    student55@library
//    student56@library
//    librarian43@library
//    librarian18@library


    public static void main(String[] args) throws InterruptedException {
//        Given user is on the homePage
        ArrayList<String> librarians = new ArrayList<>();
        librarians.add("librarian43@library");
        librarians.add("librarian18@library");


        for (String librarian : librarians) {
            String password = "Sdet2022*";

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://library2.cybertekschool.com/login.html");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.findElement(By.id("inputEmail")).sendKeys(librarian);
            driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            String homeURL = driver.getCurrentUrl();
            Thread.sleep(2000);

//        When user click username on the right top corner
            driver.findElement(By.cssSelector("a[id='navbarDropdown']")).click();

//        And user click Log Out
            driver.findElement(By.xpath("//*[@id='navbarCollapse']/ul[2]/li/div/a")).click();
//        Then verify user navigate back to login page.
            Thread.sleep(2000);

           String logoutURL= driver.getCurrentUrl();
            if(homeURL!=logoutURL){
                System.out.println("Logout test for " + librarian + " PASSED!");
            }else {
                System.out.println("Logout test for " + librarian + " FAILED!!!!");
            }

            driver.quit();
        }
    }


}
