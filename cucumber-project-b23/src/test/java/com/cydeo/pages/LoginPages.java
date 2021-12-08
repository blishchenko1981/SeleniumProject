package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {


    public LoginPages (){

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginBtn;




    public void goTo(String sause_url) {
        Driver.getDriver().get(ConfigReader.read(sause_url));
    }

    public void loginAs(String userType) {

        String userName = ConfigReader.read(userType +"_user");
        String password = ConfigReader.read("password");
        this.username.sendKeys(userName);
        this.password.sendKeys(password);
        this.loginBtn.submit();



    }
}
