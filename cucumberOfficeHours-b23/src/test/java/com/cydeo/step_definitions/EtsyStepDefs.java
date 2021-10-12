package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefs {

    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        System.out.println("Welcome Landing Page");
        Driver.getDriver().get(ConfigReader.read("etsyUrl"));
    }
    @Then("user should see Etsy title as Expected")
    public void user_should_see_etsy_title_as_expected() {
        System.out.println("Title is verified");
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }
    @When("user types Wooden spoon in the search bar")
    public void user_types_wooden_spoon_in_the_search_bar() {
        EtsyPage etsyPage = new EtsyPage();
        etsyPage.searchBar.sendKeys("Wooden spoon");

    }

    @When("user clicks to search button")
    public void user_clicks_to_search_button() {
        EtsyPage etsyPage = new EtsyPage();
        etsyPage.searchButton.click();
    }

    @Then("user sees title is Wooden spoon | Etsy")
    public void user_sees_title_is_wooden_spoon_etsy() {
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
