package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_DropDown {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        // TODO: Identify language multi select dropdown

        WebElement langDropdownElm = driver.findElement(By.name("Languages"));
        Select langSelectObj = new Select(langDropdownElm);

        System.out.println("langSelectObj.isMultiple() = "
                        + langSelectObj.isMultiple());

        langSelectObj.selectByValue("c");
        langSelectObj.selectByVisibleText("Java");
        langSelectObj.selectByIndex(2);

        langSelectObj.deselectByValue("c");
        langSelectObj.deselectByVisibleText("Java");
        langSelectObj.selectByIndex(2);
        langSelectObj.deselectAll();


        // __________________  Fake Dropdown ____________________________


        // identify the fake dropdown, it's actually a link and select the options

        WebElement fakeDropdownElm = driver.findElement(By.id("dropdownMenuLink"));

        fakeDropdownElm.click();
        driver.findElement(By.linkText("Google")).click();











        driver.quit();
    }
}
