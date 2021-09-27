package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.Utility.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebOrderTest  extends TestBase {

    @Test
    public void  loginLogoutTest(){
        WebOrderUtility_New.openWebOrderApp();
        WebOrderUtility_New.login("Tester", "test");

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

}
