package com.cybertek.pages;

import com.cybertek.Utility.ConfigReader;
import com.cybertek.Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibLoginPage {

    @FindBy(id= "inputEmail")
    public  WebElement userNameField;

    @FindBy(id= "inputPassword")
    public  WebElement passwordNameField;

    @FindBy(tagName = "button")
    public  WebElement loginBtn;

    public LibLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){

        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void logIn(String user){

        userNameField.sendKeys(user);
        passwordNameField.sendKeys(ConfigReader.read("password"));
        loginBtn.click();


    }



}
