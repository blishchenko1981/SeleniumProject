package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    public GoogleHomePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void goTo() {
        Driver.getDriver().get(ConfigReader.read("google.url"));
    }

    public void searchKeyword(String keyword) {// keyword ---> text u want to search on google

        this.searchBox.sendKeys(keyword);
        this.searchBtn.click();
    }

    public boolean isAt() {

        return Driver.getDriver().getTitle().equals("Google");


    }


}
