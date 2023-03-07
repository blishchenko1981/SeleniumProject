package com.cybertek.testHome.testsPractice;

import com.cybertek.testHome.utilityPractice.BrowserUtil;
import com.cybertek.testHome.utilityPractice.TestBasePractice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.rmi.activation.ActivationInstantiator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ActionClassTestPractice extends TestBasePractice {

    @Test
    public void testHoverAction() {

        //http://practice.cybertekschool.com/hovers

        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img1).perform();
        BrowserUtil.waitFor(3);

        WebElement firstProfileElm = driver.findElement(By.xpath("//h5[.='name: user1']"));
        assertTrue(firstProfileElm.isDisplayed());

        // move to a second element
        WebElement img2 = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
        actions.moveToElement(img2).perform();
        BrowserUtil.waitFor(3);

        List<WebElement> listOfImage = driver.findElements(By.xpath("//div[@class='figure']/img"));
        System.out.println("listOfImage.size() = " + listOfImage.size());

        for (WebElement image : listOfImage) {

            actions.moveToElement(image).pause(2000).perform();
        }

    }

    @Test
    public void testDragAndDrop() {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //id='droptarget  // id='draggable'

        WebElement bigCircle = driver.findElement(By.id("droptarget"));
        WebElement smallCirce = driver.findElement(By.id("draggable"));
        //TODO: scroll down to be able drag and drop correctly!!!!!!!!!!!!!!!!
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(smallCirce, bigCircle).pause(2000).perform();
        System.out.println("Hello");

        String text = "You did great!";
        assertTrue(bigCircle.getText().equals(text));


    }

    @Test
    public void testKeyboardAction() {
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Hi");

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(" i love selenium").pause(2000).keyUp(Keys.SHIFT)
                .sendKeys(" i love selenium")
                .keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE).perform();
        ;
        System.out.println("Hello");

    }

    @Test
    public void testDoubleClick() {
        // https://w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick
        driver.get("// https://w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);
        driver.switchTo().frame("iframeResult");

        WebElement pElm1 = driver.findElement(By.xpath("//p[starts-with(text(), 'Double-click this')]"));
        Actions actions = new Actions(driver);
        actions.doubleClick(pElm1).perform();


    }

}
