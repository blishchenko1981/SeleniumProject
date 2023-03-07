package com.cybertek.day4_checkbox_radio_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) {

        //     /html/body/div/div[2]/div/div/div/h1/span

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());
        System.out.println("headerSpan.getCssValue(\"font-family\") = " + headerSpan.getCssValue("font-family"));

        WebElement headerSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());


        // providing attributes in xpath
        // elementTag[@attributeName= 'attribute value']
        // if you have more than one
        //elementTag[@attributeName= 'attribute value' and @attributeName2 = 'attribute2 value']
        // we can use index //element[index]
        // we can provide text() xpath function
        // // elementTag

//TODO: use all those methods
        //    input[@id='box1']
        driver.findElement(By.xpath("//li/a[text()='Checkboxes']")).click();
        // identify header, 1st checkbox
        WebElement header = driver.findElement(By.xpath("//h3[text()= 'Checkboxes']"));
        System.out.println("header.getText() = " + header.getText());
        WebElement firstCheckbox = driver.findElement(By.xpath("//input[@id='box1']"));
        firstCheckbox.click();
        System.out.println("firstCheckbox.isSelected() = " + firstCheckbox.isSelected());
        //  driver.quit();


        System.out.println("______________  CSS practice _____________________________");
        // form input[name='email'] ,  button[id='form_submit']

        driver.get("http://practice.cybertekschool.com/forgot_password");


        System.out.println("all text for div with id = 'content'  " + driver.findElement(By.xpath("//div[@id='content']")).getText());
        WebElement emailBox = driver.findElement(By.cssSelector("form input[name='email']"));
        emailBox.sendKeys("blishchenko1982@gmail.com");
        driver.findElement(By.cssSelector("button#form_submit")).click();

        WebElement confirmationMsg = driver.findElement(By.cssSelector("div.container h4[name='confirmation_message']"));

        System.out.println("confirmationMsg.getText() = " + confirmationMsg.getText());


        //locate 2 elements using css selector

        driver.navigate().back();
        driver.navigate().refresh();

        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.= 'Forgot Password']"));
        System.out.println("forgotPasswordHeader.getText() = " + forgotPasswordHeader.getText());
        WebElement emailBox2 = driver.findElement(By.xpath("//input[@name = 'email']"));
        emailBox2.sendKeys("blishchenko1982@gmail.com");
        WebElement retrieveBtn = driver.findElement(By.xpath("//*[@id= 'form_submit']"));
        retrieveBtn.click();

        String confirmLocator = "//h4[@name = 'confirmation_message']";
        WebElement confirmationMsg2 = driver.findElement(By.xpath(confirmLocator));


        System.out.println("confirmationMsg2.getText() = " + confirmationMsg2.getText());


    }


}
