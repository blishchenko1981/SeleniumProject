package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WAllProductPage {
    //you can store all elements one by one

     @FindBy(xpath = "//table[@class = 'ProductTable']//tr/th")
    private List<WebElement> allHeader ;

}
