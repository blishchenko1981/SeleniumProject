package com.cybertek.userStrories_withAnnotations;

import com.cybertek.Utility.TestBase;
import com.cybertek.Utility.LibraryUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class LibrarianLogin extends TestBase {

    @Test

    public void loginLibrarian(){

        String username = "";
        for (int i = 0; i < 2; i++) {

            if (i == 0) {
                username = "librarian43@library";
            } else if (i == 1) {
                username = "librarian18@library";
            }

//        Given librarian is on the loginPage
            driver.get("http://library2.cybertekschool.com/login.html");

//        Then verify that the title is “Login - Library”

            Assertions.assertTrue(driver.getTitle().equals("Login - Library"));


//        When librarian enters valid email address and password


            driver.findElement(By.id("inputEmail")).sendKeys(username);
            driver.findElement(By.id("inputPassword")).sendKeys("Sdet2022*");



//        And librarian click sign in button
            driver.findElement(By.tagName("button")).click();

//        Then verify that there are 3 modules on the page


            List<WebElement> modules = driver.findElements(By.xpath("//li[@class='nav-item']"));
            System.out.println("modules.size() = " + modules.size());

            Assertions.assertEquals (3,    modules.size());

            LibraryUtility.logoutFunction();

        }


    }
}
