package com.cybertek.pages;

import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WAllOrderPage {

    @FindBy(xpath = "//h2[normalize-space(.) = 'List of All Orders']")
    public WebElement header;

    @FindBy(id = "ctl00_MainContent_btnCheckAll")
    public WebElement checkAllButton;

    @FindBy(id = "ctl00_MainContent_btnUncheckAll")
    public WebElement uncheckAllButton;

    @FindBy(xpath = "//table[@class = 'SampleTable']/tbody/tr[1]/th")
    public List<WebElement> headerCells;


    public WAllOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
