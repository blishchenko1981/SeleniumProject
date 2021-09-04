package com.cybertek.homeTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1. Open Chrome and Navigate to https://facebook.com
        driver.get("http://facebook.com");
        Thread.sleep(2000);
        //2. Enter username `invalid username` into username box
        WebElement name = driver.findElement(By.id("email"));
        name.sendKeys("username");
        Thread.sleep(2000);
        //3. Enter password `some password` password box
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("somePassword");
        Thread.sleep(2000);
        //4. Click on the Login button and wait few seconds until error comes back
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();
        Thread.sleep(2000);


        //5. Navigate back to login screen

        driver.navigate().back();
        Thread.sleep(2000);
        //6. Click on `forget password` link
        WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
        forgot.click();
        Thread.sleep(2000);
        //7. Enter `something` into Mobile number text box `123456789`
        WebElement mobile = driver.findElement(By.id("identify_email"));
        mobile.sendKeys("9802102909");
        Thread.sleep(2000);
        //8. Click on the search button
        WebElement submit = driver.findElement(By.id("did_submit"));
        submit.click();
        Thread.sleep(2000);
        //9. Click on the cancel button

        WebElement cancel = driver.findElement(By.linkText("Cancel"));
        cancel.click();
        Thread.sleep(2000);
        //10. Quit the browser
        driver.quit();
    }
}