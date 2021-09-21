package com.cybertek.tests.day08_upload_actions_window_wait_js;

import com.cybertek.Utility.BrowserUtil;
import com.cybertek.Utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorTest extends TestBase {


    @Test
    public void testScrollWholeWindow(){

        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        // scroll down

        // get JSExequtor reference from driver veriable
        BrowserUtil.waitFor(3);

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 1; i <=10 ; i++) {


            jse.executeScript("window.scrollBy(0,1000)");

            BrowserUtil.waitFor(2);
        }
    }

    @Test

    public void testScrollElementIntoView(){


        //http://practice.cybertekschool.com/large

        driver.get("http://practice.cybertekschool.com/large");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // locate cybertekSchoolLnk and homeLnk

        // run this javascript to scroll the element into the view

        int myScrollNumber = 1000;
        jse.executeScript("window.scrollBy(0, argument[0]  )",  myScrollNumber);

        WebElement cybertekSchoolLnk = driver.findElement(By.linkText("Cybertek School"));

        jse.executeScript("argument[0].scrollIntoView(true)", cybertekSchoolLnk);

    }
}
