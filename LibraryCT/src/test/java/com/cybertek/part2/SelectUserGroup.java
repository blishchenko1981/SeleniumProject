package com.cybertek.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SelectUserGroup {
    public static void main(String[] args) throws InterruptedException {

        //     Environment:
//     http://library2.cybertekschool.com/login.html
//
//    Users:
//    student54@library
//    student55@library
//    student56@library
//    librarian43@library
//    librarian18@library


//        As a librarian, I want to select user groups.
//
//                AC #1:
//        Given librarian is on the homePage

        ArrayList<String> librarians = new ArrayList<>();
        librarians.add("librarian43@library");
        librarians.add("librarian18@library");
        String password = "Sdet2022*";

        for (String librarian : librarians) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(librarian);
            driver.findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(password);

            driver.findElement(By.xpath("//button[@type = 'submit']")).click();
            driver.manage().window().maximize();
            Thread.sleep(2000);

//        When librarian click Users module

            driver.findElement(By.xpath("//div[@id='navbarCollapse']/ul/li[2]/a")).click();
            Thread.sleep(2000);

//        And librarian click user group dropdown
            driver.findElement(By.cssSelector("select[id='user_groups']")).click();
            Thread.sleep(2000);

//        Then verify librarian have 3 options
            List<WebElement> userGroups = driver.findElements(By.cssSelector("select[id='user_groups']>option"));
            System.out.println("userGroups.size() = " + userGroups.size());

            if (userGroups.size() == 3) {
                System.out.println("Test for 'User groups' by " + librarian + " PASS");
            } else {
                System.out.println("Test for 'User groups' by " + librarian + " FAILED!!!!");
            }


            driver.quit();
        }

    }
}
