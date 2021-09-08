package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingdropDownList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        // TODO: identify the year dropdown
        WebElement yearDroplownElm = driver.findElement(By.id("year"));
        // todo: Wrap it po using Select class so we can use easy methods
        Select yearSelectObj = new Select(yearDroplownElm);
        //todo: select items in # different ways
        // select 3 item
        yearSelectObj.selectByIndex(3);

        // select item with value attribute
        yearSelectObj.selectByValue("2019");
        yearSelectObj.selectByValue("1981");
        // select by text
        //yearSelectObj.selectByVisibleText("bla bla"); give us exception

        // todo month droplown

        WebElement monthDropdownElm = driver.findElement(By.id("month"));
        Select monthObj = new Select(monthDropdownElm);
        monthObj.selectByIndex(8);
        monthObj.selectByValue("7");
        monthObj.selectByVisibleText("August");





        // close the browser
      //  driver.quit();




    }
}
