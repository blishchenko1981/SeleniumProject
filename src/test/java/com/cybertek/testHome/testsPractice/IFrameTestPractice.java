package com.cybertek.testHome.testsPractice;

import com.cybertek.testHome.utilityPractice.TestBasePractice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrameTestPractice extends TestBasePractice {

    @Test
    public void testSimpleIFrame() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/iframe");

       // driver.switchTo().frame(0); //-> by INDEX
       // driver.switchTo().frame("mce_0_ifr");// -> by ID or NAME
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']")));//-> by WebElement iframe

        WebElement pTagInsideFrame = driver.findElement(By.tagName("p"));
        System.out.println("pTagInsideFrame.getText() = " + pTagInsideFrame.getText());

        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(2000);
        System.out.println("driver.getTitle() = " + driver.getTitle());

        Assertions.assertTrue(driver.getTitle().contains("Practice"));



    }



}
