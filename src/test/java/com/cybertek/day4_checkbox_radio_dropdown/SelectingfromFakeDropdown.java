package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingfromFakeDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        // select will work ONLY on tag  is   SELECT

        // identify the fake dropdown, its actually a link

        WebElement fakeDropElm = driver.findElement(By.id("dropdownMenuLink"));
        fakeDropElm.click();
        //and "select the options -- its  actuallyanother lind

        driver.findElement(By.linkText("Google")).click();


    }
}