package com.cybertek.day5_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");


        WebElement emailBox = driver.findElement(By.cssSelector("input[type = 'text'][name= 'email']"));

        emailBox.sendKeys("vvvleningrad@spb.ru");

        WebElement submit =driver.findElement(By.cssSelector("form>button[id]"));
        submit.click();

        WebElement confMessage = driver.findElement(By.cssSelector("h4[name = 'confirmation_message']"));
        System.out.println("confMessage.getText() = " + confMessage.getText());


        driver.close();

    }
}
