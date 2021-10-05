package com.cybertek.tests.day07_iFrame;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends TestBase {
    @Test
    public void testSimpleFrame(){
        driver.get("http://practice.cybertekschool.com/iframe");

//driver.switchTo().frame(0);
//iframe[title^='Rich Text Area']
        WebElement iframeElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iframeElm);


//driver.switchTo().frame("mce_0_ifr");
        WebElement pTagInsideFrame = driver.findElement(By.tagName("p"));
        System.out.println("pTagInsideFrame.getText() = " + pTagInsideFrame.getText());

        // 2 ways to get out of frame
          // - jump one level out of the frame
        driver.switchTo().parentFrame();
          // - jump all the way to the main content

        driver.switchTo().defaultContent();
        // click on home link on top left corner

        driver.findElement(By.linkText("Home")).click();



    }
}
