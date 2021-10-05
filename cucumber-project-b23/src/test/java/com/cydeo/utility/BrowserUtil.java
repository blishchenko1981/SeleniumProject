package com.cydeo.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserUtil {
    // a method to pause the thead certain seconds
    public static void waitFor(int second){
        try {
            Thread.sleep(second *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    // method will check for visibility of elements within the time given
    public static boolean checkVisibilityOfElement(By locator, int  timeToWait){

        boolean result = false;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWait);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            result = true;

        }catch (
                TimeoutException e){
            System.out.println("e.getMessage() = " + e.getMessage());

            System.out.println("we did not see the error mellage element");
        }


        return result;
    }

}
