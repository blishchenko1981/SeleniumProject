package com.cybertek.homeTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Library1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        Given librarian is on the loginPage
        driver.get("http://library2.cybertekschool.com/login.html");

//        Then verify that the title is “Login - Library”
        if (driver.getTitle().equals("Login - Library")) {
            System.out.println("\"User on correct page\" = " + true + ", test step PASS");
        } else {
            System.out.println("Test step FAILED");
        }

        driver.manage().window().maximize();
//        When librarian enters valid email address and password
        driver.findElement(By.id("inputEmail")).sendKeys("librarian43@library");
        driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*");
        System.out.println("step2 done");

        Thread.sleep(2000);

//        And librarian click sign in button
        driver.findElement(By.tagName("button")).click();
        System.out.println("step3 done");
//        Then verify that there are 3 modules on the page

        List<WebElement> modules = driver.findElements(By.className("title"));
        System.out.println("step4 done");

        System.out.println("modules.size() = " + modules.size());
        System.out.println("step 5 done");

        //driver.quit();
    }
}