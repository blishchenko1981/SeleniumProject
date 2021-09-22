package com.cybertek.homeTask;

import com.cybertek.Utility.BrowserUtil;
import com.cybertek.Utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class HomeTaskActions extends TestBase {


    @Test
    public void homework() {


        //1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.

        driver.get("http://practice.cybertekschool.com/dropdown");
        String dropdownHandle = driver.getWindowHandle();
        //2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
              // id =dropdownMenuLink
        WebElement selectDrop =  driver.findElement(By.id("dropdownMenuLink"));
        selectDrop.click();

        //3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
        Actions actions = new Actions(driver);
        WebElement googleLink = driver.findElement(By.linkText("Google"));
        actions.moveToElement(googleLink)
                .keyDown(Keys.CONTROL)
                .click().pause(299)
                .keyUp(Keys.CONTROL)
                .perform();

        //4. It will open the link in new tab

        //5. Click on the Dropdown Link again to open it.
        selectDrop.click();
        BrowserUtil.waitFor(3);

        //6. Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.

        WebElement amazonLink = driver.findElement(By.linkText("Amazon"));
        actions.moveToElement(amazonLink)
                .keyDown(Keys.CONTROL)
                .click()
                .keyUp(Keys.CONTROL)
                .perform();
        BrowserUtil.waitFor(1);
        selectDrop.click();
        //7. It will open the link in another windows.
        //8. Repeat the same process for Facebook
        WebElement facebookLink = driver.findElement(By.xpath("//div/a[4]"));
        actions.moveToElement(facebookLink)
                .keyDown(Keys.CONTROL)
                .click()
                .keyUp(Keys.CONTROL)
                .perform();
        BrowserUtil.waitFor(1);

        //9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            System.out.println("driver.title = " + driver.getTitle());

            //10. Optionally , if the title contains Facebook, Close the window|tab.
            //11. Optionally, if the title contains Amazon , Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
            //"Try Prime" link , Verify it isDisplayed.

            if(driver.getTitle().equals("Facebook")){
                driver.close();
            }else if (
                driver.getTitle().contains("Amazon")
            ) {
                WebElement primeLink = driver.findElement(By.xpath("//a/span[text()= 'Prime']"));
                actions.moveToElement(primeLink).pause(3000).perform();
                WebElement primeWindow = driver.findElement(By.id("nav-flyout-prime"));
                Assertions.assertTrue(primeWindow.isDisplayed());

            }


        }




        //12. Optionally, if the title contains Etsy , Scroll until the Enter Your Email input box is in the view.
        //13. These excersize can be done separately instead of switching to the window, do your best judgement to do them together or separately.


    }
}
