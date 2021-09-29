package com.cybertek.tests.day11_property_driver_faker_pom;

import com.cybertek.Utility.BrowserUtil;
import com.cybertek.Utility.TestBase;
import com.cybertek.pages.WAllOrderPage;
import com.cybertek.pages.WCommonArea;
import com.cybertek.pages.WLoginPage;
import com.cybertek.pages.WOrderPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderPOM_Test extends TestBase {



    @Test
    public void testWithPOM_for_login(){


        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("222Tester", "test");

        assertTrue(loginPage.loginErrorMsgPresent());

        BrowserUtil.waitFor(4);
    }

    @Test
    public void testAllOrderPage(){
        WLoginPage loginPage  = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");
        // here we logged in

        // now we are at all order page

        WAllOrderPage allOrderPage = new WAllOrderPage();
        // assert the header is displayed
        assertTrue(allOrderPage.header.isDisplayed());


        allOrderPage.checkAllButton.click();
        BrowserUtil.waitFor(2);

        allOrderPage.uncheckAllButton.click();
        BrowserUtil.waitFor(2);


        // print out the size of headerCells

        System.out.println("allOrderPage.headerCells.size() = "
                + allOrderPage.headerCells.size());


        Assertions.assertEquals(13, allOrderPage.headerCells.size());

    }

    @Test
    public void testCommonArea() {

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WCommonArea commonArea = new WCommonArea();

        commonArea.orderTab.click();
        BrowserUtil.waitFor(2);

        commonArea.viewAllProductTab.click();
        BrowserUtil.waitFor(2);

        commonArea.viewAllOrderTab.click();
        BrowserUtil.waitFor(2);

        commonArea.logoutLink.click();
        BrowserUtil.waitFor(2);

    }
        @Test
                public void testOrderFlow(){

            WLoginPage loginPage = new WLoginPage();
            loginPage.goTo();
            loginPage.login("Tester","test");
            // --- here we logged in

            WCommonArea commonArea = new WCommonArea() ;

            commonArea.orderTab.click();
            BrowserUtil.waitFor(2);

            WOrderPage orderPage = new WOrderPage();
            orderPage.quantityBox.sendKeys(Keys.BACK_SPACE + "10");
            orderPage.calculateButton.click();

            Faker faker = new Faker();
            orderPage.customerNameBox.sendKeys(faker.name().fullName());
            orderPage.streetBox.sendKeys(faker.address().streetAddress());
            orderPage.cityBox.sendKeys(faker.address().city());
            orderPage.stateBox.sendKeys(faker.address().state());
            orderPage.zipBox.sendKeys(faker.numerify("#####"));

            orderPage.visaRadioButton.click();
            orderPage.cardNumber.sendKeys(faker.numerify("#################"));
            orderPage.cardDate.sendKeys(faker.numerify("0#/0#"));

            orderPage.processButton.click();

            BrowserUtil.waitFor(5);







        }




    }


