package com.cybertek.testHome.testsPractice;

import com.cybertek.testHome.utilityPractice.TestBasePractice;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UseImplicitWait extends TestBasePractice {

    @Test
    public void testSlowElement(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.cssSelector("form[id='checkbox-example']>button")).click();
        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
        System.out.println("The end");

    }
}
