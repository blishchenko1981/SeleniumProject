package com.cydeo.utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){}

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

  //  private static WebDriver obj;

    // return only one WebDriver instance

    public static WebDriver getDriver(){
        String browserName = ConfigReader.read("browser");
// get method from InherritableThreadLocal willcheck if wwe have object in this thread or not
        if(driverPool.get() == null){

            switch (browserName.toLowerCase()){

                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driverPool.set( new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driverPool.set(new OperaDriver());
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions option = new ChromeOptions();
                    option.setHeadless(true);
                    driverPool.set(new ChromeDriver(option));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                default:
            //        obj = null;
                    System.out.println("UNKNOWN BROWSER TYPE!!! " + browserName);
            }


          //  obj.manage().window().maximize();
            return driverPool.get();
        }else{
            // System.out.println("you have it just use existing one");
            return driverPool.get();
        }

    }

    public static void closeBrowser(){

        // check if we have WebDriver instance or not
        // basically checking if obj is null or not
        // if not null
        // quit the browser
        // make it null , cz once quit it can not be used;

        if(driverPool.get()!= null ){
            driverPool.get().quit();
            driverPool.set(null); // so when ask it again , it gives us not quited fresh driver
        }

    }
}
