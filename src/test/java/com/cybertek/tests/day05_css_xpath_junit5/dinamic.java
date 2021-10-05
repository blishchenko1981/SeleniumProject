package com.cybertek.tests.day05_css_xpath_junit5;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dinamic extends TestBase {

    @Test
    public void index() throws InterruptedException {
        // 5 --//button[@class='btn btn-primary'][5]

        // result -- //p[starts-with(text(),'Clicked')]
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement buttonFive = driver.findElement(By.xpath("//button[@class='btn btn-primary'][5]"));
        buttonFive.click();
        System.out.println("buttonFive.getText() = " + buttonFive.getText());
        Thread.sleep(4000);
        String expectedResult="Clicked on button five!";
        String actualResutl = driver.findElement(By.xpath("//p[starts-with(text(),'Clicked')]")).getText();

        Assertions.assertEquals(expectedResult, actualResutl);
        Thread.sleep(4000);

    }

    @Test
    public void startswith() throws InterruptedException {

        // 3 -- xpath //button[ starts-with(@id,'button')]
        // 3 -- css button[id^='button']
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement buttonThree = driver.findElement(By.xpath("//button[ starts-with(@id,'button')]"));
        buttonThree=driver.findElement(By.cssSelector("button[id^='button']"));
        buttonThree.click();
        Thread.sleep(4000);
        String expectedResult="Clicked on button three!";
        String actualResutl = driver.findElement(By.xpath("//p[starts-with(text(),'Clicked')]")).getText();
        Assertions.assertEquals(expectedResult, actualResutl);

    }

    @Test
    public void contains() throws InterruptedException {

        // 4 -- xpath //button[contains(@id,'button')][2]
        // 4 -- css button[id*='button'][onclick='button4()']
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        Thread.sleep(4000);
        WebElement buttonFour = driver.findElement(By.xpath("//button[contains(@id,'button')][2]"));
        //buttonFour=driver.findElement(By.cssSelector("button[id*='button'][onclick='button4()']"));
        buttonFour.click();

        Thread.sleep(4000);
        String expectedResult="Clicked on button four!";
        String actualResutl = driver.findElement(By.xpath("//p[starts-with(text(),'Clicked')]")).getText();
        Assertions.assertEquals(expectedResult, actualResutl);

    }

    @Test
    public void endswith() throws InterruptedException {

        // 4 -- xpath //button[ends-with(@id,'button')]   is not working with Chrome
        // 4 -- css button[id$='button'][onclick='button4()']
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement buttonFour = driver.findElement(By.cssSelector("button[id$='button'][onclick='button4()']"));
        buttonFour.click();
        Thread.sleep(4000);

        String expectedResult="Clicked on button four!";
        String actualResutl = driver.findElement(By.xpath("//p[starts-with(text(),'Clicked')]")).getText();
        Assertions.assertEquals(expectedResult, actualResutl);

    }
}
