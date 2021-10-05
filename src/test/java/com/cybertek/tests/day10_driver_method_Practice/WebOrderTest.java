package com.cybertek.tests.day10_driver_method_Practice;

import com.cybertek.utility.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebOrderTest  extends TestBase {

    @Test
    public void  loginLogoutTest(){
        WebOrderUtility_New.openWebOrderApp();
        WebOrderUtility_New.login("Tester", "test");
        BrowserUtil.waitFor(3);


        Assertions.assertEquals("Web Order Login", driver.getTitle());


       Assertions.assertTrue(WebOrderUtility_New.isAtAllOrderPage());

        System.out.println("WebOrderUtility_New.getUserNameFromWelcomeMessage() = "
                              + WebOrderUtility_New.getUserNameFromWelcomeMessage());

        WebOrderUtility_New.verifyUserName("Tester");
        Assertions.assertTrue( WebOrderUtility_New.verifyUserName("Tester"));

        Assertions.assertEquals("Tester", WebOrderUtility_New.getUserNameFromWelcomeMessage());

        WebOrderUtility_New.selectSidebarTab("View all orders");
        BrowserUtil.waitFor(2);
        WebOrderUtility_New.selectSidebarTab("View all products");
        BrowserUtil.waitFor(2);
        WebOrderUtility_New.selectSidebarTab("Order");

        WebOrderUtility_New.selectSidebarTab("bla bla");





        WebOrderUtility_New.logout();
    }

    @Test

    public void testInvalidCredentials(){

        WebOrderUtility_New.openWebOrderApp();

        WebOrderUtility_New.login("abc", "def");
        //Invalid Login or Password.
     //  WebElement errorMessage = driver.findElement(By.xpath("//span[.= 'Invalid Login or Password.']"));
     //   Assertions.assertTrue(errorMessage.isDisplayed());

      // boolean elementFound = BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.= 'Invalid Login or Password.']"), 3);

       Assertions.assertTrue(WebOrderUtility_New.loginErrorMsgVisible());








    }

    @Test

            public void clearInputBox(){

        WebOrderUtility_New.openWebOrderApp();
    WebElement usernameField = driver.findElement(By.id("ctl00_MainContent_username")) ;
        usernameField.sendKeys("ASKJDHASKJDHASKJDHAKJSHDAKSJHD");
        BrowserUtil.waitFor(2);
        usernameField.clear(); // remove anything inside input element
        BrowserUtil.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        usernameField.sendKeys("ASKJDHASKJDHASKJDHAKJSHDAKSJHD");
        BrowserUtil.waitFor(3);
        actions.keyDown(Keys.CONTROL).sendKeys("A").sendKeys(Keys.BACK_SPACE).pause(2000).keyUp(Keys.CONTROL).perform();}

    @Test
    public void demonstratingBrowserCloseIssue(){
        WebOrderUtility_New.openWebOrderApp();

        Driver.getDriver().get("https:google.com");


    }

    @Test
    public  void isAllCheckedTest(){

        WebOrderUtility_New.openWebOrderApp();
        WebOrderUtility_New.login();
        WebOrderUtility_New.checkAll();
        BrowserUtil.waitFor(2);

        Assertions.assertTrue(WebOrderUtility_New.checkAll());

    }
    @Test
    public  void isAllUncheckedTest(){

        WebOrderUtility_New.openWebOrderApp();

        WebOrderUtility_New.login();
        WebOrderUtility_New.checkAll();
        WebOrderUtility_New.unCheckAll();
        System.out.println("its firefox");
        BrowserUtil.waitFor(2);

        Assertions.assertTrue(WebOrderUtility_New.unCheckAll());

    }

}
