package com.cybertek.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Driver {
    private Driver(){}

    private static WebDriver obj;

    // return only one WebDriver instance

    public static WebDriver getDriver(){
        String browserName = ConfigReader.read("browser");

        if(obj== null){

            switch (browserName.toLowerCase()){

                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    obj = new EdgeDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    obj = new OperaDriver();
                    break;

                default:
                    obj = null;
                    System.out.println("UNKNOWN BROWSER TYPE!!! " + browserName);
            }


            obj.manage().window().maximize();
            return obj;
        }else{
            // System.out.println("you have it just use existing one");
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
