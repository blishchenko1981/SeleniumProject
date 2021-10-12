package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {


        public EtsyPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(id = "global-enhancements-search-query")
        public WebElement searchBar;


        @FindBy(xpath= "//button[@value='Search']")
        public WebElement searchButton;




    }

