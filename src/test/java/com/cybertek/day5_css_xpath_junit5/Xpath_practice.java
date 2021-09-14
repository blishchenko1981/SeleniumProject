package com.cybertek.day5_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement forgetPass = driver.findElement(By.xpath("//h2[text() = 'Forgot Password']"));
        System.out.println("forgetPass.getText() = " + forgetPass.getText());

        driver.findElement(By.xpath("//input[@name = 'email' and @type = 'text']")).sendKeys("sdkfdslf@flds.don");
        driver.findElement(By.xpath("//button[@id]")).click();

          //h4[text()= "Your e-mail's been sent!"]

        String confirmLocatorStr = " //h4[text()= \"Your e-mail's been sent!\"]";
        System.out.println("confirmLocatorStr = " + confirmLocatorStr);

        WebElement confirmationMsg = driver.findElement(By.xpath(confirmLocatorStr));

        System.out.println("confirmationMsg = " + confirmationMsg);


    }
}
