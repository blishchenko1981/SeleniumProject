package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleHomePage;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class GoogleSearchStepDef {
    GoogleHomePage homePage = new GoogleHomePage();
    @Given("user is at home page")
    public void user_is_at_home_page() {
        homePage.goTo();

    }
    @When("user search for keyword {string}")
    public void user_search_for_keyword(String keyword) {
    homePage.searchKeyword(keyword);

    }
    @Then("we should see result page")
    public void we_should_see_result_page() {
        System.out.println("I can check title in the next method");
    }
    @Then("the title should start with {string}")
    public void the_title_should_start_with(String keyword) {
    assertTrue(Driver.getDriver().getTitle().startsWith(keyword));
    }

    @Given("user is at home page Google")
    public void user_is_at_home_page_google() {

        homePage.goTo();

    }
    @When("user search for word {string}")
    public void user_search_for_word(String word) {
      homePage.searchKeyword(word);
    }
    @Then("user should navigate result page")
    public void user_should_navigate_result_page() {
        System.out.println("User on home page");
    }
    @Then("title should start with {string}")
    public void title_should_start_with(String word) {
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith(word));
    }




}
