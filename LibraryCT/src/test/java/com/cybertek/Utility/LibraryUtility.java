package com.cybertek.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class LibraryUtility {

    public static void goToLoginPage(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public static void logoutFunction(){
        // logOut from library
        WebElement usernameLink = Driver.getDriver().findElement(By.cssSelector("li>a[href='#']"));
        usernameLink.click();
        WebElement logOutLink = Driver.getDriver().findElement(By.cssSelector("div>a[href='#']"));
        logOutLink.click();
    }

    public static void loginFunction(String user){

        Driver.getDriver().findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(user);
        Driver.getDriver().findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(ConfigReader.read("password"));
        Driver.getDriver().findElement(By.xpath("//button[@type = 'submit']")).click();
        Driver.getDriver().manage().window().maximize();


    }


}
