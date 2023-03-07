package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

    public static void main(String[] arg) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        // TODO: Identify the year dropdown
        WebElement yearDropdownElm = driver.findElement(By.id("year"));

        // TODO: Wrap it up using Select class so we can use easy methods
        Select yearSelectObj = new Select(yearDropdownElm);

        // TODO: select items in 3 different ways

        // Select 3 rd item
        yearSelectObj.selectByIndex(2);
        // Select item with value attribute 2019
        yearSelectObj.selectByValue("2019");
        // Select item with visible text 1990
        yearSelectObj.selectByVisibleText("1990");


        System.out.println("---------------------------------------------------");

        WebElement monthDropdownElm = driver.findElement(By.id("month"));
        Select monthSelectObj = new Select(monthDropdownElm);

        monthSelectObj.selectByIndex(4);
        monthSelectObj.selectByValue("7");
        monthSelectObj.selectByVisibleText("December");









        driver.quit();


    }


}
