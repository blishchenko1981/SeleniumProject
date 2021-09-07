package com.cybertek.homeTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
//
//1. open chrome and navigate to http://zero.webappsecurity.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");
//2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
        if(driver.getTitle().equals("Zero - Personal Banking - Loans - Credit Cards")){
            System.out.println("\"test of Title name....\" = " + "test of Title name PASS....");
        }else {
            System.out.println("\"test of title passed\" = " + "test of title passed");
        }
//3. click on `signin button`
driver.findElement(By.id("signin_button")).click();
        Thread.sleep(3000);
//4. verify the title is "Zero- Log in"
        if(driver.getTitle().equals("Zero- Log in")) {
            System.out.println("Test get second title pass");
        }else {
            System.out.println("Test for second title is FAILEd");
            System.out.println("Actual result = " + "Zero - Log in");

        }

//5. enter text as "username" into username box
        driver.findElement(By.id("user_login")).sendKeys("user Vitalii");

//6. enter text "password" into password box
        driver.findElement(By.id("user_password"));
//7. submit by clicking login button
        driver.findElement(By.name("submit")).submit();
//8. verify you are at "Zero - Account Summary" page by checking title

        if(driver.getTitle().equals("Zero - Account Summary")){
            System.out.println("Yes we are on the right page");
        }else {
            System.out.println("We are in a middle of somewhere but not where we supposed to be");
        }
//9. now use your imagination to play around here and explore , automate within the capacity we already have so far.

        WebElement checkBox = driver.findElement(By.id("user_remember_me"));
        System.out.println("checkBox.getTagName() = " + checkBox.getTagName());
        System.out.println("checkBox.getAttribute(\"tabindex\") = " + checkBox.getAttribute("tabindex"));


//




    }
}
