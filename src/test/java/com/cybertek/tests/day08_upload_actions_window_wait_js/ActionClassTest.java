package com.cybertek.tests.day08_upload_actions_window_wait_js;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionClassTest extends TestBase {

    //  @Test
    public void testHoverAction() {
        //div[@class= 'figure']/img[1];
        //img[1]

        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement image1 = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[1]"));
        WebElement image2 = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[2]"));
        // create instance of the Action class by passing driver object

        Actions actions = new Actions(driver);
        actions.moveToElement(image1).perform();

        BrowserUtil.waitFor(3);

        WebElement firstProfileElm = driver.findElement(By.xpath("//h5[text() = 'name: user1']"));
        Assertions.assertTrue(firstProfileElm.isDisplayed());


        // move to the second image and hover over the image

        actions.moveToElement(image2).perform();
        BrowserUtil.waitFor(3);


        //perform these actions in the sequence
        //, hover over to 1st image, pause 2 second then secondimage pause 2 second
        // then hover over to 1st image again pause 2 second then second image pause 2 second
        // PERFORM THE ACTION!!!

        actions.moveToElement(image1).pause(2000).
                moveToElement(image2).pause(2000).
                moveToElement(image1).pause(2000).
                moveToElement(image2).pause(2000).
                perform();


    }

    @Test

    public void testdragAndDrop() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtil.waitFor(2);

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        //dragAndDrop method of Actions class . accept 2 webelement and droop into second

        Actions actions = new Actions(driver);
        actions.dragAndDrop(smallCircle, bigCircle).perform();

        BrowserUtil.waitFor(4);

        Assertions.assertEquals("You did great!", bigCircle.getText());

        BrowserUtil.waitFor(4);


    }

    @Test

    public void testKeyBoardAction() {
        // navigate to google.com
        // hold down shift enter " i love selenium"
        // release the shift
        // enter text "i love selenium";
        // hold down to control and enter "A"
        // release the ctrl
        // then hit backspase to delete


        driver.get(" https://www.google.com");
        // locate the searchbox name= 'q'

        WebElement search = driver.findElement(By.name("q"));
        // create Actions class instance

        Actions actions = new Actions(driver);
        // keyDown for holding key
        // keyUp for releasing
        //sendKeys is pressing key that provided
        // pause is for pausing between actions

        actions.keyDown(Keys.SHIFT).sendKeys("i love selenium").
                pause(2000).keyUp(Keys.SHIFT).
                sendKeys("i love selenium").pause(2000).
                keyDown(Keys.CONTROL).sendKeys("A").// CNTR + "A"  select all the text on windows
                keyUp(Keys.CONTROL).pause(2000).
                sendKeys(Keys.BACK_SPACE).pause(2000).
                perform();


    }

    @Test
    public void testDoubleClick() {

//https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);

        driver.switchTo().frame("iframeResult");

        WebElement forDoubleclick = driver.findElement(By.xpath("//p[.= 'Double-click this paragraph to trigger a function.']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(forDoubleclick).perform();
        BrowserUtil.waitFor(2);

        // home work:   Assertions.assertEquals("Hello world", );
    }

    @Test
    public void testRightClick() {

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        driver.switchTo().frame("iframeResult");

        WebElement yellowArea = driver.findElement(By.cssSelector("div[contextmenu= 'mymenu']"));

        Actions actions = new Actions(driver);
        actions.contextClick(yellowArea).perform();

        BrowserUtil.waitFor(1);


    }


   // WebElement file = driver.findElement(By.xpath("//div[@id = 'dew']"));
   // file.delete();
  //  assertTrue (Element is deleted)

    //try{locate it }
    //catch(NO such element exeption){
    //  so means no that elements here }

   // List<WebElement>  checkAssertion = driver.findElements(By.xpath("//div[@id = 'dew']"));
    // if(checkAssertion.isEmpty) ==> return true. file was deleted;


}


