package com.cybertek.userStrories_withAnnotations;

import com.cybertek.Utility.TestBase;
import com.cybertek.Utility.LibraryUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class LibrarianLogOut extends TestBase {

//     Environment:
//     http://library2.cybertekschool.com/login.html
//
//    Users:
//    student54@library
//    student55@library
//    student56@library
//    librarian43@library
//    librarian18@library



        //        Given user is on the homePage


        @Test
    public  void logoutTest() {
            //        Given user is on the homePage
            ArrayList<String> users = new ArrayList<>();
            users.add("librarian43@library");
            users.add("librarian18@library");
            String password = "Sdet2022*";

        for (String user : users) {
            LibraryUtility.loginFunction( user );

            //        When user click username on the right top corner
           WebElement userInfo =  driver.findElement(By.cssSelector("a[id='navbarDropdown']"));
           userInfo.click();

         WebDriverWait wait  = new WebDriverWait(driver, 5);
         wait.until(elementToBeClickable(userInfo));

            //        And user click Log Out
           WebElement logoutButton =  driver.findElement(By.xpath("//*[@id='navbarCollapse']/ul[2]/li/div/a"));
           logoutButton.click();


            //        Then verify user navigate back to login page.

           String logoutTitle= driver.getTitle();

            Assertions.assertEquals("Login - Library", logoutTitle);


        }
    }


}
