package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;

public class ExplicitWait2Test extends TestBase {


    @Test
            public void test() {

        //  WebOrderUtility.login(driver);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        WebOrderUtility.login( "Tester", "test");

        WebOrderUtility.isAtOrderPage(driver);

        BrowserUtil.waitFor(3);

        WebOrderUtility.logout(driver);
        BrowserUtil.waitFor(3);

        WebOrderUtility.login( "Tester", "test");
        WebOrderUtility.isAtOrderPage(driver);
        BrowserUtil.waitFor(3);


    }

}
