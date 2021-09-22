package com.cybertek.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver(){}

    private static WebDriver obj;

    public static WebDriver getDriver(){
        if(obj== null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            System.out.println("one object created only for the first time");
            return obj;
        }else{
            System.out.println("you already have this object");
            return obj;
        }

    }


}
