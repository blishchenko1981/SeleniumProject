package com.cybertek.Utility;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class WebOrderUtility_New {

    public static void openWebOrderApp() {
        //Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        Driver.getDriver().get(ConfigReader.read("weborder_url"));

    }

    public static void login() {

        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void login(String userName, String password) {


        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }


    public static void logout() {
        Driver.getDriver().findElement(By.id("ctl00_logout")).click();
    }

    public static boolean isAtAllOrderPage() {
        boolean result = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
        // locator for the header element of all order page

        try {

           // wait.until(ExpectedConditions.urlToBe("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx"));
           wait.until(visibilityOfElementLocated(By.xpath("//h2[ normalize-space(.) = 'List of All Orders']")));
            result = true;
            System.out.println("At the right page");
        } catch (TimeoutException e) {
            System.out.println("Not at order page" + e.getMessage());
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

    public static boolean checkAll() {

        WebElement checkAllBtn = Driver.getDriver().findElement(By.linkText("Check All"));
        checkAllBtn.click();
        ////input[@type = 'checkbox']


        List<WebElement> checkbox = Driver.getDriver().findElements(By.xpath("//input[@type = 'checkbox']"));
       boolean allChecked = false;
        for (WebElement webElement : checkbox) {
            if(!webElement.isSelected()){
                allChecked = false;
                break;
            }else{
                allChecked = true;
            }

        }

return allChecked;
    }


    public static boolean unCheckAll() {

        WebElement checkAllBtn = Driver.getDriver().findElement(By.linkText("Uncheck All"));
        checkAllBtn.click();
        ////input[@type = 'checkbox']


        List<WebElement> checkbox = Driver.getDriver().findElements(By.xpath("//input[@type = 'checkbox']"));
        boolean allUnchecked = false;
        for (WebElement webElement : checkbox) {
            if(webElement.isSelected()){
                allUnchecked = false;
                break;
            }else{
                allUnchecked = true;
            }

        }

        return allUnchecked;
    }

}