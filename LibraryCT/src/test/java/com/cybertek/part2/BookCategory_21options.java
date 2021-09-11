package com.cybertek.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BookCategory_21options {
    //     Environment:
//     http://library2.cybertekschool.com/login.html
//
//    Users:
//    student54@library
//    student55@library
//    student56@library
//    librarian43@library
//    librarian18@library


    //    User story:
//    As a user, I want to filter book categories.


    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> users = new ArrayList<>();
        users.add("student54@library");
        users.add("student55@library");
        users.add("student56@library");
        users.add("librarian43@library");
        users.add("librarian18@library");

        String password = "Sdet2022*";
        for (String user : users) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://library2.cybertekschool.com/login.html");
            driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(user);
            driver.findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(password);

//  todo AC#1
  // Given user is on the homePage
            driver.findElement(By.xpath("//button[@type = 'submit']")).click();
            driver.manage().window().maximize();
            Thread.sleep(2000);

//    When user click Books module
            if(user.contains("student")){
driver.findElement(By.xpath("//ul[@id='menu_item']/li[1]/a")).click();
            }else{
                driver.findElement(By.xpath("//ul[@id='menu_item']/li[3]/a")).click();
            }
            Thread.sleep(2000);
//    And user click book category dropdown
            driver.findElement(By.cssSelector("select[id='book_categories']")).click();
            Thread.sleep(2000);
//    Then verify there are 21 options
            List<WebElement> options = driver.findElements(By.xpath("//select[@id='book_categories']/option"));
            System.out.println("options.size() = " + options.size());

            if(options.size()==21){
                System.out.println("Test for book categories by " + user+" Pass" );
            }else{
                System.out.println("Test for book categories by " + user+" Fail");
            }


            //todo AC #2:
            //Then verify user is able to selected the “Drama” option
            driver.findElement(By.xpath("//*[@id='book_categories']/option[7]")).click();
            System.out.println("text for option:" + driver.findElement(By.xpath("//*[@id='book_categories']/option[7]")).getText());
         String category =    driver.findElement(By.xpath("//*[@id='book_categories']/option[7]")).getText();
         if(category.equals("Drama")){
             System.out.println("Test for choose 'Drama' category by " + user + "Pass");
         }else{
             System.out.println("Test for choose 'Drama' category by " + user + "Fail");
         }



            driver.quit();
        }
}







}
