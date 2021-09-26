package com.cybertek.userStrories_withAnnotations;

import com.cybertek.Utility.TestBase;
import com.cybertek.Utility.WebOrderUtility;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class UserStatus extends TestBase {

    ArrayList<String> librarians;
    public static String password = "Sdet2022*";


    @Test

    public void testUserStatus() {
        librarians = new ArrayList<>(Arrays.asList("librarian43@library", "librarian18@library"));
        //driver.get("http://library2.cybertekschool.com/login.html");
        for (int i = 0; i < librarians.size(); i++) {

            WebOrderUtility.loginFunction(driver,librarians.get(i),password);


           WebElement users =  driver.findElement(By.xpath("//li[2]/a"));
           users.click();


            //And librarian click Status dropdown
            WebElement userStatus = driver.findElement(By.xpath("//select[@id='user_status']"));
            userStatus.click();
            Select statusOption  = new Select(userStatus);
            List<WebElement> options = statusOption.getOptions();


            // Then verify there are 2 status options


            Assertions.assertTrue(options.size() == 2);

            //    And user click Log Out

            WebOrderUtility.logoutFunction(driver);
            System.out.println("librarian " + (i+1)+ " loged out");
        }

    }
}