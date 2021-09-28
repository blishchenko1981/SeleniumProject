package com.cybertek.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WebOrderUtility {

    public static  void openWebOrderApp(){
        //Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        Driver.getDriver().get(ConfigReader.read("weborder_url"));

    }

    public static void login(){

        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")) .sendKeys("test");
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

   public static void login( String userName, String password){


        // enter username
       Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        // enter password
       Driver.getDriver().findElement(By.id("ctl00_MainContent_password")) .sendKeys(password);
        // click login
       Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }



    public static void logout(WebDriver driverParam){
        driverParam.findElement(By.id("ctl00_logout")).click();
    }

    public static boolean isAtOrderPage(WebDriver driverParam){
        boolean result = false;
       // locator for the header element of all order page

        try {

            WebElement header = driverParam.findElement(By.xpath("//h2 [normalize-space(.)= 'List of All Orders']"));

            System.out.println("element was identify");
            result = true;
        }catch(NoSuchElementException e){
            System.out.println("no such element, not right page");
        }

        return result;
    }

    public static boolean verifyUserName (String username) {
        WebElement loginInfoArea = Driver.getDriver().findElement(By.cssSelector("div.login_info"));
        System.out.println("loginInfoArea.getText().contains(\"Tester\") = " + loginInfoArea.getText().contains("Tester"));

        return loginInfoArea.getText().contains(username);
    }

    public static String getUserNameFromWelcomeMessage () {
        WebElement loginInfoArea = Driver.getDriver().findElement(By.cssSelector("div.login_info"));
        String welcomeMessage = loginInfoArea.getText();

        return welcomeMessage.replace("Welcome, ", "").replace("! | Logout", "");
    }

    public static void selectSidebarTab(String tabName) {

        List<String> allTabs = Arrays.asList("View all orders", "View all products", "Order");
        if(allTabs.contains(tabName)){

            Driver.getDriver().findElement(By.linkText(tabName)).click();
        } else {  Driver.getDriver().findElement(By.linkText("View all orders")).click();
        }

    }

    // Check for login error message is visible or not , by calling the BrowserUtil
    public static boolean loginErrorMsgVisible(){
        boolean elementFound = BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.= 'Invalid Login or Password.']"), 3);
        return elementFound;

    }

}
