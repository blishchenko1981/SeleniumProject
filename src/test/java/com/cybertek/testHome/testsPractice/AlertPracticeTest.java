package com.cybertek.testHome.testsPractice;

import com.cybertek.testHome.utilityPractice.TestBasePractice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBasePractice {

    @Test
    public void testJavaScriptAlert() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();

    }


}
