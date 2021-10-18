package com.cydeo.step_definitions;

import com.cydeo.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    // we can set up hook class that contain method that run before and after each scenario
    // or even when we learn tags

    @Before("@ui")
    public void setup(){
        System.out.println("THIS IS ADD BEFORE HOOKS CLASS");
        //set up implicit wait
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Driver.getDriver().manage().window().maximize();
    }

    @After("@ui")
    public void tearDown(Scenario scenario){

        // check if scenario failed or not
        if(scenario.isFailed()){
            // this is how we take screenshot in selenium

            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "whatever you want");


        }

        System.out.println("THIS IS ADD AFTER HOOKS CLASS");

        Driver.closeBrowser();
    }

}
