package com.cybertek.userStrories_withAnnotations;

import com.cybertek.utility.TestBase;
import com.cybertek.utility.LibraryUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        ArrayList<String> users = new ArrayList<>();
        users.add("librarian43@library");
        users.add("librarian18@library");

        for (String user : users) {

            LibraryUtility.loginFunction(user);


          // When librarian click Users module

            driver.findElement(By.xpath("//div[@id='navbarCollapse']/ul/li[2]/a")).click();


          // And librarian click user group dropdown
            WebElement userGroups = driver.findElement(By.cssSelector("select[id='user_groups']"));

            Select groupsOption = new Select(userGroups);
            List<WebElement>  numberOFGroups = groupsOption.getOptions();
            System.out.println("numberOFGroups.size() = " + numberOFGroups.size());

            // Then verify librarian have 3 options

            Assertions.assertEquals(3, numberOFGroups.size() );

            LibraryUtility.logoutFunction();

        }

    }
}
