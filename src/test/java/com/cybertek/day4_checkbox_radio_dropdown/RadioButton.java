package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locate the blue radio button
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());

        blueRadio.click();// nothing will happen its already selected

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());


        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        // Any element can use isEnabled() method to check whether element is disabled or not
        // one can not take any action on disabled element
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        // a redio group is grouped by its name attribute
        //all radio but related to color has name color in this case
        List<WebElement> allColorRadio = driver.findElements(By.name("color"));
        System.out.println("allColorRadio.size() = " + allColorRadio.size());

        // check the size to see how many radio button identified

        allColorRadio.get(2).click();

        // loop over all elements to print these : id attribute, isSelected , isEnabled

        for (WebElement element : allColorRadio) {
            System.out.println("----------------------------------------");
            System.out.println("element.getAttribute(\"id\") = " + element.getAttribute("id"));
            System.out.println("element.isSelected() = " + element.isSelected());
            System.out.println("element.isEnabled() = " + element.isEnabled());
        }

        driver.quit();
    }
}
