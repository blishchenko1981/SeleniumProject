package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_CheckBox {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        System.out.println("checkbox1.getAttribute(\"checked\") = "
                + checkbox1.getAttribute("checked"));

        System.out.println("checkbox2.getAttribute(\"checked\") = "
                + checkbox2.getAttribute("checked"));
        System.out.println("_______________________________________________");
        checkbox1.click();
        checkbox2.click();
        System.out.println("checkbox1.getAttribute(\"checked\") = "
                + checkbox1.getAttribute("checked"));

        System.out.println("checkbox2.getAttribute(\"checked\") = "
                + checkbox2.getAttribute("checked"));

        if(! checkbox1.isSelected()){
            checkbox1.click();
        }else{
            System.out.println("checkbox already selected" );
        }

        if(! checkbox2.isSelected()){
            checkbox2.click();
        }else{
            System.out.println("checkbox already selected" );
        }


        //driver.quit();

    }
}
