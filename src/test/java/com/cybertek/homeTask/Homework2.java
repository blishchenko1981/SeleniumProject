package com.cybertek.homeTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework2 {
    public static void main(String[] args) {
        //1. navigate to https://google.com

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        //2. search for `selenium`

        driver.findElement(By.name("q")).sendKeys("selenium   ");
        //3. click google search button
        driver.findElement(By.name("btnK")).submit();

        //4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
        //5. get the text of that element

       String about = driver.findElement(By.id("result-stats")).getText();
        System.out.println(about);
        //6. Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
        //7. get all the link that contain text `selenium` into a List<WebElement>
        List<WebElement> list = driver.findElements(By.partialLinkText("selenium"));


        //8. get the count
        System.out.println("list.size() = " + list.size());

        //9. get the first one text
        System.out.println("list.get(0) = " + list.get(0));
        //10. get the last one text
        System.out.println(list.get(list.size() - 1));
        //11. iterate over the list and print the text of each link

        for (WebElement webElement : list) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }
        //12. watch the short to learn more about `findElement(By.tagName("tag here"))


        //13. watch the short to learn more about `element.getAttribute("attribute goes here")`


        //driver.close();
    }
}
