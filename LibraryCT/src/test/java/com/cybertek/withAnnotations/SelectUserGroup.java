package com.cybertek.withAnnotations;

import com.cybertek.Utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SelectUserGroup extends TestBase {




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


    @Test
            public void testUserGroups(){
//                AC #1:
//        Given librarian is on the homePage

        String password = "Sdet2022*";
        ArrayList<String> librarians = new ArrayList<>();
        librarians.add("librarian43@library");
        librarians.add("librarian18@library");

        for (String librarian : librarians) {
            driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(librarian);
            driver.findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(password);
            driver.findElement(By.xpath("//button[@type = 'submit']")).click();
            driver.manage().window().maximize();


          // When librarian click Users module

            driver.findElement(By.xpath("//div[@id='navbarCollapse']/ul/li[2]/a")).click();


          // And librarian click user group dropdown
            WebElement userGroups = driver.findElement(By.cssSelector("select[id='user_groups']"));

            Select groupsOption = new Select(userGroups);
            List<WebElement>  numberOFGroups = groupsOption.getOptions();
            System.out.println("numberOFGroups.size() = " + numberOFGroups.size());

            // Then verify librarian have 3 options

            Assertions.assertEquals(3, numberOFGroups.size() );

            thanksKseniia();

        }

    }
}
