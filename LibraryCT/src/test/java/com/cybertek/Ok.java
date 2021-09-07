package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ok {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ok.ru/");
        driver.findElement(By.name("st.email")).sendKeys("vitalii");
        driver.findElement(By.name("st.password")).sendKeys("111222333");
        System.out.println("next step");


        driver.findElement(By.className("button-pro __wide")).click();





    }
}
