package com.cybertek.userStories_POM;

import com.cybertek.Utility.*;
import com.cybertek.pages.LibLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class StudentLogin extends TestBase {

    @Test
    public void studentLogin() {

        ArrayList<String> users = new ArrayList<>();

        users.add(ConfigReader.read("student1"));
        users.add(ConfigReader.read("student2"));
        users.add(ConfigReader.read("student3"));

        //        Given student is on the loginPage

        LibLoginPage loginPage = new LibLoginPage();

        for (String user : users) {
            loginPage.goTo();

            BrowserUtil.waitFor(3);
            String expectedURL = "https://library2.cybertekschool.com/login.html";


            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            Assertions.assertTrue(driver.getCurrentUrl().equals(expectedURL));

            //        When student enters valid email address and password
            //        And student click sign in button

            loginPage.logIn(user);
            BrowserUtil.waitFor(3);

            //        Then verify that there are 2 modules on the page
            List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//li[@class = 'nav-item']"));
            System.out.println(user + ", modules.size() = " + modules.size());

            Assertions.assertTrue(modules.size() == 2);


            LibraryUtility.logoutFunction();
        }

    }
}
