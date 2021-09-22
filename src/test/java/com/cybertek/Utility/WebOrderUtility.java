package com.cybertek.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WebOrderUtility {

    public static void login(WebDriver driverParameter){

        // enter username
        driverParameter.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        driverParameter.findElement(By.id("ctl00_MainContent_password")) .sendKeys("test");
        // click login
        driverParameter.findElement(By.id("ctl00_MainContent_login_button")).click();

    }
    public static void login(WebDriver driverParameter, String userName, String password){

        // enter username
        driverParameter.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        // enter password
        driverParameter.findElement(By.id("ctl00_MainContent_password")) .sendKeys(password);
        // click login
        driverParameter.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void logout(WebDriver driverParam){
        driverParam.findElement(By.id("ctl00_logout")).click();
    }

    public static boolean isAtOrderPage(WebDriver driverParam){
        boolean result = false;
       // locator for the header element of all order page

        try {

            WebElement header = driverParam.findElement(By.xpath("//h2 [normalize-space(.)= 'List of All Orders']"));
            System.out.println("element was identify");
            result = true;
        }catch(NoSuchElementException e){
            System.out.println("no such element, not right page");
        }

        return result;
    }


}
