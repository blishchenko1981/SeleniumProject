package com.cybertek.pages;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {
    @FindBy(id= "ctl00_MainContent_username")
    public  WebElement userNameField;

    @FindBy(id= "ctl00_MainContent_password")
    public  WebElement passwordNameField;

    @FindBy(id = "ctl00_MainContent_login_button")
    public  WebElement loginBtn;

    @FindBy(xpath = "//span[.= 'Invalid Login or Password.']")
    public  WebElement errorMessage;




public WLoginPage(){   //THIS IS NO ARG CONSTRUCTOR OF THIS CLASS

    // page factory is a Selenium class that support Page Object Model
    // ,and it has method called initElements
    //it will locate element

    PageFactory.initElements(Driver.getDriver(), this);
}


//method navigate to login page, use config file

    public void goTo(){
    Driver.getDriver().navigate().to(ConfigReader.read("weborder_url"));
    }

    public void login(String username, String password){

        userNameField.sendKeys(username);
        passwordNameField.sendKeys(password);
        loginBtn.click();

    }

    // method return result if isDisplayed

    public boolean loginErrorMsgPresent (){
    return this.errorMessage.isDisplayed();
    }

}
