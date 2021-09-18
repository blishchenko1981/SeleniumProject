package com.cybertek.withAnnotations;

import com.cybertek.Utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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


    @Test
    public void BookCategory() {
        users = new ArrayList<>();
        users.add("student54@library");
        users.add("student55@library");
        users.add("student56@library");
        users.add("librarian43@library");
        users.add("librarian18@library");

        for (String user : users) {

            driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(user);
            driver.findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(password);

            //  todo AC#1
            // Given user is on the homePage
            driver.findElement(By.xpath("//button[@type = 'submit']")).click();
            driver.manage().window().maximize();


            //    When user click Books module
            WebElement bookModule =   driver.findElement(By.xpath("//span[text()= 'Books']"));
            bookModule.click();

            //    And user click book category dropdown
            driver.findElement(By.cssSelector("select[id='book_categories']")).click();

            //    Then verify there are 21 options
            List<WebElement> options = driver.findElements(By.xpath("//select[@id='book_categories']/option"));
            System.out.println("options.size() = " + options.size());

            Assertions.assertTrue(options.size() == 21);


            //todo AC #2:
            //Then verify user is able to selected the “Drama” option

            WebElement categoryOfBoooks = driver.findElement(By.xpath("//select[@id= 'book_categories']"));
            Select category = new Select(categoryOfBoooks);
            category.selectByValue("6");

            Assertions.assertTrue(category.getFirstSelectedOption().getText().equals("Drama"));

           thanksKseniia();

        }
    }


}
