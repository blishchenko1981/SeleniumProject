package com.cybertek.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibrarianAddNewUser {
    public static void main(String[] args) throws InterruptedException {
             //Credentials:
    //     librarian43@library
    //     librarian18@library


        String password = "Sdet2022*";
        String username = "";
        for (int i = 0; i < 2; i++) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            //Given librarian is on the homePage


            if (i == 0) {
                username = "librarian43@library";
            } else if (i == 1) {
                username = "librarian18@library";
            }

            driver.get("http://library2.cybertekschool.com/login.html");
            driver.manage().window().maximize();
            driver.findElement(By.id("inputEmail")).sendKeys(username);
            driver.findElement(By.id("inputPassword")).sendKeys(password);

            Thread.sleep(2000);
            driver.findElement(By.tagName("button")).click();

            Thread.sleep(2000);
//            When librarian click Users module
            driver.findElement(By.xpath("//*[@id='menu_item']/li[2]/a")).click();

            Thread.sleep(2000);
//            And librarian click “+Add User” button
            driver.findElement(By.xpath("//*[@id=\"users\"]/div[1]/div[1]/span/a")).click();
            Thread.sleep(2000);
//            When librarian enter full name, password, email and address
            String name = "Artem B";
            driver.findElement(By.name("full_name")).sendKeys(name);
            driver.findElement(By.name("password")).sendKeys("1111");
           if(i==0) {driver.findElement(By.name("email")).sendKeys("abcdfirst10@gmail.com");}
            if(i==1) {driver.findElement(By.name("email")).sendKeys("abcdsecond20@gmail.com");}
            driver.findElement(By.id("address")).sendKeys("335 Williams rd. Charlotte, NC");
//            And librarian click save changes
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"add_user_form\"]/div[2]/button[2]")).click();
            Thread.sleep(2000);
//            Then verify a new user is created

            if(driver.findElement(By.xpath("//*[@id=\"tbl_users\"]/tbody/tr[1]/td[3]")).getText().equals(name)){
                System.out.println("User  with name " + name +"has been created successfully");
            }


        }


    }
}
