package com.cybertek.userStories_POM;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.Driver;
import com.cybertek.pages.LibLoginPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Login_WrongCredentials {
    @Test

    public void testLoginWrongCredentials(){

        Faker faker = new Faker();
        LibLoginPage loginPage = new LibLoginPage();

        //Given user is on the loginPage
        loginPage.goTo();

        //When user enters invalid email address or password
        //And student click sign in button
        String name = faker.name().username();
        loginPage.logIn(name);

        BrowserUtil.waitFor(3);

        //Then verify the error message “Sorry, Wrong Email or Password”

        String test = Driver.getDriver().findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div")).getText();

        Assertions.assertTrue(test.equals("Sorry, Wrong Email or Password"));

    }



}
