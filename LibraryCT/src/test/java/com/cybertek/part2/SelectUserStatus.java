package com.cybertek.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SelectUserStatus {
    //     Environment:
//     http://library2.cybertekschool.com/login.html
//
//    Users:
//    student54@library
//    student55@library
//    student56@library
//    librarian43@library
//    librarian18@library


//    User story:
//As a librarian, I want to select user status - active vs inactive.


    public static void main(String[] args) throws InterruptedException {
//Given librarian is on the homePage

        ArrayList<String> librarians = new ArrayList<>();
        librarians.add("librarian43@library");
        librarians.add("librarian18@library");
        String password = "Sdet2022*";


        for (String librarian : librarians) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.id("inputEmail")).sendKeys(librarian);
            driver.findElement(By.id("inputPassword")).sendKeys(password);
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            driver.manage().window().maximize();
            Thread.sleep(2000);

           //When librarian click Users module
            driver.findElement(By.xpath("//li[2]/a")).click();

            Thread.sleep(2000);
           //And librarian click Status dropdown
            driver.findElement(By.xpath("//select[@id='user_status']")).click();

            Thread.sleep(2000);
            // Then verify there are 2 status options


            List<WebElement> status = driver.findElements(By.xpath("//select[@id='user_status']/option"));
            System.out.println("status.size() = " + status.size());
            if(status.size()==2){
                System.out.println("Test for 'User status dropdown' by " +librarian+ " PASS");
            }else{
                System.out.println("Test for 'User status dropdown' by " +librarian+ " FAIL");
            }

            driver.quit();
        }


    }
}
