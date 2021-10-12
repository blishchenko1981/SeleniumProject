package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = " //input[@id='prependedInput'] ")
    public WebElement userNameField;

    @FindBy(xpath = " //input[@id='prependedInput2'] ")
    public WebElement passwordField;

    @FindBy(xpath = " //button[@id='_submit'] ")
    public WebElement loginButton;

    @FindBy(xpath = " //div[text()='Invalid user name or password.'] ")
    public WebElement errorMsg;

    @FindBy(xpath = "//li/a[@class='dropdown-toggle']")
    public WebElement  logoutDropdown;

    @FindBy(xpath = "(//li[@class='last'])[3]")//li/a[.='Logout']
    public WebElement logoutBtn;
}
