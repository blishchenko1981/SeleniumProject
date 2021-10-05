package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WOrderPage {


    @FindBy(xpath = "//h2[normalize-space(.)='Order']")
    public WebElement header ;

    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown ;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement priceBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discountBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement totalBox ;

    @FindBy(css="input[type='submit'][value='Calculate']")
    public WebElement calculateButton ;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox ;

    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaRadioButton ;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber ;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement cardDate ;

    @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton ;



    public WOrderPage(){
        PageFactory.initElements(Driver.getDriver(),  this);
    }

}


