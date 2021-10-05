package com.cybertek.usersStories_properties_fake;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.LibraryUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookCategory_21options extends TestBase {


    //    User story:
//    As a user, I want to filter book categories.

    ArrayList<String> users;

    @Test
    public void BookCategory() {
        users = new ArrayList<>();
        users.add(ConfigReader.read("student1"));
        users.add(ConfigReader.read("student2"));
        users.add(ConfigReader.read("student3"));
        users.add(ConfigReader.read("librarian1"));
        users.add(ConfigReader.read("librarian2"));

            for (String user : users) {
            LibraryUtility.goToLoginPage();
            LibraryUtility.loginFunction(user);

            //    When user click Books module
            WebElement bookModule =   driver.findElement(By.xpath("//span[text()= 'Books']"));
            bookModule.click();

            //    And user click book category dropdown
            driver.findElement(By.cssSelector("select[id='book_categories']")).click();

            //    Then verify there are 21 options
            List<WebElement> options = driver.findElements(By.xpath("//select[@id='book_categories']/option"));
            System.out.println(user + "options.size() = " + options.size());

            Assertions.assertTrue(options.size() == 21);


            //todo AC #2:
            //Then verify user is able to selected the “Drama” option

            WebElement categoryOfBoooks = driver.findElement(By.xpath("//select[@id= 'book_categories']"));
            Select category = new Select(categoryOfBoooks);
            category.selectByValue("6");

            Assertions.assertTrue(category.getFirstSelectedOption().getText().equals("Drama"));

                BrowserUtil.waitFor(4);
            LibraryUtility.logoutFunction();

        }
    }


}
