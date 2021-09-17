package com.cybertek.part2;

import com.cybertek.Utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BookCategory_21options extends TestBase {
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
//    As a user, I want to filter book categories.

    ArrayList<String> users;
    public static String password = "Sdet2022*";


    @BeforeEach
    public void setUpList() {

        users = new ArrayList<>();
        users.add("student54@library");
        users.add("student55@library");
        users.add("student56@library");
        users.add("librarian43@library");
        users.add("librarian18@library");

    }

    @Test
    public void BookCategory() {

        for (String user : users) {

            driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(user);
            driver.findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(password);

//  todo AC#1
            // Given user is on the homePage
            driver.findElement(By.xpath("//button[@type = 'submit']")).click();
            driver.manage().window().maximize();

// User on home page(loged in)
//    When user click Books module
            if (user.contains("student")) {
                driver.findElement(By.xpath("//ul[@id='menu_item']/li[1]/a")).click();
            } else if (user.contains("librarian")) {
                driver.findElement(By.xpath("//ul[@id='menu_item']/li[3]/a")).click();
            }

//    And user click book category dropdown
            driver.findElement(By.cssSelector("select[id='book_categories']")).click();

//    Then verify there are 21 options
            List<WebElement> options = driver.findElements(By.xpath("//select[@id='book_categories']/option"));
            System.out.println("options.size() = " + options.size());

            Assertions.assertTrue(options.size() == 21);


            //todo AC #2:
            //Then verify user is able to selected the “Drama” option
            driver.findElement(By.xpath("//*[@id='book_categories']/option[7]")).click();
            System.out.println("text for option:" + driver.findElement(By.xpath("//*[@id='book_categories']/option[7]")).getText());
            String category = driver.findElement(By.xpath("//tr[@role = 'row']/td[5]")).getText();
            System.out.println(category);

             Assertions.assertTrue(category.equals("Drama"));

//    And user click Log Out   < method thanksKseniia() >

            WebElement usernameLink = driver.findElement(By.cssSelector("li>a[href='#']"));
            usernameLink.click();

            WebElement logOutLink = driver.findElement(By.cssSelector("div>a[href='#']"));
            logOutLink.click();

        }
    }


}
