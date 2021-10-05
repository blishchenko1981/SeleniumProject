package com.cybertek.tests.day6_junit_practice_utility_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBase {
    @Test
    public void testJavaScriptAlert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        // Alert interface from Selenium is used to deal with alerts
        // your driver object can switch to the alert
        driver.findElement(By.xpath("//button[.= 'Click for JS Alert']")).click();


        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("//button[.= 'Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();// this will click on cancel btn on confirmation box

        driver.findElement(By.xpath("//button[.= 'Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();




        System.out.println("the end");

    }

}
