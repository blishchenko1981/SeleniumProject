package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatinByXPath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        // Xpath navigate through elements and attributes in a html document
        // /html/body/div/div[2]/div/div/div/h1/span
        // this is absolute XPATH
        //    //h1/span -- relative xpath, it starts with double slash






        // using full(absolute ) xpath to identify element
        WebElement headerElm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerElm.getText() = " + headerElm.getText());

        // using relative path   //h1/span: start looking for the elem. with h1 parent to find child with SPAN tag
        WebElement headerSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

        // providing attributes in xpath
        // elementTag[@attrinbuteName = 'attribute value]
//elementTag[@attrinbuteName = 'attribute value and @attrinbuteName2 = 'attribute value]]


        //*[@id="box2"]

        driver.findElement(By.xpath("//li/a[text()= 'Checkboxes']")).click();

        driver.findElement(By.xpath("//*[@id=\"box1\"]")).click();


    }
}
