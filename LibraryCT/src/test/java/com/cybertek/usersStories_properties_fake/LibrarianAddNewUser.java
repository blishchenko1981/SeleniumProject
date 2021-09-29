package com.cybertek.usersStories_properties_fake;

import com.cybertek.Utility.BrowserUtil;
import com.cybertek.Utility.ConfigReader;
import com.cybertek.Utility.Driver;
import com.cybertek.Utility.LibraryUtility;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class LibrarianAddNewUser {

    @Test

    public void testLibrarianAddNewUser() {


        ArrayList<String> users = new ArrayList<>();
        users.add(ConfigReader.read("librarian1"));
        users.add(ConfigReader.read("librarian2"));

        for (String user : users) {

            LibraryUtility.goToLoginPage();
            LibraryUtility.loginFunction(user);


            BrowserUtil.waitFor(2);

//            When librarian click Users module
            Driver.getDriver().findElement(By.xpath("//*[@id='menu_item']/li[2]/a")).click();

            BrowserUtil.waitFor(2);
//            And librarian click “+Add User” button
            Driver.getDriver().findElement(By.xpath("//*[@id=\"users\"]/div[1]/div[1]/span/a")).click();

            // When librarian enter full name, password, email and address
            BrowserUtil.waitFor(2);

            Faker faker = new Faker();
            Driver.getDriver().findElement(By.name("full_name")).sendKeys(faker.name().fullName());
            Driver.getDriver().findElement(By.name("password")).sendKeys(faker.idNumber().valid());
            Driver.getDriver().findElement(By.name("email")).sendKeys(faker.internet().emailAddress());

            Driver.getDriver().findElement(By.id("address")).sendKeys(faker.address().fullAddress());
//            And librarian click save changes
            BrowserUtil.waitFor(2);
            Driver.getDriver().findElement(By.xpath("//*[@id=\"add_user_form\"]/div[2]/button[2]")).click();
//            Then verify a new user is created
            BrowserUtil.waitFor(2);

            WebElement confirmUserWasCreated = Driver.getDriver().findElement(By.xpath("//div[@id='toast-container']"));
            System.out.println("confirmUserWasCreated.getText() = " + confirmUserWasCreated.getText());
            String expectedResult = "The user has been created.";
            assertTrue(expectedResult.equals(confirmUserWasCreated.getText()));

            BrowserUtil.waitFor(6);
            LibraryUtility.logoutFunction();

        }
    }

}

