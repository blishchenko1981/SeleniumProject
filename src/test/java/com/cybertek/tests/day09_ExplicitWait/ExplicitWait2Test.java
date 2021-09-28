package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.Utility.BrowserUtil;
import com.cybertek.Utility.TestBase;
import com.cybertek.Utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

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
