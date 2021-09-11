package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithWrongCredentials {
    public static void main(String[] args) throws InterruptedException {
        //Valid Credentials:
        // student54@library
        //student55@library
        //student56@library
        //  password = "Sdet2022*";
        String username = "";
        String password = "";


        for (int i = 1; i <= 2; i++) {

            if(i==1){
                 username = "student54@library" ;
                 password ="11111111";
            }else if (i==2){
                username = "student@1111111" ;
                password = "Sdet2022";
            }


            //Given user is on the loginPage
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://library2.cybertekschool.com/login.html");
            //When user enters invalid email address or password
            driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(username);
            driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys(password);
            Thread.sleep(3000);
            //And student click sign in button
            driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();

            Thread.sleep(3000);
            //Then verify the error message “Sorry, Wrong Email or Password”

           String test =(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div")).getText());

           if(test.equals("Sorry, Wrong Email or Password"))
           {
               System.out.println("Negative test for wrong credentials #"+ i +" user: "+ username + ", password: "+password+ " Passed");
           }else {
               System.out.println("Negative test for wrong credentials # "+ i + " Failed");
           }
            driver.quit();
        }
    }
}