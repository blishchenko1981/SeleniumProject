package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPages;
import com.cydeo.utility.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert.*;

public class SauseDemoLoginSteps<LoginPage> {

     LoginPages loginPage = new LoginPages();
    //ProductPage productPage = new ProductPage();



    @Given("I am at sauce demo login page")
    public void i_am_at_sauce_demo_login_page() {

        System.out.println("I am at sauce demo login page");

        loginPage.goTo("sause_url");


    }

    @When("I provide correct credentials for {string} user")
    public void i_provide_correct_credentials_for_user(String userType) {

        System.out.println("I provide correct credentials for " + userType+" user");

         loginPage.loginAs(userType);

    }

    @Then("I should see the product page")
    public void i_should_see_the_product_page() {

        System.out.println("I should see the product page");

           // Assert.assertTrue productPage.isAt()
    }
}
