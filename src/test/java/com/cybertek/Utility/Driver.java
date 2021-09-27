package com.cybertek.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver(){}

    private static WebDriver obj;

    // return only one WebDriver instance

    public static WebDriver getDriver(){
        if(obj== null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            System.out.println("one object created only for the first time");
            return obj;
        }else{
            return obj;
        }

    }

    public static void closeBrowser(){

        // check if we have WebDriver instance or not
        // basically checking if obj is null or not
       // if not null
            // quit the browser
        // make it null , cz once quit it can not be used;

        if(obj != null ){
            obj.quit();
            obj = null; // so when ask it again , it gives us not quited fresh driver
        }

    }

}
