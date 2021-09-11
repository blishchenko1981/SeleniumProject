package com.cybertek.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StudentLogin {
    public static void main(String[] args) throws InterruptedException {
        //Credentials
        // student54@library
        //student55@library
        //student56@library
        String password = "Sdet2022*";
        String username = "";
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                username = "student54@library";
            } else if (i == 1) {
                username = "student55@library";
            } else if (i == 2) {
                username = "student56@library";
            }

//        Given student is on the loginPage
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://library2.cybertekschool.com/login.html");


//        Then verify that the URL is “https://library2.cybertekschool.com/login.html”
            if (driver.getCurrentUrl().equals("https://library2.cybertekschool.com/login.html")) {
                System.out.println(username + ": TEST for URL is passed");
            } else {
                System.out.println("Test for URL is failed");
            }


//        When student enters valid email address and password
            driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(username);
            driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys(password);
            Thread.sleep(3000);
//        And student click sign in button
            driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
            Thread.sleep(3000);
//        Then verify that there are 2 models on the page
            List<WebElement> modules = driver.findElements(By.xpath("//li[@class = 'nav-item']"));
            System.out.println("modules.size() = " + modules.size());
            if (modules.size() == 2) {
                System.out.println("Test of modules by " + username + " ....PASS");
            } else {
                System.out.println("Test of modules Failed by " + username);
            }

            driver.quit();
        }
    }
}
