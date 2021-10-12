package com.cydeo.step_definitions;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefs {
    @Given("User is on Google Home Page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get(ConfigReader.read("googleUrl"));
    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle="Google";

        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
