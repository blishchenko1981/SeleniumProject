package com.cybertek.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class WebOrderUtility {

    public static void logoutFunction(WebDriver driver){
        // logOut from library
        WebElement usernameLink = driver.findElement(By.cssSelector("li>a[href='#']"));
        usernameLink.click();
        WebElement logOutLink = driver.findElement(By.cssSelector("div>a[href='#']"));
        logOutLink.click();
    }

    public static void loginFunction(WebDriver driver, String user, String password){

        driver.get("http://library2.cybertekschool.com/login.html");
        driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(user);
        driver.findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        driver.manage().window().maximize();


    }


}
