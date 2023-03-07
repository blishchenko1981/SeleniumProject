package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Radio_Button {


    // "http://practice.cybertekschool.com/radio_buttons"

    public static void main(String[] arg) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");


        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));
        WebElement yellowRadioButton = driver.findElement(By.id("yellow"));
        WebElement blackRadioButton = driver.findElement(By.id("black"));
        WebElement greenRadioButton = driver.findElement(By.id("green"));


        System.out.println("blueRadioButton.getAttribute(\"checked\") = "
                + blueRadioButton.getAttribute("checked"));

        System.out.println("redRadioButton.isSelected() = "
                + redRadioButton.isSelected());
        redRadioButton.click();
        System.out.println("click on Red__________________________--");
        System.out.println("redRadioButton.isSelected() = "
                + redRadioButton.isSelected());

        System.out.println("----------------------------------------------------");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        int count = 1;
        for (WebElement radioButton : radioButtons) {
            System.out.println("radioButton #" + count++
                    +" -- "+ radioButton.getAttribute("id"));

            System.out.println("radioButton.isEnabled() = "
                    + radioButton.isEnabled());

            System.out.println("radioButton.isSelected() = " + radioButton.isSelected());
            System.out.println("-----------------------------------");


        }

    }

}
