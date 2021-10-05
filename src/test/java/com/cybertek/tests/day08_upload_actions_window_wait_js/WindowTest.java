package com.cybertek.tests.day08_upload_actions_window_wait_js;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
public class WindowTest extends TestBase {

    @Test
    public void testWindowTab(){
        driver.get("http://practice.cybertekschool.com/windows");

        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);


        BrowserUtil.waitFor(3);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        WebElement clickHereLnk = driver.findElement(By.linkText("Click Here"));
        clickHereLnk.click();

        System.out.println("After clicking driver.getWindowHandle() = " + driver.getWindowHandle());


        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());

        // our objective is to iterate over each and every handles and use switch method to switch to the window
        // print out its title

        allHandles = driver.getWindowHandles();
        for(String eachHandle : allHandles ){
            System.out.println("eachHandle = " + eachHandle);
            //this is how to switch to diff window:
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }


        System.out.println("Switch back to original tab");
        driver.switchTo().window(currentHandle);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        assertEquals("Practice", driver.getTitle());



    }


}
