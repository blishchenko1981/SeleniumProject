package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class LibrarianLogin {
    public static void main(String[] args) throws InterruptedException {
        String username = "";
        for (int i = 0; i < 2; i++) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();


            if (i == 0) {
                username = "librarian43@library";
            } else if (i == 1) {
                username = "librarian18@library";
            }

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


            driver.findElement(By.id("inputEmail")).sendKeys(username);
            driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*");


            Thread.sleep(2000);

//        And librarian click sign in button
            driver.findElement(By.tagName("button")).click();

//        Then verify that there are 3 modules on the page
            Thread.sleep(3000);

            List<WebElement> modules = driver.findElements(By.xpath("//li[@class='nav-item']"));
            System.out.println("modules.size() = " + modules.size());

            if (modules.size() == 3) {
                System.out.println("Test pass for user: " + username);
            } else {
                System.out.println("Test failed for user: " + username);
            }


            driver.quit();

        }


    }
}
