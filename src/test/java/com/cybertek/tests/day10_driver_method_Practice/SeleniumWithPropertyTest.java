package com.cybertek.tests.day10_driver_method_Practice;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility_New;
import org.junit.jupiter.api.Test;

public class SeleniumWithPropertyTest extends TestBase {
    @Test
    public void testWebOrderLogin(){

        // use ConfigReader everywhere

        // navigate by passing value you got from properties file
       String url = ConfigReader.read("weborder_url");
        String username = ConfigReader.read("weborder_username");
        String password = ConfigReader.read("weborder_password");

        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);

        Driver.getDriver().get(url);
        //Driver.getDriver().get(ConfigReader.read("weborder_url"));
        WebOrderUtility_New.login(username, password);

        System.out.println("END");


    }
}
