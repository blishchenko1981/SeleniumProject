package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DinamicTablePractice {

    @Test
    public void testTable() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/web-table-element.php");

        List<WebElement> listOfCompanyNames = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]/a"));

        for (WebElement eachName : listOfCompanyNames) {

            System.out.println("eachName.getText() = " + eachName.getText());
        }

        System.out.println("rows number " + listOfCompanyNames.size());

        List<WebElement> allColumns = driver.findElements(By.xpath("//table[@class = 'dataTable']//th"));

        System.out.println("allColumns.size() = " + allColumns.size());
        for (WebElement each : allColumns) {
            System.out.println("each.getText() = " + each.getText());

        }

//        for (WebElement eachName : listOfCompanyNames) {
//
//            Thread.sleep(2000);
//            if(eachName.getText().equalsIgnoreCase("Jet Airways")){
//                Thread.sleep(5000);
//                eachName.click();
//                Thread.sleep(3000);
//                break;
//                //Guru99
//            }
//
//        }

          listOfCompanyNames.get(1).click();
        Assertions.assertTrue(driver.getTitle().contains("Guru99"));
        driver.quit();
    }

}
