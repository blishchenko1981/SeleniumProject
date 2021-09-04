package com.cybertek.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAtribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        WebElement firstlink = driver.findElement(By.linkText("A/B Testing"));


        System.out.println("firstlink.getText() = " + firstlink.getText());
        System.out.println("firstlink.getAttribute(\"href\") = " + firstlink.getAttribute("href"));

        driver.get("https://google.com");
        // identify search box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Artem Blishchenko");

        // get the class attribute
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));

        //maxlength
        System.out.println("searchBox.getAttribute(\"maxlength\") = " + searchBox.getAttribute("maxlength"));

        //title
        System.out.println(searchBox.getAttribute("title"));

        // autocapitalize="off"

        System.out.println("searchBox.getAttribute(\"autocapitalize=\\\"off\\\"\") = " + searchBox.getAttribute("autocapitalize=\"off\""));

        //data-ved
        System.out.println("searchBox.getAttribute(\"data-ved\") = " + searchBox.getAttribute("data-ved"));

        // aria-autocomplete

        System.out.println("searchBox.getAttribute(\"aria-autocomplete\") = " + searchBox.getAttribute("aria-autocomplete"));

        System.out.println("searchBox.getAttribute(\"autofocus\") = " + searchBox.getAttribute("autofocus"));

        boolean autofocus = Boolean.valueOf(searchBox.getAttribute("autofocus"));
        System.out.println("autofocus = " + autofocus);

        // using value attribute of input text box to extrsct the text inside

        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));

        //Homework
        //Identify the google search
        // class, type, value, anything else you can verify;



    }


}
