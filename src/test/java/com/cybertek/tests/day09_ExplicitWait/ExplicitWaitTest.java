package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest extends TestBase {
    @Test

    public void testWaitForTitle() {
        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();


        //3. The title will show loading... until certain time ,
        // we want to wait until the title value become "Dynamic Title"

        WebDriverWait wait= new WebDriverWait(driver, 6);
        //wait.until(ExpectedConditions.titleIs("Dynamic title"));

      //  try differnt condition as below wait until sponchbob image is visible on screen

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img")));
    }

    @Test

    public void testTextToBe(){
        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get(" http://practice.cybertekschool.com/dynamic_loading");
        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());

        WebDriverWait wait = new WebDriverWait(driver, 9);
        // wait for the image show up
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;

        System.out.println("alertArea.getText() = " + alertArea.getText());
        // the warning area initially has text of this page is slow wait for 5 seconds..
        // after it load the text of that area become Done!
        // This is one of the ExpectedConditions we can use for waiting

    }

}
