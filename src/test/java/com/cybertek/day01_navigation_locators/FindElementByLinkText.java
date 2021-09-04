package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {
    public static void main(String[] args) throws InterruptedException {

        //set up chrome driver. Open chrome
        WebDriverManager.chromedriver().setup();
        // navigate to https://google.com
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        //identify search box using both name and id
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Honda tires");
        Thread.sleep(3000);

        // submit search by clicking on search button
WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
searchBtn.submit();
        Thread.sleep(3000);
        //navigate back to google
        driver.navigate().back();

        //wait few seconds

        Thread.sleep(3000);
        //click on about link

        WebElement aboutLink = driver.findElement(By.linkText("Best Sellers"));
        aboutLink.click();
        Thread.sleep(2000);

        WebElement newReleases = driver.findElement(By.linkText("New Releases"));
        newReleases.click();

        WebElement headset = driver.findElement(By.className("a-carousel-card"));
        headset.click();

        //wait few sec
        Thread.sleep(3000);
       // driver.quit();





        }
}
